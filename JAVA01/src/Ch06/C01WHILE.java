package Ch06;

import java.util.Scanner;

public class C01WHILE {

	public static void main(String[] args) {
		// 00 기본 문법
		
//		while(조건식) {
//			// 조건식이 true 인 동안 실행되는 종속 문장
//		}
		
		// 01 HELLOWORLD 10회 출력
		// 탈출용 변수 : i=0
		// 탈출 조건식 : i<10
		// 탈출 연산식 : i++
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
		// 02 HELLOWORLD N회 출력(N>0)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		if(n<0) {
//			System.out.println("N은 0보다 커야 합니다.");
//			System.exit(-1);
//		}
//		
//		int i=0;
//		while(i<n) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
//		sc.close();
		
		// 03 1 ~ 10 까지 합 구하기
		
//		int i = 1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : " + i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,10,sum);
		
		// 1 ~ N 까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i = 1;
//		int sum = 0;
//		while(i<=n) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		// N ~ M 까지의 합(N<M)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작 수");
//		int m = sc.nextInt();
//		System.out.println("범위 수");
//		int n = sc.nextInt();
//		
//		//SWAP
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int sum = 0;
//		while(m<=n) {
//			sum+=m;
//			m++;
//		}
//		System.out.println(sum);
		
		// N ~ M 까지 범위에서 짝수의 합과 홀수의 합 구해서 출력 (N<M)
//		Scanner sc = new Scanner(System.in);
//		System.out.println("시작 수");
//		int m = sc.nextInt();
//		System.out.println("범위 수");
//		int n = sc.nextInt();
//		
//		int even = 0;
//		int odd = 0;
//		while(m<=n) {
//			if(m%2==0) {
//				even += m;
//				System.out.println("짝" + even);
//			} else {
//				odd += m;
//				System.out.println("홀" + odd);
//			}
//			m++;
//		}
//		System.out.println(even + odd);
		
		
		// 구구단 2x1 = 1 , 2x9 = 18 찍기
//		int i=1;
//		while(i<=9) {
////			System.out.println(2*i); 
//			System.out.printf("2 x %d = %d", i, 2*i);
//			System.out.println();
////			System.out.println("2 x " + i + " = " + 2 * i);
//			i++;
//		}
		
		// 구구단 N단 받아서 찍어보기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 선택");
		int n = sc.nextInt();
		
		int i=1;
		while(i<=9) {
			System.out.printf("%d x %d = %d\n", n, i, n*i);
			i++;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
