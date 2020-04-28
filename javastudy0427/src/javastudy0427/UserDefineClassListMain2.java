package javastudy0427;

import java.util.ArrayList;
import java.util.Comparator;

public class UserDefineClassListMain2 {

	public static void main(String[] args) {
		ArrayList<Data> list = new ArrayList<>();
		list.add(new Data(1,"배기훈","01020066576","아현동","qorlgns@naver.com","930610"));
		list.add(new Data(2,"임성현","01012341111","아현동","dlatjdgus@naver.com","930610"));
		list.add(new Data(3,"배성민","01012342222","신촌","qotjdals@naver.com","930830"));
		list.add(new Data(4,"강준희","01012343333","강남","rkdwnsgml@naver.com","930610"));
		list.add(new Data(5,"김현준","01012344444","목동","rlaguswns@naver.com","930416"));

		list.sort(new Comparator<Data>(){
			//if를 사용할때 조건문안에 내용은 비교하고싶은대상이 같을때 (비교대상==0)
			//true이면 이름의 역순으로 비교(내가원하는대로)
			//false이면 비교대상=!0 이니깐 기존에 출력하던대로 출력이 된다.
			@Override
			public int compare(Data o1, Data o2) {
				if(o2.getDob().compareTo(o1.getDob())==0) {
					return o2.getAddress().compareTo(o1.getAddress());
				}else {
					return o2.getDob().compareTo(o1.getDob());
				}
				
			}
			
		});

		for(Data data : list) {
			System.out.println(data);
		}
	}

}
