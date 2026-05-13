package Ch16;

import java.util.ArrayList;

//(1) 문자열 → 정수변환
interface StrToInt {
	int convert(String s);
}

// (2) 문자열을 받아 출려만 (반환없음)
interface StrConsumer {
	void accept(String s);
}

// (2) 테스트 클래스
class C04Person {
	String name;
	int age;
	C04Person(){}
	C04Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	static void print(String s) {
		System.out.println("Person's print : " + s);
	}
}

// (3) 문자열 → 변형된 문자열 반환
interface StrToStr {
	String apply(String s);
}

// (4) 생성자 참조
interface PersonFactory {
	C04Person create();
}
interface PersonFactory2 {
	C04Person create(String name, int age);
}
interface ListFactory {
	ArrayList<String> create();
}

public class C04MethodReferenceMain {

	// (1) 정적 메서드 참조 실습용
	public static int toLength(String s) {
		return s.length();
	}

	public static void main(String[] args) {
		// (1) 문자열 → 정수변환
		StrToInt t1 = s -> Integer.parseInt(s); // 람다
		StrToInt t2 = Integer::parseInt; // 메소드참조형(::)
		StrToInt t3 = C04MethodReferenceMain::toLength;

		System.out.println("(1-1) 랃다 : " + t1.convert("123"));
		System.out.println("(1-2) 메서드 참조 : " + t2.convert("456"));
		System.out.println("(1-3) 메서드 참조(기존함수) : " + t3.convert("456"));

		// (2) 문자열을 받아 출려만 (반환없음)
		StrConsumer t4 = (s) -> {
			System.out.println(s);
		};
		StrConsumer t5 = System.out::println;
//		StrConsumer t6 = (s)->{C04Person.print(s);};
		StrConsumer t6 = C04Person::print;

		t4.accept("(2-1) Hello World");
		t5.accept("(2-2) Hello World");
		t6.accept("(2-2) Hello World");

		// (3) 문자열 → 변형된 문자열 반환
		StrToStr t7 = (s) -> {
			return s.toUpperCase();
		};
		StrToStr t8 = String::toUpperCase;

		System.out.println("(3-1) : " + t7.apply("hello"));
		System.out.println("(3-2) : " + t8.apply("hello"));
		
		// (4) 생성자 참조
		PersonFactory t9 = ()->{return new C04Person();};
		PersonFactory t10 = C04Person::new;
		PersonFactory2 t11 = C04Person::new;
		
		System.out.println("(4-1) "+t9.create());
		System.out.println("(4-1) "+t10.create());
		System.out.println("(4-1) "+t11.create("홍길동",11));
		
		ListFactory t12 = ()->{return new ArrayList<>();};
		ListFactory t13 = ArrayList::new;
		
	}

}
