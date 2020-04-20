package inheritance5polymorphism;

public class Main {

	public static void main(String[] args) {
		Starcraft star = new Zerg();
		star.attack();
		
		star = new Protoss();
		star.attack();
		
		star = new Terran();
		star.attack();

	}

}
