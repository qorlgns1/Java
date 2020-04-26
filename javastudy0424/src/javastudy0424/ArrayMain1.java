package javastudy0424;

public class ArrayMain1 {

	public static void main(String[] args) {
		String[] data = { "3000", "4000", "-", "4500" };
		int sum = 0;
		// 위의 4개를 정수로 변환해서 합계를 구하기

		for (String temp : data) {

			// System.out.println(temp);
			// 문자열을 정수로 변환해서  sum에 더하기
			try {
			sum = sum + Integer.parseInt(temp);
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		String msg = String.format("합계: %d", sum);
		System.out.println(msg);
		
		
		Double a = Double.parseDouble(arg0)
	}
	
}
