package Ch05;

class Super {
	int n1;
}

class Sub extends Super {
	int n2;
}


public class C06UpDownCastingMain {

	public static void main(String[] args) {
		//casting : 형변환
		
		//NoCasting : 형변환x
		Super ob1 = new Super();
		ob1.n1 = 10;
		
		Sub ob2 = new Sub();
		ob2.n1 = 10;
		ob2.n2 = 20;
		
//		맨앞 참조클래스가 기준
		//Upcasting	[★★★★★] : 상위클래스형 참조변수 = 하위클래스형 객체
//							: 자동형변환(메모리영역의 침범우려 우려가 없기 때문에)
//		이유					: 1) !상속관계로 구성된 모든 하위객체를 연결 할 수 있다
//							: 2) !Upcasting된 상태에서는 재정의된 메서드에 접근 가능하다
		Super ob3 = new Sub(); // Super 로 생성 -> n1 까지만 전급가능, 자동형변환되는 이유 -> upcating은 부모 보다 자식 범위가 더 크다 -> 자동형변환 가능
		ob3.n1 = 10;
		
		Super ob4 = ob2; // UPCATING
		ob2.n1 = 10; // ob2는 sub class 범위까지 접근가능
		ob2.n2 = 10; // ob2는 sub class 범위까지 접근가능
		ob4.n1 = 10; // ob4는 Super class 범위까지 접근가능
//		ob4.n2 = 10; // ob4는 Super class 범위까지 접근가능 -> ob.n2 는 존재하지만 참조하는 범위가 n1 까지만 참조
		
	    //Downcasting [★★★★] : 하위클래스형 참조변수 = 상위클래형 객체 -> upcasting 된 상위 클래스의 하위 클래스는 상위클래스의 범위까지만 접근 가능 -> dowincasting 을 통해 하위 범위까지 접근 가능하도록 하기위함
//								-> upcating  진행하고 -> 필요한 영역을 downcasting 진행
//								: 강제형변환 -> 범위가 큰곳에서 작은곳으로 가니 강제형변환 필요
//								: Upcasting을 전제로 해서 작업을 진행하는 경우가 많다
		
//		Sub ob5 = (Sub)new Super();
//		ob5.n1 = 100;
//		ob5.n2 = 200; // new 객체 -> 없는공간게 값을 넣음 -> 형변환으로 컴파일 읽는데 문제없지만 값을 넣을 공간이 없어서 실행 시 런타임 오류
		
		Sub down = (Sub)ob4; // ob4는 Super 이다 -> 있던 객체 -> 있는 공간에 값을 넣음 -> 오류x 
		down.n1 = 100;
		down.n2 = 200;
		
	}

}
