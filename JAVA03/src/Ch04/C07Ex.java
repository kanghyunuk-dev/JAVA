package Ch04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C07Ex {
	
	// 속성
	static Map<String , Object> map = new HashMap();
	
	// setter
	static void setMap(Map<String , Object> param) {
		for(String key : param.keySet()) {
			Object value = param.get(key);
//			System.out.println("KEY : " + key + " VALUE : " + value);
			
			map.put(key, value);
		}
//		map = param;
	}
	
	// getter
	static Map<String , Object> getMap() {
		return map;
	}
	
	public static void main(String[] args) {
		// 파라미터 객체생성
		Map<String , Object> params = new HashMap();
		
		// 파라미터 데이터 저장
		// 자격증 정보 넣기
		String[] values1 = {"정보처리기사" , "웹디자인기능사", "SQLD" , "네트워크관리사"};
		params.put("자격증", values1);
		
		
		// 취미 정보 넣기
		List<String> values2 = new ArrayList();
		values2.add("등산");
		values2.add("게임");
		values2.add("영화감상");
		
		params.put("취미", values2);
		
		// 개인 정보 저장
		params.put("이름", "홍길동");
		params.put("나이", 20);
		params.put("주소", "대구광역시 남구");
		
		// Setter 저장
		setMap(params);
		
		// Getter 정보 가져오기
		Map<String, Object> response = getMap();
		for(String key : response.keySet()) {
			Object value = response.get(key);
			//배열
			if(value instanceof String[]) {
				String[] arr = (String[])value;
				Arrays.stream(arr).forEach(el->{System.out.println("자격증 : " + el);});
			} else if(value instanceof List) {
				List list = (List)value;
				list.forEach(el->{System.out.println("자격증 : " + el);});
			} else {
				System.out.println("KEY : " + key + " VALUE" + value);
			}
		}
		
		
		
		
		
		
		
		
		
	}

}
