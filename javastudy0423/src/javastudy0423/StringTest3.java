package javastudy0423;

public class StringTest3 {

	public static void main(String[] args) {
		// 문자열 분할
		// substring은 위치를 가지고 분할
		String msg = "HelloWorld";
		// 4번째 부터 끝까지 문자열을 분열
		System.out.println(msg.substring(4));
		// 4번째 부터 6번째 까지 문자열을 분열
		System.out.println(msg.substring(4, 7));

		String contextPath = "http://localhost:9000";
		String uriString = "http://localhost:9000/index.jsp";
		// uriString 에서 contextPath를 제외한 부분을 출력
		// 잘라낼 글자수를 만들기
		int len = contextPath.length();
		// 잘라내기
		String result = uriString.substring(len);
		System.out.println(result);

		// split은 패턴을 가지고 분할

		String data = "10000,5600,4300,3700";
		// 위의 문자열을 , 로 분할해서 출력하기
		String[] ar = data.split(",");
		// 배열의 데이터 출력
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
		System.out.println("=====================");
		// 배열의 데이터 출력
		// 빠른 열거를 이용한 접근
		// ar의 데이터를 순서대로 temp에 하나씩 대입
		for (String temp : ar) {
			System.out.println(temp);
		}
	}

}
