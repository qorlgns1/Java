package thread4;

public class ThreadExMain {

	public static void main(String[] args) {
		ThreadEx obj = new ThreadEx();
		Thread th1 =new Thread(obj);
		th1.start();
		Thread th2 =new Thread(obj);
		th2.start();
		
		try {
			Thread.sleep(30000);
		}catch(Exception e) {}
		System.out.println(obj.result);
	}

}
