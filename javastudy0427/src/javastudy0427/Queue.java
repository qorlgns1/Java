package javastudy0427;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		
		pq.add(100);
		pq.add(50);
		pq.add(300);
		
		//PriorityQueue는 자동으로 정렬을 해주어서
		//출력을 해보면 100,50이 출력되는게 아니고
		//50,100 순서로 출력된다.
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		
		ArrayDeque <Integer> ad = new ArrayDeque<>();
		ad.

	}

}
