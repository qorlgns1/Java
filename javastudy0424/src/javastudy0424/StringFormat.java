package javastudy0424;

public class StringFormat {

	public static void main(String[] args) {
		Integer x = 100;
		Integer y = 300;
		
		//인스턴스를 문자열로 변환 - toString 호출
		//프로그래밍언어마다 이러한 메소드가 존재
		String msg = x.toString();
		
		//문자열과 문자열 결합
		msg = x.toString() + y.toString();
		System.out.println(msg);
		
		//x:  100 y:  200 로 출력
		//숫자는 5자리로 표현
		msg = String.format("x:%5d y:%5d", x, y);
		System.out.println(msg);

	}

}
