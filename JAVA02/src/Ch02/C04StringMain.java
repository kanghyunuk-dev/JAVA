package Ch02;

public class C04StringMain {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		String str4 = new String("java");
		
		System.out.printf("%x\n", System.identityHashCode(str1));
		System.out.printf("%x\n", System.identityHashCode(str2));
		System.out.printf("%x\n", System.identityHashCode(str3));
		System.out.printf("%x\n", System.identityHashCode(str4));
		System.out.println("str1 == str2 ? " + (str1==str2));	// 문자열 상수 POOL 저장
		System.out.println("str3 == str4 ? " + (str3==str4));	// 주소값 다름
		System.out.println("str1 == str3 ? " + (str1==str3));	// 상수 POOL 과 str3힙영역 주소값 비교
		System.out.println("str2 == str4 ? " + (str2==str4));	// 상수 POOL 과 str4힙영역 주소값 비교
		System.out.println("--------------------------------");
		System.out.println("str1 == str2 ? " + (str1.equals(str2)));	// equals : 값일치여부만 확인
		System.out.println("str3 == str4 ? " + (str3.equals(str4)));
		System.out.println("str1 == str3 ? " + (str1.equals(str3)));
		System.out.println("str2 == str4 ? " + (str2.equals(str4)));
	}

}
