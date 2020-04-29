package thread3;

public class ThreadExMain {

	public static void main(String[] args) {
		Thread th = new ThreadEx();
		th.start();
		
		try {
			Thread.sleep(3000);
			//th에 InterruptedException을 발생 시킴
			th.interrupt();
		}catch(Exception e) {
		}
	}

}
