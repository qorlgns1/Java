package javayoutube;

interface father{}
interface mather{}
interface programmer{
	public void coding();
}
interface believer{}
class Steve implements father, programmer, believer{
	public void coding() {
		System.out.println("fast");
	}
}

class Rechel implements mather, programmer{
	public void coding() {
		System.out.println("elegance");
	}
}

public class Polymorphism3Workspace {

	public static void main(String[] args) {
		programmer employee1 = new Steve();
		programmer employee2 = new Rechel();

		employee1.coding();
		employee2.coding();

	}

}
