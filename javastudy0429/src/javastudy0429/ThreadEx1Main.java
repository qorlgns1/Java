package javastudy0429;

public class ThreadEx1Main {

	public static void main(String[] args) {
		//Thread 클래스를 상속받은 클래스를 이용해서 스레드 시작
		ThreadEx1 th1 = new ThreadEx1();
		th1.start();
		
		//Anonymous를 이용한 스레드 생성과 시작
		ThreadEx1 th2 = new ThreadEx1(){
			//스레드로 동작할 메소드
			public void run() {
				//0.3초마다 문자열을 10번 출력
				try {
					for (int i = 0; i < 10; i++) {
						Thread.sleep(300);
						System.out.println("임성현");
					}
					System.out.println("사망");
				}catch(Exception e) {}
			}
		};
		th2.start();
	}

}
