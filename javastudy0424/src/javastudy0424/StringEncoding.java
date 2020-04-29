package javastudy0424;

import java.io.UnsupportedEncodingException;

public class StringEncoding {

	public static void main(String[] args) {
		// 한글을 저장한 문자열 인스턴스
		String hangul = "한글 문자열";

		// 바이트 배열로 변환
		try {
			byte[] bytes = hangul.getBytes("UTF-8");
			// 위의 바이트 배열의 데이터를 전부 출력
			for (byte b : bytes) {
				System.out.println(b);
			}
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

	}

}
