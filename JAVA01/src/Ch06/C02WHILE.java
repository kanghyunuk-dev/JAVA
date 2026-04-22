package Ch06;

import java.util.Scanner;

public class C02WHILE {
	
	public static void main(String[] args) {
		
		// 2 - 9 단 출력
//		int dan = 2;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
		
		// N - 9 단 출력
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int dan = n;
//		while(dan<10) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		// N - M 단 출력(N<M, N>=2 && N<=9, M>2 && M<10)
		
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
//		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = n;
//		while(dan<(m+1)) {
//			
//			int i=1;
//			while(i<10) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i++;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		// N - M 단 출력 거꾸로 2 x 9 , 2 x 8 ....
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
		//유효성검증(N<M, N>=2 && N<=9, M>2 && M<10) 이 아닌경우
		//(N>=M) ||  (N<2 || N>9) || (M<=2 || M>=10)
//		while((n>=m) ||  (n<2 || n>9) || (m<=2 || m>=10)) {
//			System.out.print("n,m 다시 입력 : ");
//			n = sc.nextInt();
//			m = sc.nextInt();
//		}
//		
//		int dan = n;
//		while(dan<(m+1)) {
//			
//			int i=9;
//			while(i>0) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//				i--;
//			}
//			
//			System.out.println();
//			dan++;
//		}
//		sc.close();
		
		// 1) 고정높이 
		// *****
		// *****
		// *****
		// *****
		// i(행이 몇개?) -> j(별 - 몇개?)
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 2)
		// 높이 : 4 
		// *****
		// *****
		// *****
		// *****
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<5) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		

		// 3) 고정높이
		// * 
		// ** 
		// *** 
		// **** 
		
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 4)
		// 높이 : 4 
		// * 
		// ** 
		// *** 
		// **** 		
//		Scanner sc = new Scanner(System.in);
//		int i = 0;
//		int h = sc.nextInt();
//		while(i<h) {
//			int j = 0;
//			while(j<=i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		// 5) 
		//높이 : 4
		//****
		//***
		//**
		//*		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = h;
//			while(j>i) {
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<=(h-1)-i) {
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		//6)
		//높이 : 4
		//   *
		//  ***
		// *****
		//*******
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k< (2 * i + 1)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		//7)
		//높이 : 4
		//*******
		// *****
		//  ***
		//   *
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			int k= 0;
//			while(k < ((h - i) * 2) - 1 ) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		

		//8) 고정높이
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		int i = 0;
//		while(i<h) {
//			int j = 0;
//			while(j<(h-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			int k=0;
//			while(k< (2 * i + 1)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int i = 0;
		while(i<h) {
			int j = 0;
			while(j<(h-1)-i) {
				System.out.print(" ");
				j++;
			}
			
			int k=0;
			while(k< (2 * i + 1)) {
				System.out.print("*");
				k++;
			}
			
//			int i = 0;
//			while(l<=i-1) {
//				System.out.print(" ");
//				l++;
//			}
//			int m= 0;
//			while(m < ((h - i) * 2) - 1 ) {
//				System.out.print("*");
//				m++;
//			}
			
			System.out.println();
			i++;
		}
		
		
		
		//9)
		//높이 : 7
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *	
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
		//   *
		//  ***
		// *****
		//*******
		
	}
	
}