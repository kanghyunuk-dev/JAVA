package Ch02;

public class C01NullPointerExceptionMain {
	// 예외처리 : 프로그램 중단을 막음
	public static void main(String[] args) {
		try {
			String str = null;
			System.out.println(str.toString());			
		} catch(NullPointerException e) {
			System.out.println("예외객체 : " + e);
			System.out.println("예외객체 : " + e.getCause());
			System.out.println("예외객체 : " + e.getStackTrace());
			for(StackTraceElement el : e.getStackTrace()) {
				System.out.println(el);
			}
			
			e.printStackTrace();
		}
		
		System.out.println("반드시 실행되어야 할 코드1");
		System.out.println("반드시 실행되어야 할 코드2");
	}

}
