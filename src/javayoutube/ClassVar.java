package javayoutube;

//선언된 클래스의 모든 인스턴스가 공유하는 클래스 변수
class InstCnt{
	static int instNum = 0; // 클래스 변수 (static 변수)


	InstCnt(){
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	}
}
public class ClassVar {

	public static void main(String[] args) {
		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
	}

}
