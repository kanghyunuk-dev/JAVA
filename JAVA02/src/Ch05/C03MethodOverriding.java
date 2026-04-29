package Ch05;

// 함수 재정의(Method Overriding)
// 상속관계를 전제로 상위클래스의 메서드를 하위클래스가 재정의(함수의Body를 고쳐사용)하는 것을 허용한 문법
// 메서드의 헤더부분은 동일하고 본문({}) 의 로직을 수정 할 수 있게 허용함으로서 다양한 형태의 객체가 형성
// 될 수 있도록 유도(다형성의 근거가 될 수 있는 문법 중의 하나)
// 상위 클래스로 부터 동일한 메서드를 물려받더라도 각 하위 클래스마다 다른기능구현의 결과물을 만들어 낼 수 있다.

// 오버로딩 vs 오버라이딩
// 오버로딩
// 1) 상속전제 x (상속이든 아니든 다 사용 가능)
// 2) 함수 헤더 변경? o 반환자료형 고셔사항아님, 함수명 고정, 파라미터 변동
// 3) 함수 본문 변경? x 
// 4) 목적 : 같음 함수에 여러 인자를 받기 -> 개발편의성 (함수이름은 고정)

// 오버라이딩
//1) 상속전제 o (상속 관계에서만 사용가능)
//2) 함수 헤더 변경? x (물려받은 그대로 사용)
//3) 함수 본문 변경? o  
//4) 목적 : 다형성

//class Animal {
//	void sound() {System.out.println("소리낸다!");}
//}
//class Dog extends Animal {
//	// 오버라이딩
//	void sound() {System.out.println("멍멍");};
//}
//class Cat extends Animal {
//	@Override
//	void sound() {
//		System.out.println("야용 소리낸다!!");
//	}
//}
//
//public class C03MethodOverriding {
//
//	public static void main(String[] args) {
//		Dog tori = new Dog();
//		tori.sound();
//		System.out.println("-----------------");
//		Cat navi = new Cat();
//		navi.sound();
//	}
//
//}
