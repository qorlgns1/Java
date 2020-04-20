package javayoutube;

class A{
	public String x() {return "A.x";}
}
class B extends A{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
public class Polymorphism{
	public static void main(String[] args) {
		A obj = new B();
		//자식클래스를 인스턴스화 하고 obj의 형태는 부모클래스를 하고있지만
		//obj에서 리턴 y를 출력하더라도 부모A클래서에서 정의된바가 없기때문에
		//리턴 y는 출력되지 않는다.
		System.out.println(obj.x());
		//아래 문장은 obj 클래스 b이고 클래스a를 상속받고있지만
		//클래스 a에는 obj.y()가 없으므로 출력이 안되는 모습을 볼 수 있다.
		//System.out.println(obj.y());
	}
}