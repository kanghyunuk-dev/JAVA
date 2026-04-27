package Ch03;

class C04Person {
	String name;
	int age;
	
	//디폴트 생성자
	public C04Person() {
		super();
	}
	//모든인자 생성자
	public C04Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//toString 재정의	
	@Override
	public String toString() {
		return "C04Person [name=" + name + ", age=" + age + "]";
	}
}

public class C04ClassArrayMain {

	public static void main(String[] args) {
//		C04Person c04person = new C04Person("홍길동", 15);
//		System.out.println(c04person);
		C04Person list[] = new C04Person[3]; // 객체를 보관하기 위한 참조변수 요소를 만든 상태
		
		//클래스 자료형으로 배열을 만들때
		//객체생성 해야 진행가능
		list[0] = new C04Person();
		list[0].name = "홍길동";
		list[0].age = 55;
		
		list[1] = new C04Person();
		list[1].name = "김영희";
		list[1].age = 35;
		
		list[2] = new C04Person();
		list[2].name = "김범수";
		list[2].age = 40;
		
		for(C04Person person : list) {
			System.out.println(person);
		}
		
		
		
		
	}

}
