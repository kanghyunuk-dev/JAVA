package Ch16;

//덧셈 , 뺄셈 , 곱셈 , 나눗셈을 수행하는 함수형 인터페이스를 정의
interface Calculator{
	int calculate(int num1, int num2);
}



public class C03Ex {

	public static void main(String[] args) {
		// 익명 클래스 방식
//        Calculator add = new Calculator() {
//            @Override
//            public int calculate(int num1, int num2) {
//                return num1 + num2;
//            }
//        };
		Calculator add = (num1, num2) -> num1 + num2; // 덧셈
        Calculator sub = (num1, num2) -> (num1>num2)? num1-num2 : num2-num1; // 뺄셈
        Calculator mul = (num1, num2) -> num1 * num2; // 곱셈
        Calculator div = (num1, num2) -> num1 / num2; // 나눗셈
		
		
		//결과
		System.out.println(add.calculate(10,20));//덧셈
		System.out.println(sub.calculate(30,10));//뺄셈
		System.out.println(mul.calculate(10,20));//곱셈
		System.out.println(div.calculate(100,5));//나눗셈
		//출력결과
//		30
//		20
//		200
//		20
		
	}
	
	
}