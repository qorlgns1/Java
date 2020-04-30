package javastudy0428;

import java.util.HashMap;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
		//해시 맵 인스턴스 생성
		HashMap<String, Object> map = new HashMap<>();
		//데이터 저장
		map.put("name", "배기훈");
		map.put("address", "서울");
		map.put("age", 28);
		map.put("job", "programmer");
		
		//데이터 꺼내오기 - 없는 key를 이용하면 null
		System.out.println(map.get("name"));
		System.out.println(map.get("team"));
		System.out.println(map.get("age"));
		System.out.println(map.get("job"));

		System.out.println("-----------------------");
		//데이터 수정 및 추가
		map.put("job", "barista");
		map.put("DOB", 19930610);
		System.out.println("job: "+ map.get("job"));
		
		//데이터 삭제
		map.remove("age");
		
		//toString 호출
		System.out.println(map);
		
		//Map의 전체 데이터 순회
		//key 전체를 Set으로 리턴
		Set <String> keys = map.keySet();
		//key 값을 이용해서 전체 데이터를 출력
		for(String key : keys) {
			System.out.println(key + ":" + map.get(key));
		}

	}

}
