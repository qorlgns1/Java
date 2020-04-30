package javastudy0428;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	public static void main(String[] args) {
		//날짜 서식은 SimpleDateFormat
		//2020년 4월 28일 오후 5시 47분 형식으로 출력
		Date date = new Date();
		
		SimpleDateFormat sim = new SimpleDateFormat
				("yyyy년 MM월 dd일 EEE a hh시 mm분");
		
		String msg = sim.format(date);
		System.out.println(msg);
		
		//숫자 서식 만들기
		DecimalFormat df = new DecimalFormat("\u00A4 #,###.00");
		msg = df.format(125000);
		System.out.println(msg);
	}

}
