package javastudy;

public class TaskMain {

	public static void main(String[] args) {
		
		//TaskClass Ŭ������ �����ϴ�
		//static int noRecuresionFibo(int n) ���
		int result = TaskClass.noRecuresionFibo(9);
		System.out.println("9��° ����: " + result);
		
		result = TaskClass.noRecuresionFibo(10);
		System.out.println("10��° ����: " + result);
		
		result = TaskClass.noRecuresionFibo(11);
		System.out.println("11��° ����: " + result);

		
		TaskClass obj = new TaskClass();
		result = obj.recursiveFibo(9);
		System.out.println("9��° ����: " + result);
		result = obj.recursiveFibo(10);
		System.out.println("10��° ����: " + result);
	}

}
