package javastudy0429;

public class Runnableimpl implements Runnable {

		
	@Override
	public void run() {
		try {
			String [] action = {"상","하","좌","우"};
				for (int i = 0; i < 12; i++) {
					Thread.sleep(200);
					System.out.println(action[i%action.length]);
				}
		}catch(Exception e) {
			//자신만의 메시지를 출력하고 기록
			System.out.println("문제가 발생");
			//예외 내용을 출력
			System.out.println(e.getMessage());
			//예외 발생 지점을 찾기
			e.printStackTrace();
			
		}

	}

}
