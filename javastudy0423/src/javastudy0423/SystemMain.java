package javastudy0423;

import java.io.IOException;

public class SystemMain {

	public static void main(String[] args) {
		// Hello Java를 10만번 출력하는데 걸리는 시간
		// Hello Java를 10만번 출력
		long start = System.nanoTime();

		for (int i = 1; i <= 100000; i++) {
			System.out.println("Hello Java(" + i + ")");
		}
		long end = System.nanoTime();

		System.out.println("i를 50만번 찍는데 걸리는 시간: " + (end - start) + "초");
		
		String javaVersion = System.getProperty("java.version");
		System.out.println(javaVersion);
		
		//프로세스 실행과 관련된
		Runtime r = Runtime.getRuntime();
		try {
			r.exec("notepad.exe" +
					"C:\\Users\\30409\\Desktop\\0413"	);
			//calc - 계산기	//mspaint 그림판	//notepad 메모장
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//메모장 실행Mac : r.exec("open /System/Applications/TextEdit.app");
		
	}

}
