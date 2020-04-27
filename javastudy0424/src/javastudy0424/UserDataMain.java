package javastudy0424;

import java.util.Arrays;
import java.util.Comparator;

public class UserDataMain {

	public static void main(String[] args) {
		UserData [] ar = new UserData[3];
		
		UserData user1 = new UserData();
		user1.setName("배기훈");
		user1.setAge("28");
		user1.setSalary("50000000");
		ar[0] = user1;
				
		ar[1] = new UserData();
		ar[1].setName("임성현");
		ar[1].setAge("28");
		ar[1].setSalary("30000000");
		
		ar[2] = new UserData();
		ar[2].setName("배성민");
		ar[2].setAge("28");
		ar[2].setSalary("20000000");

		//정렬 - 예외 발생
		//ar은 UserData의 배열이고 UserData는
		//Comparable 인터페이스가 implements 되지 않아서
		//크기 비교하는 방법을 알지 못하기 때문입니다.
		//ex )            Arrays.sort(ar);
		//방법1
		Comparator<UserData> comp1 = new Comparator() {

			@Override
			public int compare(Object a1, Object a2) {
				UserData a3 = (UserData)a1;
				UserData a4 = (UserData)a2;
				return a3.getName().compareTo(a4.getName());
			}
			
		};
		Arrays.sort(ar, comp1);
		
		//방법2
//		Arrays.sort(ar, new Comparator<UserData>() {
//
//			@Override
//			public int compare(UserData a1, UserData a2) {
//				UserData a3 = (UserData)a1;
//				UserData a4 = (UserData)a2;
//				return a3.getName().compareTo(a4.getName());
//			}
//			
//		});
		
		
		//배열의 데이터 전부 출력
		for(UserData temp : ar) {
			System.out.println(temp);
		}
//		System.out.println("==============");
		//for문으로 변경할때 이렇게 사용
//		for (int i = 0; i < ar.length; i++) {
//			System.out.println(ar[i]);
//		}
	}

}
