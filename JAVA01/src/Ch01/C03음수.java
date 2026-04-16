package Ch01;

public class C03음수 {

	public static void main(String[] args) {
		/*
			컴퓨터(CPU)는 구조상 덧셈연산을 할 수 있다(o)
			컴퓨터(CPU)는 구조상 뺄셈연산을 할 수 있다(x)
			보수 개념 + 가산처리 를 통해서 뺄셈 결과를 만들어 낸다(o)

		 	7 - 4 = 3
		 	7 + 6 = 3
		 	77 - 32 = 45
		 	77 + 68 = 45
		 	
		 	5 - 5 = 0
		 	5 + 5 = 0
		 	
		 	00000101 = 5
		 	00000000
		 	11111010 = 5에 대한 1의 보수(-6)
		 +	11111011 = 5에 대한 2의 보수(-5)
		 	-----------------------------
		    00000000 = 0
		    
		 	
		 	11111010 = -128 + 64 + 32 + 16 + 8 + 2 = -6
		 			 
			    	//문제
		//음수값임을 고려하여 풉니다
		//10 진수 	-> 2진수
		//111 		-> 01101111 
		//-111 		-> 10010001 
		//96		-> 01100000  
		//-96		-> 10100000 
		//31 		-> 00011111  
		//-31		-> 11100001
		
		//2진수		-> 10진수
		//10101111 	-> 175 (128 + 32 + 8 + 4 + 2 + 1) 
		//00110101	-> 53 (32 + 16 + 4 + 1)
		//11001100	-> 204 (128 + 64 + 8 + 4) 
		//10101010	-> 170 (128 + 32 + 8 + 2) 
		 	
		 */
		
		// 연상 및 값 확인
		System.out.println(111 - 64);
		System.out.println(47 - 32);
		System.out.println(15 - 8);
		System.out.println(7 - 4);
		System.out.println(31 - 16);
		System.out.println(15 - 8);
		int num = -31;
		System.out.println(Integer.toBinaryString(num));
		
		int decimal = Integer.parseInt("10101010", 2);
		System.out.printf("%d \n", decimal);
		System.out.println(128 + 32 + 8 + 2);
		
	}

}