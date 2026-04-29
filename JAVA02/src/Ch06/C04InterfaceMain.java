package Ch06;

// 중간 다리 역할
interface Tire {
	void run();
}

class 한국타이어 implements Tire {

	@Override
	public void run() {
		System.out.println("한국타이어가 굴러갑니다.");
	}

}

class 금호타이어 implements Tire {

	@Override
	public void run() {
		System.out.println("금호타이어가 굴러갑니다.");
	}

}

// 필요한 부분 교체 준비
class Car {
	Tire FL;
	Tire FR;
	Tire BL;
	Tire BR;
	Car() {
		FL = new 한국타이어();
		FR = new 한국타이어();
		BL = new 한국타이어();
		BR = new 한국타이어();
	}
	void start() {
		FL.run();
		FR.run();
		BL.run();
		BR.run();
	}
}

public class C04InterfaceMain {

	public static void main(String[] args) {
		Car car = new Car();
		car.start();
		System.out.println("---");
		// 필요한 부분 교체
		car.FR=new 금호타이어();
		car.BL=new 금호타이어();
		car.start();
	}

}
