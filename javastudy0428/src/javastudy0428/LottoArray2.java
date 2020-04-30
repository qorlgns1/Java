package javastudy0428;

import java.util.ArrayList;
import java.util.Scanner;

public class LottoArray2 {

	public static void main(String[] args) {
		// 1부터 45까지의 정수를 중복되지 않게 6개 입력받아서
		// 오름차순 정렬해서 출력
		ArrayList<Integer> lotto = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		// 데이터 개수를 저장
		
		// 6개의 숫자 입력받기
		for (int i = 0; i < 6; i = i + 1) {
			try {
				System.out.print("정수 입력:");
				// 문자열을 입력받아서 정수로 변환해서 배열에 저장
				String input = sc.nextLine();
				lotto.add(Integer.parseInt(input));
			} catch (Exception e) {
				System.out.println("정수를 입력하세요!!!");
				// 정수가 아닌 데이터를 입력한 경우에 무효화
				i = i - 1;
			}

		}
	}
}