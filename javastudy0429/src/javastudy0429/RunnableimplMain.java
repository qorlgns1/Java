package javastudy0429;

import java.util.Random;

public class RunnableimplMain {

	public static void main(String[] args) {
		// Runnable 인터페이스를 구현한 클래스를 이용한
		// 스레드 생성과 시작
		Runnableimpl runnable1 = new Runnableimpl();
		Thread th3 = new Thread(runnable1);
		th3.start();

		// Runnable 인터페이스를 이용한 스레드 생성과 시작
		// anonymous를 이용하고 변수를 생성하지 않고 작성
		new Thread(new Runnable() {

			@Override
			public void run() {
				// 1초마다 demage를 랜덤하게 10번 출력
				int[] demage = { 30, 20, 50, 30, 20 };
				try {
					Random r = new Random();
					for (int i = 0; i < 10; i++) {
						Thread.sleep(1000);
						int offence = demage[r.nextInt(demage.length)];
					
						if(offence == 50) {
							System.out.println("Critical");
						}
						System.out.println("데미지:" + offence);
						
					}
				} catch (Exception e) {}
				

			}
		}).start();
	}

}
