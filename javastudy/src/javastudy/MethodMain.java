package javastudy;

public class MethodMain {

	public static void main(String[] args) {
		//MethodClass��
		//static void callByValue(int)
		//�޼ҵ带 ȣ���ؼ� ���
		//static�� �پ �ν��Ͻ� ���� �ʿ� ����
		//�Ű������� ���� 1��
		//����Ÿ���� void
		int n =10;
		MethodClass.callByValue(n);
		//���⼭ n���� �������������� ���������־ �ٲ��� �ʴ´�.
		//�޼ҵ� ���ο����� ���� ���氡�������� �޼ҵ���� ������ ����� �ٲ��� �ʴ´�.
		System.out.println("n: " + n);
		
		int [] xr = {30,20,25};
		//�޼ҵ忡�� �迭�� �Ѱ��־����ϴ�.
		//�迭�� ������ ����Ǿ��� ���� �ֽ��ϴ�.
		MethodClass.callByReference(xr);
		System.out.println("xr[0]: "+ xr[0]);
	}

}