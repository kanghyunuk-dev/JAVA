package Ch03;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 배열형 참조변수
//		int arr1 [] = new int[5];
		int [] arr1 = new int[5];
		arr1[0] = sc.nextInt();
		arr1[1] = sc.nextInt();
		arr1[2] = sc.nextInt();
		arr1[3] = sc.nextInt();
		arr1[4] = sc.nextInt();
		
		// 확인
//		System.out.println("배열길이 : " + arr1.length);
//		for(int i=0; i<arr1.length; i++)
//			System.out.println(arr1[i]);
//		System.out.println("-----------");
//		for(int el : arr1)
//			System.out.println(el);
//		Arrays.stream(arr1).forEach((el) -> {System.out.println(el);});
		
		// 저장된 배열의 수중 최대값 / 최소값 구하기
//		int max = arr1[0];
//		int min = arr1[0];
		// for문 사용
//		for(int el : arr1) {
//			if(el > max) {
//				max=el;
//			} else {
//				min=el;
//			}
//		}
//		System.out.println("max : " + max);
//		System.out.println("min : " + min);
		// stream 사용
		// 배열을 stream화, 체인함수사용 - 컬렉션에서 사용됨 (필요한 자료를 뽑아서 쓸때)
		System.out.println("MAX : " + Arrays.stream(arr1).max().getAsInt());
		System.out.println("MIN : " + Arrays.stream(arr1).min().getAsInt());
		
		
	}

}
