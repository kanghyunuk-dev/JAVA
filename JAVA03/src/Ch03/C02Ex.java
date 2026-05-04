package Ch03;

class 팝콘재료 {
	
}

class 카라멜 extends 팝콘재료 {

	@Override
	public String toString() {
		return "카라멜맛";
	}
	
}
class 버터옥수수 extends 팝콘재료 {

	@Override
	public String toString() {
		return "옥수수맛";
	}
	
}

class PopCorn<T> {
	private T 재료;

	PopCorn(T 재료) {
		this.재료 = 재료;
	}

	@Override
	public String toString() {
		return "팝콘 재료=" + 재료;
	}
}

public class C02Ex {

	public static void main(String[] args) {
		PopCorn<카라멜> ob1 = new PopCorn<카라멜>(new 카라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
		
		// 출력결과
		// PorCorn [재료=카라멜맛]
		// PorCorn [재료=옥수수맛]
	}

}
