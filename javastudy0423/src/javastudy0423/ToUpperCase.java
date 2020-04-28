package javastudy0423;

public class ToUpperCase {

	public static void main(String[] args) {
		String os1 = "iOS";
		String os2 = "ioS";
		String os3 = "Windows";
		
		//위 3개의 문자열이 ios 인지 확인
		System.out.println(
			os1.toUpperCase().equals("IOS"));
		System.out.println(
			os2.toUpperCase().equals("IOS"));
		System.out.println(
			os3.toUpperCase().equals("IOS"));

	}

}
