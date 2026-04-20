package Ch03;

import java.util.Scanner;

public class C03Scanner {

	public static void main(String[] args) {
		// 이름을 입력하세요? 홍길동
		// 홍길동 님의 나이를 입력하세요? 35
		// 홍길동 님의 주소를 입력하세요? 대구광역시 달성구 000
		// 홍길동 님의 나이는 35세 주소는 대구광역시 ~~ 입니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요.");
		String str1 = sc.nextLine();
		
		System.out.println("홍길동 님의 나이를 입력하세요?");
		String str2 = sc.nextLine();
		
		System.out.println("홍길동 님의 주소를 입력하세요?");
		String str3 = sc.nextLine();
		
		System.out.println(str1 + " 님의 나이는 " + str2 + "세 주소는 "+ str3 + " 입니다.");

	}

}
