package Ch06;

import java.util.Scanner;

public class C04FOR {

	public static void main(String[] args) {
		
		// for문 변환
		
//		int i=0;
//		while(i<10) {
//			System.out.println("HELLOWORLD");
//			i++;
//		}
		
//		for(int i=0;i<10;i++) {
//			System.out.println("HELLOWORLD");
//			
//		}
		
		
//		scanner
		Scanner sc = new Scanner(System.in);
		
//03 1 부터 10까지 합 구하기
		
//		int i=1;
//		int sum = 0;
//		while(i<=10) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,10,sum);
		
//		int sum = 0;
//		for(int i=0; i<=10; i++) {
//			System.out.println("i : "+ i);
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,10,sum);
		
		
		// 1 부터 N까지의 합
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		int i=1;
//		int sum = 0;
//		while(i<=n) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
//		
//		sc.close();
		
//		int sum = 0;
//		int n = sc.nextInt();
//		for(int i = 1; i<=n; i++) {
//			System.out.println("i : " + i);
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
//		
		
		// N 부터 M까지의 합(N<M)

//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//SWAP
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int i=n;
//		int sum = 0;
//		while(i<=m) {
//			System.out.println("i : "+ i);
//			sum+=i;
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", 1,n,sum);
		
		
//		int sum = 0;
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		//SWAP
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		for(int i = n; i<=m; i++) {
//			System.out.println("i : "+ i);
//			sum+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 합 : %d\n", n,m,sum);
		
//		
//		sc.close();
		
		// N 부터 M까지 범위에서 짝수의 합과 홀수의 합 구해서 출력 (N<M)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//SWAP
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int i=n;
//		int sum = 0;
//		int odd = 0; //홀수의합
//		int even = 0; //짝수의합
//		
//		while(i<=m) {
//			System.out.println("i : "+ i);
//			
//			if(i%2==0) even+=i; else odd+=i;
//			
//			i++;
//		}
//		System.out.printf("%d 부터 %d 까지 홀수합 : %d 짝수합 : %d\n", n,m,odd,even);
//		
//		sc.close();	
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int odd = 0; 
//		int even = 0; 
//		int sum = 0;
//		
//		if(n>m) {
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		for(int i=n; i<=m; i++) {
//			System.out.println("i : "+ i);
//			if(i%2==0) 
//				even+=i; 
//			else 
//				odd+=i;
//		}
//		System.out.printf("%d 부터 %d 까지 홀수합 : %d 짝수합 : %d\n", n,m,odd,even);
		
		// 구구단 2 x 1 = 1 , 2 x 9 = 18 찍기
		
//		int i=1;
//		int dan = 2;
//		while(i<10) {
//			System.out.printf("%d x %d = %d\n", dan,i, dan*i);
//			i++;
//		}
		
//		int dan = 2;
//		for(int i=1; i<10; i++) {
//			System.out.printf("%d x %d = %d\n", dan,i, dan*i);
//		}
		
		
		// 구구단 N단 받아서 찍어보기 (n>=2 && n<=9) vs (n<2 || n>9)
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		
//		while(n<2 || n>9) {
//			System.out.print("2이상 9이하 값 입력해야 합니다. : ");
//			n=sc.nextInt();
//		}
		
//		int n = sc.nextInt();
		for(int n = sc.nextInt(); n<2 || n>9; n=0) {
			System.out.print("2이상 9이하 값 입력해야 합니다. : ");
			n=sc.nextInt();
		}
		
//		
		// 순차적 나타내기
//		int i=1;
//		int dan = n;
//		while(i<10) {
//			System.out.printf("%d x %d = %d\n", dan,i, dan*i);
//			i++;
//		}
		// 역순으로 나타내기
//		int i=9;
//		int dan = n;
//		while(i>0) {
//			System.out.printf("%d x %d = %d\n", dan,i, dan*i);
//			i--;
//		}
		
		// 2 - 9 단 출력
//		for(int dan = 2; dan<10; dan++) {
//			for(int i = 1; i<10; i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
		
		
		// N - 9 단 출력
//		int n = sc.nextInt();
//		for(int dan = n; dan<10; dan++) {
//			for(int i = 1; i<10; i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
//		
		
		
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
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		//유호성검증??
//		
//		for(int dan=n; dan<(m+1); dan++) {
//			for(int i=1; i<10; i++) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
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
		
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		
//		for(int dan = n; dan<(m+1); dan++) {
//			for(int i=9; i>0; i--) {
//				System.out.printf("%d x %d = %d\n", dan,i,dan*i);
//			}
//			System.out.println();
//		}
		
		
		
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
		
//		for(int i=0; i<4; i++) {
//			for(int j = 0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
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
		
//		int h = sc.nextInt();
//		for(int i=0; i<h; i++) {
//			for(int j=0; j<5; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
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
		
//		i(행)	j(공백)	k(별)
//		0		0-2		0-1
//		1		0-1		0-2
//		2		0-0		0-4
//		3		x		0-6
//		-----------------------
//		i=0		j=0		k=0
//		i++		j++		k++
//		i<4		j<3-i	K <= i*2
//		-----------------------
//		시작:0	시작:0	시작:0
//		증가:++	증가:++	증가:++
//		범위(조건):		
//		i<4	    j<3-i	k<=i*2
//		-----------------------		
// 		높이: h(입력값)
//		i(행)	j(공백)			k(별)
//		0		0~(h-2)-0		0-0
//		1		0~(h-2)-1		0-2
//		2		0~(h-2)-2		0-4
//		3		0~(h-2)-3		0-6
//		...
//		h-1		0~(h-2)-(h-1)		
//		-----------------------
//		시작:0	시작:0	시작:0		
//		증가:++	증가:++	증가:++
//		범위(조건):		
//		i<h	    j<(h-1)-i	k<=i*2		
		
		
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
//			while(k<= (2 * i)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
//		7)
//		높이 : 4
//		*******
//		 *****
//		  ***
//		   *
		
//		i(행)	j(공백)	k(별)
//		0		x		0-6
//		1		0-0		0-4
//		2		0-1		0-2
//		3		0-2		0-0						
//		----------------------
//		시작:0	시작:0	시작:0		
//		증가:++	증가:++	증가:++
//		범위(조건):		
//		i<h	    j<(h-1)-1	k<=i*2						
		
		
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
//			while(k <= ((3 * 2) - 2 * i) ) {
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
		
				
//		int i = 0;
//		while(i<4) {
//			int j = 0;
//			while(j<(4-1)-i) {
//				System.out.print(" ");
//				j++;
//			}
//			
//			int k=0;
//			while(k< (2 * i + 1)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		i = 1;
//		while(i<4) {
//			int j = 0;
//			while(j<=i-1) {
//				System.out.print(" ");
//				j++;
//			}
//			int k= 0;
//			while(k < ((4 - i) * 2) - 1 ) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//		i(행)		j(공백)		k(별)
//		0			0-2			0-0
//		1			0-1			0-2
//		2			0-0			0-4
//		3			x			0-6
//		---------------------------------------
//		i<4			j=0			k=0
//					j++			k++
//					j<3-i		k<=2*i
//			
//		---------------------------------------
//		4			0-0			0-4
//		5			0-1			0-2
//		6			0-2			0-0
//		---------------------------------------
//		i>=4		j=0			k=0
//					j++			k++
//					j<=i-4		k<=(6*2)-i*2
//		---------------------------------------
//		i=0
//		i++
//		i<7
//		int i=0;
//		while(i<7) {
//			if(i<4) {
//				//공백
//				int j=0;
//				while(j<3-i) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				//공백
//				int j=0;
//				while(j<=i-4) {
//					System.out.print(" ");
//					j++;
//				}
//				//별
//				int k=0;
//				while(k<=(6*2)-i*2) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//9)
		//높이 : 7
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
//			
//			int k=0;
//			while(k< (2 * i + 1)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		i = 1;
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
		
		
//     --------------------------------------------		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		while(h%2==0 || h<=1) {
//			System.out.println("다시입력(홀수) : ");
//			h = sc.nextInt();
//		}
//		
//		int i = 0;
//		while(i<h) {
//			if(i<=h/2) {
//				int j = 0;
//				while(j<(h/2)-i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k = 0;
//				while(k<=2*i) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				int j = 0;
//				while(j<i-h/2) {
//					System.out.print(" ");
//					j++;
//				}
//				int k = 0;
//				while(k<=((h-1)*2)-i*2) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
		
		// 10)
		// 높이 : 7
		//*******
		// *****
		//  ***
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
//			
//			int k=0;
//			while(k< (2 * i - 1)) {
//				System.out.print("*");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
//		
//		i = 1;
//		while(i<h) {
//			int j = 0;
//			while(j<=i-1) {
//				System.out.print("*");
//				j++;
//			}
//			int k= 0;
//			while(k < ((h - i) * 2) - 1 ) {
//				System.out.print(" ");
//				k++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
//		------------------------------------------------		
//		Scanner sc = new Scanner(System.in);
//		int h = sc.nextInt();
//		
//		while(h%2==0 || h<=1) {
//			System.out.println("다시입력(홀수) : ");
//			h = sc.nextInt();
//		}
//		
//		int i = 0;
//		while(i<h) {
//			if(i<=h/2) {
//				int j = 0;
//				while(j<i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k = 0;
//				while(k<h-(2*i)) {
//					System.out.print("*");
//					k++;
//				}
//			}else {
//				int j = 0;
//				while(j<h-1-i) {
//					System.out.print(" ");
//					j++;
//				}
//				int k = 0;
//				while(k<2*(i-h/2)+1) {
//					System.out.print("*");
//					k++;
//				}
//			}
//			System.out.println();
//			i++;
//		}
	}

}
