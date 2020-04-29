package thread5;

public class Customer extends Thread {
	//공유자원을 소비하는 메소드
	public synchronized void get() {
		//사용할 자원이 없으면 대기
		if(ShareData.list.size() == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
		
		
		//첫번째 데이터 삭제
		ShareData.list.remove(0);
	}
	
	//스레드로 동작할 메소드
	public void run() {
		try {
			for (int i = 0; i < 10; i++) {
				Thread.sleep(1000);
				get();
				System.out.println("Data" + i + " 소비");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
