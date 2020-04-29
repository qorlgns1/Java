package javastudy0429;

public class ThreadEx1 extends Thread {
	//스레드로 동작할 메소드
	@Override //안해도 되는 메소드
	//상위 클래스에 없는 메소드에 붙이면 에러
	public void run() {
		try {
			//0.5초마다 문자열을 10번 출력
			for (int i = 0; i < 10; i++) {
				Thread.sleep(500);
				System.out.println("배기훈");
			}
			System.out.println("천국");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
