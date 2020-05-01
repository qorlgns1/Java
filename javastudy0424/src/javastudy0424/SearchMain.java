package javastudy0424;

import java.util.Arrays;

public class SearchMain {

	public static void main(String[] args) {
		String [] soccers = {
				"배기훈","임성현","배성민","강준희",
				"이상엽","김현준","오수영","한덕길","박상훈"
		};
		//데이터 정렬
		Arrays.sort(soccers);
		for(String temp : soccers) {
			System.out.print(temp + " ");
		}
		System.out.println();
		//1이라는 값이 나오는 이유는 정렬한후 김현준의 위치가 1번에 위치해있기 때문.
		System.out.println(Arrays.binarySearch(soccers, "김현준"));
		//들어있지 않은 값이 나오면 음수로 표시된다.
		System.out.println(Arrays.binarySearch(soccers, "123"));
		
		System.out.println("======================");
		
		String [] alphabets = {
				"alksdf","Clmqlkqd","ilmklcsld"
		};
		//영문 배열과 동일한 크기의 배열을 생성
		//원본을 변경하면 안되기 때문에 복사본을 저장할 배열을 생성
		String [] imsi = new String[alphabets.length];
		//데이터 복사
		for (int i = 0; i < imsi.length; i++) {
			//원본의 데이터를 대문자로 변경해서 복사본 배열에 저장
			imsi[i] = alphabets[i].toUpperCase();
		}
		//복사본 배열을 정렬해서 출력
		Arrays.sort(imsi);
		for(String rand : imsi) {
			System.out.println(rand);
			
		}
	}

}
