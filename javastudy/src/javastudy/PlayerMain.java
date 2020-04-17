package javastudy;

public class PlayerMain {

	public static void main(String[] args) {
		   //플레이어 클래스의 인스턴스 만들기
			Player p1 = new Player ();
			//프로퍼티에 데이터 저장
			p1.setName("임성현 ");
			p1.setTeam("은평구");
			p1.setSalary(20);
			
			
			Player p2 = new Player ();
			p2.setName("배기훈 ");
			p2.setTeam("마포구");
			p2.setSalary(10);
	        //p2의 setSalay를 가져와서 20000을 더한 후 다시 설정
			//값을 설정할 때는 set, 가져올때는 get			
			
			int temp = p2.getSalary();
			p2.setSalary(temp+50000);
			p2.display();
			
			Player p3 = new Player();
			p3.setProperty("배성민 ", "신촌 ", 20000);
			p3.display();
			
			Player p4 = new Player();
			p4.setProperty("강준희 ", 30000);
			p4.display();
		
			
			
			
	}
			
		
		

}