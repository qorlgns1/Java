package javastudy0427;

import java.util.Stack;

public class StackMain {

	public static void main(String[] args) {
		//스택 생성
		Stack <String> stack = new Stack();
		//스택에 데이터를 삽입
//		stack.push("배기훈");

		//스택에서 데이터를 꺼내기
		String data = stack.pop();
		System.out.println(data);
		data = stack.pop();
	}

}
