package javayoutube;

class Man { 
	String name;
	public void tellYourName() {
		System.out.println("My name is " + name);
	}
}

class BusinessMan extends Man{
	String company;
	String position;
	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}	
}
public class ExtendsExample {

	public static void main(String[] args) {
		
		BusinessMan bae = new BusinessMan(); 
		bae.name = "배기훈";
		bae.company = "삼성";
		bae.position = "앱개발";
		bae.tellYourName();
	}

}
