package javastudy0428;

import java.util.HashMap;

public class MapMain2 {

	public static void main(String[] args) {
		// 2차원 배열 - 배열의 배열
		// 서울 얼짱 대표 모임들의 얼짱 명단을 데이터로 작성
		String[] 아현얼짱 = { "배기훈", "김슬비", "임성현", "강준희", };
		String[] 신촌얼짱 = { "배성민", "이상엽", "김현준" };
		String[] 종로얼짱 = { "오수영", "박상훈" };
		String[] 우리집얼짱 = { "순둥이" };

		String[][] 얼짱집단 = { 아현얼짱, 신촌얼짱, 종로얼짱, 우리집얼짱 };

		for (int i = 0; i < 얼짱집단.length; i++) {
			// 팀 이름을 출력
			if (i == 0) {
				System.out.printf("%5s", "아현얼짱: ");
			} else if (i == 1) {
				System.out.printf("%5s", "신촌얼짱: ");
			} else if (i == 2) {
				System.out.printf("%5s", "종로얼짱: ");
			} else {
				System.out.printf("%5s", "우리집얼짱: ");

			}
			String[] temp = 얼짱집단[i];
			for (String imsi : temp) {
				System.out.printf("%7s", imsi);
			}
			System.out.println("\n");
		}
		
		System.out.println("=====================================");
			//배열들을 하나로 묶어 줄 때는 Map을 만들어서
			//배열의 특징과 데이터를 저장하고 Map의 배열을 만들어주는것이 좋습니다.
			
			HashMap<String, Object> map1 = new HashMap<>();
			map1.put("team","아현얼짱");
			map1.put("player",아현얼짱);
			
			HashMap<String, Object> map2 = new HashMap<>();
			map2.put("team","신촌얼짱");
			map2.put("player",신촌얼짱);
			
			HashMap<String, Object> map3 = new HashMap<>();
			map3.put("team","종로얼짱");
			map3.put("player",종로얼짱);

			HashMap<String, Object> map4 = new HashMap<>();
			map4.put("team","우리집얼짱");
			map4.put("player",우리집얼짱);

			
			HashMap [] kbo = {map1,map2,map3,map4};
			for(HashMap map : kbo) {
				System.out.printf("%5s", map.get("team"));
				//출력 이외의 작업을 할 때는 원래 자료형으로 형 변환해서 사용해야 합니다.
				String [] player=
						(String[] )map.get("player");
				for(String p : player) {
					System.out.printf("%7s",p);					
				}
				System.out.println("\n");
			}
		
	}
}
