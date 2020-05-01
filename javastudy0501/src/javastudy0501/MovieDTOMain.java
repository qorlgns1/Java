package javastudy0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class MovieDTOMain {

	public static void main(String[] args) {
		// MovieDTO 클래스의 인스턴스 2개 만들기
		MovieDTO obj1 = new MovieDTO(1, "기생충", "봉준호", "배기훈");
		MovieDTO obj2 = new MovieDTO(2, "그는 프로그래머이다", "이강석", "임성현");
		
		ArrayList<MovieDTO> al = new ArrayList<>();
		al.add(obj1);
		al.add(obj2);
		
		//오늘 날짜를 문자열로 만들기
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		String today = sdf.format(date);
		//System.out.println(today);
		
		//파일에 기록
		//ObjectOutStream
		//FileOutputStream 인스턴스를 이용해서 생성
		//파일의 경로를 가지고 생성
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(
								new FileOutputStream(today + ".dat"))){
			//파일에 기록
			oos.writeObject(al);
		}catch(Exception e) {}
	}

}
