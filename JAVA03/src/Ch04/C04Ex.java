package Ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class C04Ex {

	public static void main(String[] args) {
		Random random = new Random();
		Set<Integer> set = new HashSet();
//		Set<Integer> set = new TreeSet(); // 오름차순 정렬

		// 1) 1~45 까지 숫자를 6개를 랜덤으로 받아(Random 클래스 이용) set에 저장 / 출력
		int randomInt;
//		set.add(randomInt);
//		set.add(randomInt);
//		set.add(randomInt);
//		set.add(randomInt);
//		set.add(randomInt);
//		set.add(randomInt);
//		System.out.println(set.size());
		
//		for (int i = 0; i < 6; i++) {
//			randomInt = random.nextInt(45) + 1;
//			set.add(randomInt);
//		}
		
		
		while(set.size()<6) {
			randomInt = random.nextInt(45) + 1;
			set.add(randomInt);
		}
		
		

		for (int el : set) {
			System.out.println(el);
		}

//		Iterator<Integer> iter = set.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}

		// 2) [추가] 저장된 set의 오름차순정렬을 해보세요(검색을 통해서 해결해 봅니다 - 스트림 함수 사용)
//		set.stream().sorted().collect(Collectors.toList());
		List<Integer> sortedList = set.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		
		List<Integer> list = new ArrayList(set);
		Collections.sort(list);
		list.forEach(System.out::println);

	}

}
