package Ch04;

import java.util.List;
import java.util.Vector;

public class C02ListMain {

	public static void main(String[] args) {
//		List<String> list = new ArrayList<String>(); // <String> 생략가능
//		List<String> list = new LinkedList();
		List<String> list = new Vector(); // 멀티스레드 활용
		
		// 추가
		list.add("HTML/CSS/JS");
		list.add("NODEJS");
		list.add("SCSS");
		list.add("REACT");
		list.add("JAVA");
		list.add("JSP/SERVLET");
		list.add("STS");
		list.add("SPRING BOOT");
		
		System.out.println("개수 확인 : " + list.size());
		System.out.println("idx로 조회 : " + list.get(2));
		System.out.println("Value로 idx확인 : " + list.indexOf("JAVA"));
//		list.forEach((el)->{System.out.println(el);}); // 람다식
//		list.forEach(el->System.out.println(el)); // 람다식 {생략} 
		list.forEach(System.out::println); // 단일 함수 사용시 :: 으로 가능
		
		// 삭제
		list.remove(0);
		list.remove("REACT");
		System.out.println("---");
		list.forEach(System.out::println);
		// 전체삭제
		list.clear();
	}
}
