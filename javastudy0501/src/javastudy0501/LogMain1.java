package javastudy0501;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class LogMain1 {

	public static void main(String[] args) {
		String ar = null;
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream("C:\\Users\\30409\\Downloads\\log.txt")))) {

			// IP를 중복없이 저장하기 위한 Set을 생성
			ArrayList<String> list = new ArrayList<>();

			// 파일의 전체 내용을 줄 단위로 읽기
			int sum = 0;
			while (true) {
				String line = br.readLine();
				if (line == null) {
					break;
				}
				// 읽은 데이터가 있으면 출력
				// System.out.println(line);

				// 공백을 기준으로 문자열 분할
				String[] data = line.split(" ");
				// 분할된 데이터 중에서 첫번째 데이터만 출력
				// System.out.println(data[9]);
				list.add(data[9]);

				// 문자열을 정수로 변환해서 sum에 더하기
				try {
					sum = sum + Integer.parseInt(data[9]);
				} catch (Exception e) {
				}

			}
			System.out.println(sum);
		} catch (Exception e) {
		}

	}

}
