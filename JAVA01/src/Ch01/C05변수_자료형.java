package Ch01;

public class C05변수_자료형 {

	public static void main(String[] args) {
		// -------------------------------
		// 정수 int - 4byte 정수 부호 O
		// -------------------------------
//		int n1 = 0b10101101;	// 2진수
//		int n2 = 173;			// 10진수 정수 값
//		int n3 = 0255;			// 8진수
//		int n4 = 0xad;			// 16진수
//		System.out.printf("%d %d %d %d \n", n1,n2,n3,n4);
		
		// -------------------------------
		// 정수 byte - 1byte 정수 부호 O
		// -------------------------------
		// 모두 형변환은 되어지고 있음 -> 범위를 벗어나는 수는 넣을 수 없고 강제형변환 필요
		// 자동형변환 : 큰범위 에서 작은범위는 불가능 , 작은범위에서 큰범위는 자동형변환 가능 
//		byte n5 = -129;		// 1byte 8비트 -> 8비트로 나타낼수있는 00000000 범위 수를 넘어갔음 
//		byte n5_1 = (byte)-129;		// 1byte 8비트 -> 8비트로 나타낼수있는 범위 수를 넘어 갔지만 강제형변환으로 데이터를 담기위해 앞에 비트값을 모두 날림 
//		System.out.println("n5_1 : " + n5_1);
//		byte n6 = -30;		//
//		byte n7 = 30;		//
//		byte n8 = 127;		//
//		byte n9 = 129;		// 1bute 8비트 -> -128 ~ 127 까지 나타냄
		
		// -------------------------------
		// 정수 short-2byte 정수 부호O | char-2byte 정수 부호x (양수만)
		// -------------------------------
//		char n1 = 65535; 	// (0~2^16-1) (0~65535) | 65535는 21억 아래에 수 -> int 값 -> (char)65535 자동형변환 되었고 char 는 65535 까지 담을 수 있어 문제없음
////		char n1_1 = 65536;	// char 은 65536 담을수없음
//		
//		short n2 = 32767; 	// (-2^15 ~ +2^15-1) (-32768 ~ + 32767)
//		
//		char n3 = 60000;
////		short n4 = n3; // 문제발생..왜? -> 자료형이 일치하지 않아서
//		
//		short n4 = (short)n1;
//		System.out.printf("%d\n", n4);
		
		// -------------------------------
		// 정수 long-8byte 정수 부호 O
		// -------------------------------
//		long n1 = 2100000000;	// 10억
//		long n1 = 2150000000L;	// 10억
//		long n2 = 20;			// L,l (리터럴접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000l;	// 문제발생.. 왜?
//		long n4 = 10000000000L;
		
		// -------------------------------
		// 실수
		// -------------------------------
		// 유리수와 무리수의 통칭
		// 소숫점 이하값을 가지는 수 123.456
		// float : 4byte 실수(6-9자리)
		// double : 8byte 실수(15-18자리), 기본자료형
		
		// 정밀도 확인
		// 단정밀도, 배정밀도 : 소수점을 찍어주는 방정식
//		float n1 = 0.123456789123456789F; // F,f : float 접미사
//		double n2 = 0.123456789123456789;
		
		// 근사치로 찍어냄
//		System.out.println(n1);
//		System.out.println(n2);
		
		//오차확인
//		float num = 0.1F;
//		for(int i=0; i<=1E5; i++) {
//			num = num + 0.1F;
//			System.out.println(i);
//		}
//		System.out.println("num : " + num);
		
		// -------------------------------
		// 단일문자 char 2byte 정수
		// -------------------------------
		char ch1 = 'a';
		System.out.println(ch1);
		System.out.println((int)ch1);
		System.out.println(Integer.toBinaryString(ch1));
		System.out.println("-------------------------");
		
		char ch2 = 98;
		System.out.println(ch2);
		System.out.println((int)ch2);
		System.out.println(Integer.toBinaryString(ch2));
		System.out.println("-------------------------");
		
		char ch3 = 'b' + 1;
		System.out.println(ch3);
		System.out.println((int)ch3);
		System.out.println(Integer.toBinaryString(ch3));
		System.out.println("-------------------------");
		
		System.out.println((char)0b1010110000000000);
		char ch4 = 0xac02;
		System.out.println(ch4);
		System.out.println((int)ch4);
		System.out.println(Integer.toBinaryString(ch4));
		System.out.println("-------------------------");
		
		// \\u : 유니코드 이스케이프 문자
		System.out.printf("%c\n", 0xac03);
		System.out.printf("%c\n", '\uac03');
		
		// -------------------------------
		// boolean : 논리형 (true/false 저장)
		// -------------------------------
//		boolean flag = (10>11);		// 참(긍정)
//		if(flag)
//		{
//			System.out.println("참인 경우 실행");
//		}
//		else
//		{
//			System.out.println("거짓인 경우 실행");
//		}
		
		// -------------------------------
		// 문자열 : String (클래스 자료형)
		// -------------------------------
		// 기본자료형(원시타입)
		// byte n1;
		// short n2;
		// double n3;
		// long n4;
		
		// 클래스자료형
		// 클래스자료형으로 만든 변수는 '참조변수'라고 하고
		// 참조변수는 데이터가 저장된 위치정보(메모리 주소값)이 저장된다.
		int n1 = 10;
		byte n2 = 20;
		char n3 = 40;
		// 객체와 동일
		String name = "홍길동";
		String job = "프로그래머";
		
		
	}

}
