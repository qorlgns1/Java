package javastudy;

public class MethodMain {

	public static void main(String[] args) {
		//MethodClass의
		//static void callByValue(int)
		//메소드를 호출해서 사용
		//static이 붙어서 인스턴스 생성 필요 없음
		//매개변수는 정수 1개
		//리턴타입은 void
		int n =10;
		MethodClass.callByValue(n);
		//여기서 n값을 변경하지않으면 무슨일이있어도 바뀌지 않는다.
		//메소드 내부에서는 값이 변경가능하지만 메소드밖을 나오면 절대로 바뀌지 않는다.
		System.out.println("n: " + n);
		
		int [] xr = {30,20,25};
		//메소드에게 배열을 넘겨주었습니다.
		//배열의 내용이 변경되었을 수도 있습니다.
		MethodClass.callByReference(xr);
		System.out.println("xr[0]: "+ xr[0]);
	}

}