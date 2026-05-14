package Ch18;

import java.util.Arrays;
import java.util.Comparator;

/* ----------------------------------------------------------
   2. [학생용 문제] 사칙연산 함수형 인터페이스 + Stream + Lambda
   ----------------------------------------------------------
   조건 :
     - sum / sub / mul / div 람다를 람다 + Stream 으로 구현
     - 모든 인자를 받을 수 있도록 가변인자 처리
     - 뺄셈 / 나눗셈은 큰 수 → 작은 수로 정렬 후 누적 감산 / 누적 제산
       (예: sub(1,4,2,9) → 정렬 9,4,2,1 → 9-4-2-1 = 2)

   정답 참고 : C02ExAns.java
   ---------------------------------------------------------- */

@FunctionalInterface
interface Functional {
	Integer execute(int ...args);
}

class Calc {
	Functional sum;   // 합
	Functional sub;   // 차
	Functional mul;   // 곱
	Functional div;   // 나누기

	Calc() {
		// TODO sum 람다 작성
//		sum = arr -> Arrays.stream(arr).sum();
		sum = (arr) -> {
			return Arrays.stream(arr).reduce(0, (sum,el)->{return sum+el;});
				};
		// TODO sub 람다 작성
//		sub = arr -> Arrays.stream(arr)
//	    .boxed()                           
//	    .sorted(Comparator.reverseOrder()) 
//	    .mapToInt(Integer::intValue)       
//	    .reduce(0,(a, b) -> a - b);
		sub = (arr) -> {
			return Arrays.stream(arr)
					.boxed()
					.sorted((a,b)->{return b-a;})
					.reduce((sub, el) -> {return sub - el;} )
					.orElse(0);
		};
				
		// TODO mul 람다 작성
//		mul = arr -> Arrays.stream(arr).reduce(1, (a,b) -> a*b);
		mul = (arr) -> {
			return Arrays.stream(arr).reduce(1, (mul,el)->{return mul*el;});
		};
		// TODO div 람다 작성
//		div = arr -> Arrays.stream(arr)
//				.boxed()
//				.sorted(Comparator.reverseOrder())
//				.mapToInt(Integer::intValue)
//				.reduce((a,b) -> a / b)
//				.orElse(0);
		div = (arr) -> {
			return Arrays.stream(arr)
					.boxed()
					.sorted((a,b)->{return b-a;})
					.reduce((div, el) -> {return div / el;} )
					.orElse(0);
		};
		
		
	}
}

public class C02Ex {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.sum.execute(1,2,3,4,5));
		System.out.println(calc.sub.execute(1,4,11,9));
		System.out.println(calc.mul.execute(1,2,3,4,5));
		System.out.println(calc.div.execute(1, 4, 2, 9));
		// 람다 채우면 아래 실행 가능
		// 기대 출력 :
		//   합     : 210
		//   차     : 2
		//   곱     : 720000000
		//   나눗셈 : 0
		// TODO 답안 작성 후 calc.sum / sub / mul / div 호출
	}
}
