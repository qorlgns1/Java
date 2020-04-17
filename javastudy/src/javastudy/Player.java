package javastudy;

public class Player {
	// �̸�,�Ҽ���,������ ������ ������Ƽ ����
	// �ν��Ͻ��� ���� ��鸵 �Ҽ������� private���� ����
	private String name;// �̸�
	private String team;// ����
	private int salary;// �޿�
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public static String getTitle() {
		return title;
	}

	public static void setTitle(String title) {
		Player.title = title;
	}

	// ��ü �������� ����� ������ ����
	// ��ü�� ����� �̸��� ����ϱ� ������ static
	// �����Ҽ� ������ final

	private static String title = "�� �̸�";

	// ������Ƽ�� private���� ���� �ν��Ͻ��� ����� �� ���� ������
	// �ν��Ͻ��� ����� �� �ֵ��� ������ �޼ҵ带 ����
	// ������ �޼ҵ� - getter,setter
	
	public void setProperty(String name, String team, int salary) {
		//�޼ҵ��� �Ű������� name, team, salary
		//������Ƽ �̸��� name, team, salary
		//�޼ҵ� �ȿ��� ���� ���������� �ƴ�
		//������Ƽ�� ������ ���� this.�� �ٿ��� �������� �˴ϴ�.
		//this�� �����ϸ� �޼ҵ� �ȿ��� ã��
		//������ ������Ƽ�� ���ϴ�.
		
		this.name = name;
		this.team = team;
		this.salary = salary;
	}
	//�̸��� ������ �Է¹ް� ���� FA�� �����ϴ� �޼ҵ�
	//���� String, String, int�� �Ű������� �ϴ�
	//setProperty�� �̹� ����
	//String, int�� �Ű������� �޴� setProperty
	//�̷� ��츦 MethodOverloading�̶�� �մϴ�.
	public void setProperty(String name, int salary) {
		
		this.name = name;
		this.salary = salary;
		this.team = "FA";
	
	}
	//�̸��� �Ҽ��� �׸��� ������ ����ϴ� �޼ҵ�
		public void display() {
			System.out.println("�̸�: " + name + "�Ҽ���: " + team + 
					"����(����-����): " + salary		);
		}
	
}