package javastudy0427;

import java.util.ArrayList;
import java.util.LinkedList;

public class ListCompare {

	public static void main(String[] args) {
		//문자열을 저장하는 ArrayList 와 LinkedList를 생성
		ArrayList<String> al = new ArrayList<>();
		LinkedList<String> li = new LinkedList<>();
		//데이터를 2개씩 삽입
		al.add("First");
		al.add("Third");
		
		li.add("First");
		li.add("Third");

		//1번째 자리에 Second 문자열을 10만개 삽입하고 시간을 측정
		long start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			al.add(1,"Second");
		}
		long end = System.currentTimeMillis();
		System.out.println("ArrayList: " + ((end-start)/1000));
		
		System.out.println("------------------------------------");
		
		start = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			al.add(1,"Second");
		}
		end = System.currentTimeMillis();
		System.out.println("LinkedList: " + ((end-start)/1000));
	}

}
