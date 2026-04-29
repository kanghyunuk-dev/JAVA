package Ch06;

// 일반클래스 상속관계
// 재정의하지 않고 쓰기, 재정의하기 선택해서 사용 가능
class Parent1 {
	//
	void func() {}
}

class Son1 extends Parent1 {
	void func() {System.out.println("Son1's 에서 재정의 한 func...");}
}

// 추상클래스 : 추상메서드 포함한 클래스(미완성 클래스 -> 객체생성불가), 구현은 나중 - 설계먼저(구현설정은 강제)
// 추상클래스 상속관계
abstract class Parent2 {
	// 추상메서드
	abstract void func();
}
// 구현 강제 -> 구현하지않으면 에러
class Son2 extends Parent2 {
	@Override
	void func() {
		System.out.println("Son2's 에서 재정의한 func...");
	}
}
class Son3 extends Parent2 {
	@Override
	void func() {
		System.out.println("Son3's 에서 재정의한 func...");
	}
	
}

public class AbstractMain {

	public static void main(String[] args) {
		// 일반클래스 간 상속관계
//		Parent1 ob1 = new Parent1();// 상위클래스형 객체 생성 o
//		Son1 ob2 = new Son1();		// 하위클래스형 객체 생성 o
//		Parent1 ob3 = new Son1();	// UPCASTING 연결 o
//		ob3.func();					// 재정의된 func() 접근 o
		
		// 추상클래스 상속관계 - 강제성, UPCASTING 연결하기위함
//		Parent2 ob4 = new Parent2();// 상위클래스형 객체 생성 x (abstract - 미완성클래스)
		Son2 ob5 = new Son2();		// 하위클래스형 객체 생성 o (상위 클래스의 추상메서드를 재정의 해야 가능 - 상위클래스의 미완성 함수를 완성 즉, 오바라이딩 해야 가능)
		Parent2 ob6 = new Son2();	// UPCASTING 연결 o
		ob6.func();
		ob6 = new Son3();
		ob6.func();
	}

}








