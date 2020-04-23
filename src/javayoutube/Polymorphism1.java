package javayoutube;

//class A{
//	public String x() {return "A.x";}
//}
class B extends A{
	public String x() {return "B.x";}
	public String y() {return "y";}
}
class B2 extends A{
	public String x() {return "B2.x";}
}
public class Polymorphism1{
	public static void main(String[] args) {
		A obj = new B();
		A obj2 = new B2();
		//자식클래스에서 오버로딩한것이 출력된다.
		System.out.println(obj.x());
		System.out.println(obj2.x());
	}
}