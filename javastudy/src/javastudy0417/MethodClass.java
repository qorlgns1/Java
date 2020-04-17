package javastudy0417;

public class MethodClass {
	//Call By Value 메소드
	//매개변수가 기본형인 메소드
	public static void callByValue(int value) {
		System.out.println("메소드 내의 value: " + value);
		value = value + 1;
		System.out.println("메소드 내의 value: " + value);
	}
	//매개변수가 참조형인 메소드:Call By Reference
	public static void callByReference(int [] ar) {
		System.out.println("ar[0]: " + ar[0]);
		ar[0] = ar[0] +1;
		System.out.println("ar[0]: " + ar[0]);

	}
}