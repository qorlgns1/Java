package javastudy0428;

import java.util.ArrayList;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		//Random 인스턴스 만들기 - seed를 동적으로 설정
		Random r = new Random();
		System.out.println(r.nextInt());
		System.out.println(r.nextInt());
		//seed를 1로 고정
		Random r1 = new Random(1);
		System.out.println(r1.nextInt());
		System.out.println(r1.nextInt());
		//0-44 사이의 숫자를 랜덤하게 리턴
		System.out.println(r1.nextInt(45));
		System.out.println(r1.nextInt(45));
		//주사위 게임하기
		System.out.println(r1.nextInt(6)+1);
		
		String [] monster = {"라투", "오미크론", "다크스펙터", "나즈",
							"오미크론","오미크론","다크스펙터","다크스펙터"};
		
		Random r2 = new Random();
		//위의 배열의 데이텉를 1초마다 랜덤하게 출력
		//10번만 수행
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(monster[r2.nextInt(monster.length)]);
			}catch(InterruptedException e) {}
		}

		ArrayList<String> arr = new ArrayList();
		arr.add("배기훈");
		arr.add("임성현");
		arr.add("배성민");
		int size = arr.size();
		for (int i = 0; i < size; i++) {
			try {
				Thread.sleep(1000);
				System.out.println(arr.get(r2.nextInt(size)));
			}catch(InterruptedException e) {}
		}
		

	}

}
