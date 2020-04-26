package javastudy0424;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		//정수 배열
		//정수는 java.lang.Integer 클래스로 표현 가능
		int [] ar = {30, 60, 90, 20};
		//Arrays 의 sort 메소드가 정렬을 해 줌
		Arrays.sort(ar);
		//결과 확인
		for(int temp : ar) {
			System.out.printf(temp + "\t");
		}
		System.out.printf("\n");
		
		String [] br = {"배기훈","임성현","강준희","배성민","이상엽"};
		
		Arrays.sort(br);
		for(String temp : br) {
			System.out.printf(temp + "\t");
		}
		System.out.printf("\n");
		

	}

}