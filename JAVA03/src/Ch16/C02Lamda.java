package Ch16;

interface Printer {
	// 01
//	void print(String name);	// 추상메서드
	// 02
//	String print(String name);	// 추상메서드
}

public class C02Lamda {

	public static void main(String[] args) {
		// 01 interface 에 하나의 메서드만 있는 경우 -> 람다식 -> 메서드연결됨
//		Printer printer = (name)->{System.out.println("01 " + name);};
//		Printer printer = System.out::println;
//		printer.print("HELLO WORLD");
		
		// 02 return 타입확인
//		Printer printer = (name)->{return "02 " + name;};
//		String str2 = printer.print("HELLO WORLD");
//		System.out.println(str2);
	}

}
