package javastudy;

public class TaskClass {

	// ��͸� �̿����� �ʰ� n��° �Ǻ���ġ ������ ����
	// �������ִ� �޼ҵ�
	public static int noRecuresionFibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			// ���� ��� ���� 2��° ���� ���� �����͸� ������ ����
			int f1 = 1;
			// ���� ��� ���� 2��° ���� ���� �����͸� ������ ����
			int f2 = 1;
			// ���� ��ġ�� �Ǻ���ġ ������ ��
			int fibo = -1;
			for (int i = 3; i <= n; i++) {
				fibo = f1 + f2;
				f2 = f1;
				f1 = fibo;
			}
			return fibo;
		}
	}

	public int recursiveFibo(int n) {
		if (n == 1 || n == 2) {
			return 1;
		} else {
			return recursiveFibo(n - 1) + recursiveFibo(n - 2);
		}
	}

}
