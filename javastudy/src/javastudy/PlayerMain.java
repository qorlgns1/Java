package javastudy;

public class PlayerMain {

	public static void main(String[] args) {
		   //�÷��̾� Ŭ������ �ν��Ͻ� �����
			Player p1 = new Player ();
			//������Ƽ�� ������ ����
			p1.setName("�Ӽ��� ");
			p1.setTeam("����");
			p1.setSalary(20);
			
			
			Player p2 = new Player ();
			p2.setName("����� ");
			p2.setTeam("������");
			p2.setSalary(10);
	        //p2�� setSalay�� �����ͼ� 20000�� ���� �� �ٽ� ����
			//���� ������ ���� set, �����ö��� get			
			
			int temp = p2.getSalary();
			p2.setSalary(temp+50000);
			p2.display();
			
			Player p3 = new Player();
			p3.setProperty("�輺�� ", "���� ", 20000);
			p3.display();
			
			Player p4 = new Player();
			p4.setProperty("������ ", 30000);
			p4.display();
		
			
			
			
	}
			
		
		

}