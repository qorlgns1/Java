package datashare;

public class Main {

	public static void main(String[] args) {
		//클래스의 인스턴스 2개 생성
		Tjoeun temp1 = new Tjoeun();
		Tjoeun temp2 = new Tjoeun();
		
		//noShare는 인스턴스 프로퍼티이므로 변경해도
		//다른 인스턴스에는 아무런 영향이 없습니다.
		temp1.noShare = "안녕 temp2";
		
		System.out.println(temp2.noShare);
		
		//static 프로퍼티는 공유를 한다.
		temp1.msg = "안녕 msg2";
		temp2.msg = "안녕 msg1";
		System.out.println(temp2.msg);
		System.out.println(temp1.msg);
		
		temp1.globalChange();
		
		System.out.println(GlobalClass.globalMsg);
		
		Singleton s1 = Singleton.sharedInstance();
		Singleton s2 = Singleton.sharedInstance();

		//2개의 인스턴스가 동일한 인스턴스인지 확인할 때는 해시코드 이용
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));

		Singleton.sharedInstance().sharedVariable ="Singleton";
		s1.sharedVariable ="Singleton";
		System.out.println(s1.sharedVariable);

		System.out.println(Singleton.sharedInstance().sharedVariable);
		
		Parent p = new Parent();
		
		int result = Math.max(20,30);
		System.out.println(result);
	}

}
