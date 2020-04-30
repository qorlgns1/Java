package javastudy0428;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;

public class StoreMain {

	public static void main(String[] args) {
		//테이블 형태의 데이터 생성
		ArrayList<Store> list = new ArrayList<>();
		list.add(new Store("1","기훈반점",4.4,10000,"짜장면"));
		list.add(new Store("2","성현김밥",3.8,50000,"김밥"));
		list.add(new Store("3","성민분식",4.1,12000,"떡볶이"));
		list.add(new Store("4","준희피자",4.7,15000,"피자"));
		
		//데이터 출력하기
		System.out.println("코드\t이름\t평점\t최소주문금액\t메뉴");
		for(Store store : list) {
			System.out.println(
					store.getCode()+"\t"+
					store.getName()+"\t"+
					store.getAverage()+"\t"+
					store.getMinOrderMoney()+"\t"+
					store.getMenu());
		}
		System.out.println("------------------------------------------------");
		ArrayList<LinkedHashMap<String,Object>>
			stores = new ArrayList<>();
		
		LinkedHashMap<String, Object> store1 =
				new LinkedHashMap<>();
		store1.put("code","1");
		store1.put("name","기훈반점");
		store1.put("average",4.4);
		store1.put("minordermoney",10000);
		store1.put("menu","짜장면");
		stores.add(store1);
		
		for(LinkedHashMap<String, Object> map : stores) {
			Set<String>keys = map.keySet();
			for(String key : keys) {
				System.out.print(map.get(key) + "\t");
			}
		}
		System.out.println(stores);
			
	}

}
