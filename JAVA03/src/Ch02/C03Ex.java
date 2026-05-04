package Ch02;

import java.util.Scanner;

public class C03Ex {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		try {
			System.out.println("나눗셈 결과 : " + n1/n2); 
		} catch(ArithmeticException e) {
			// N/0 시 예외발생!
			System.out.println("ArithmeticException 발생!");
		} finally {
			System.out.println("예외 무관 코드 실행");
		}
		
	}

}
