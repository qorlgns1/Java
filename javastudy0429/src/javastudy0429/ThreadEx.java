package javastudy0429;

public class ThreadEx extends Thread {
		//스레드로 동작할 메소드
		@Override
		public void run() {
			//0-9까지 1초마다 출력
			try {
				for (int i = 0; i < 10; i++) {
					Thread.sleep(1000);
					System.out.println(i);
				}
				
				
			}catch(Exception e) {}			
		}
}
