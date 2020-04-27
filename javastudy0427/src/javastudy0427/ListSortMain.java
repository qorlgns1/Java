package javastudy0427;

import java.util.ArrayList;
import java.util.Comparator;

public class ListSortMain {

	public static void main(String[] args) {
		//정수 데이터를 저장할 수 있는 ArrayList 생성
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(40);
		list.add(20);
		list.add(50);
		list.add(10);
		list.add(30);

		//데이터를 오름차순 정렬
		list.sort(new Comparator<Integer>(){

			@Override
			//숫자 데이터의 경우는 앞에 데이터에서 뒤에 데이터를
			//뺄셈한 결과를 리턴하면 오름차순 정렬
			public int compare(Integer o1, Integer o2) {				
				return o1-o2;
			}
		});
		//결과 확인
		System.out.println(list);
		
		
		//문자열을 저장하는 ArrayList를 생성
		ArrayList<String> li = new ArrayList<>();
		
		//데이터추가
		li.add("배기훈");
		li.add("임성현");
		li.add("배성민");
		li.add("강준희");
		li.add("김현준");
		//데이터를 내림차순 정렬
		li.sort(new Comparator<String>(){

			@Override
			//String과 Date는 compareto 메소드를 이용해서 크기비교
			//앞에 데이터를 기준으로 비교: 오름차순
			//뒤에 데이터를 기준으로 비교: 내림차순
			//알고리즘에서는 비교하는 부등호의 방향을 반대로 사용
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		});
		//전체 데이터를 확인
		System.out.println(li);
	}

}
