package Ch02;

public class C05TypeChange {

	public static void main(String[] args) {
		// 나눗셈 연산 시 형변환
		int num1 = 10, num2 = 4;
		double dnum1 = (double)num1 / num2; // 연산시에는 int로 진행되고 있음
		double dnum2 = (num1*1.0) / num2;
		double dnum3 = num1 / num2;
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);

	}

}
