package javastudy0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableMain {

	public static void main(String[] args) {
		//파일에 인스턴스 단위로 기록
		try(ObjectOutputStream oos = 
				new ObjectOutputStream(
						new FileOutputStream("./oo.dat"))){
			//DTO 클래스의 인스턴스를 생성
			DTO dto = new DTO("1","타짜",4.9);
			//파일에 기록
			oos.writeObject(dto);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

		
		try(ObjectInputStream ois = 
				new ObjectInputStream(
						new FileInputStream("./oo.dat"))){
			//DTO 클래스의 인스턴스를 생성
			DTO dto = (DTO)ois.readObject();
			System.out.println(dto);			
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
