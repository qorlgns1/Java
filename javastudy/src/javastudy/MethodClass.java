package javastudy;

public class MethodClass {
	//Call By Value �޼ҵ�
	//�Ű������� �⺻���� �޼ҵ�
	public static void callByValue(int value) {
		System.out.println("�޼ҵ� ���� value: " + value);
		value = value + 1;
		System.out.println("�޼ҵ� ���� value: " + value);
	}
	//�Ű������� �������� �޼ҵ�:Call By Reference
	public static void callByReference(int [] ar) {
		System.out.println("ar[0]: " + ar[0]);
		ar[0] = ar[0] +1;
		System.out.println("ar[0]: " + ar[0]);

	}
}