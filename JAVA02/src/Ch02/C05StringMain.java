package Ch02;

public class C05StringMain {

	public static void main(String[] args) {
		// String 메모리사용
		String str1 = "Java powerful";
//		String str2 = new String("java Programming");
//		String str3 = str1 + str2;			// HEAP 영역 사용
//		String str4 = str1.concat(str2);	// HEAP 영역 사용
//		String str5 = str1.concat(str2);	// HEAP 영역 사용
//		String str6 = str1 + str2;			// HEAP 영역 사용
//
//		System.out.printf("%x\n", System.identityHashCode(str1));
//		System.out.printf("%x\n", System.identityHashCode(str2));
//		System.out.printf("%x\n", System.identityHashCode(str3));
//		System.out.printf("%x\n", System.identityHashCode(str4));
//		System.out.printf("%x\n", System.identityHashCode(str5));
//		System.out.printf("%x\n", System.identityHashCode(str6));
		
		// String + '+' 사용 시(문자열 덧붙이기 할때) 메모리 공간 낭비(누수) 발생
//		String str7 = "HELLO WORLD";
//		System.out.printf("%x\n", System.identityHashCode(str7));
//		str7+=1;
//		System.out.printf("%x\n", System.identityHashCode(str7));
//		str7+=2;
//		System.out.printf("%x\n", System.identityHashCode(str7));
//		str7+=3;
//		System.out.printf("%x\n", System.identityHashCode(str7));
//		
//		System.out.println("----------------------------------");
//		// 공간 영역 낭비 없이 문자열을 더하기 위해 필요
//		// StringBuilder(★속도빠름)  ,  StringBuffer(안정적) - 문자열 반복 덧붙일때
//		StringBuilder builder = new StringBuilder("HELLO WORLD");
//		System.out.printf("%x\n", System.identityHashCode(builder) );
//		builder.append(1);
//		System.out.printf("%x\n", System.identityHashCode(builder) );
//		builder.append(2);
//		System.out.printf("%x\n", System.identityHashCode(builder) );
//		builder.append(3);
//		System.out.printf("%x\n", System.identityHashCode(builder) );
//		builder.append(4);		
//		System.out.printf("%x\n", System.identityHashCode(builder) );
		
		System.out.println("문자열 길이 : " + str1.length());
		System.out.println("한문자 찾기 : " + str1.charAt(2));
		
		System.out.println("인덱스 찾기 : " + str1.indexOf('a'));
		System.out.println("인덱스 찾기 : " + str1.lastIndexOf('a'));
		
		System.out.println("문자열포함 여부 : " + str1.contains("va"));
		System.out.println("문자열포함 여부 : " + str1.contains("abs"));
		
		System.out.println("문자열 자르기 : " + (str1.substring(2,6)));
		
		String str6 = "등산,탁구,축구,골프,독서,영화감상";
		String [] result = str6.split(",");
		for(String hobby : result)
			System.out.println(hobby);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
