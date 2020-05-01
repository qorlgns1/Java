package javastudy0428;

import java.util.Scanner;

public class LottoArray {

	public static void main(String[] args) {
		//1부터 45까지의 숫자를 중복되지 않게 6개 입력받아서
		//오름차순 정렬해서 출력
		int[] lotto = new int[6];
		int size = lotto.length;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < size; i++) {
			try{
				System.out.println("정수 입력: ");
				String input = sc.nextLine();
				lotto[i] = Integer.parseInt(input);
				
				if(lotto[i]<1 || lotto[i]>45) {
					System.out.println("1부터 45사이의 숫자를 입력해주세요");
					i = i -1;
					//1부터 45사이의 숫자가 아니면 중복체크를 하지 않도록
					//다음 반복문으로 이동
					continue;
				}
				
				//중복 체크
				boolean flag = false;
				for (int j = 0; j <= i-1; j++) {
					if(lotto[i]==lotto[j]) {
						flag = true;
						break;
					}
				}
				if(flag == true) {
					System.out.println("중복된 데이터 입니다.");
					i=i-1;
				}
			}catch(Exception e){
				System.out.println("정수만 입력해 주세요!!");
				i=i-1;
			}
			
		}
		
		//삽입정렬
		//2번째 데이터부터 마지막 데이터까지
		for (int i = 0; i < size; i++) {
			//현재 데이터를 임시변수에 복사
			int standard = lotto[i];
			//자신의 앞에 있는 모든 데이터와 비교
			//뒤에서부터 앞으로 비교
			int j = i-1;
			for(; j>=0; j=j-1) {
				//비교하는 데이터가 클때는
				//비교하는 데이터를 다음 자리로 이동
				//비교하는 데이터가 작거나 같으면 반복문 중단
				if(standard <lotto[j]) {
					lotto[j+1] = lotto[j];
					
				}else{
					break;
				}
			}
			//앞쪽의 데이터와 비교가 끝나면 기준 데이터를 비교가 끝난 다음자리에 복사
			lotto[j+1] = standard;
		}
		
		//정렬하는 메소드를 호출
		//이걸 사용하면 위에 삽입정렬하는 반복문을 안써도 된다.
		//Arrays.sort(lotto);
		
		
		//배열의 데이터를 출력
		for(int imsi : lotto) {
			System.out.printf(imsi + "\t");
		}
		
	}

}
