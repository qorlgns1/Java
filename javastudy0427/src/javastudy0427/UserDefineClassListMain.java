package javastudy0427;

import java.util.ArrayList;
import java.util.Comparator;

public class UserDefineClassListMain {

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<>();
		list.add(new Data(1,"배기훈","01020066576","아현동","qorlgns@naver.com","930610"));
		list.add(new Data(2,"임성현","01012341111","이대","dlatjdgus@naver.com","930623"));
		list.add(new Data(3,"배성민","01012342222","신촌","qotjdals@naver.com","930830"));
		list.add(new Data(4,"강준희","01012343333","강남","rkdwnsgml@naver.com","930604"));
		list.add(new Data(5,"김현준","01012344444","목동","rlaguswns@naver.com","930416"));

		list.sort(new Comparator<Data>(){

			@Override
			public int compare(Data o1, Data o2) {
				
				return o1.getPhone().compareTo(o2.getPhone());
			}
			
		});

		for(Data data : list) {
			System.out.println(data);
		}
	}

}
