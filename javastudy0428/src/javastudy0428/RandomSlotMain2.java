package javastudy0428;

import java.util.Random;

public class RandomSlotMain2 {

	public static void main(String[] args) {
		Random r = new Random();
		String [] slot = {"!","?","*","%"};
		String msg = "";
		for (int i = 0; i < 3; i++) {
			msg = msg + slot[r.nextInt(slot.length)];
		}
		System.out.println(msg);
		if(msg.charAt(0) == msg.charAt(1) 
				&& msg.charAt(1) == msg.charAt(2)) {
			System.out.println("축하합니다. !!!!");
		}else {
			System.out.println("꽝");
		}
		
		System.out.println(""+""+""+""+""+"?");
	}

}
