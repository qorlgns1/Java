package javastudy0501;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class MovieDTORead {

	public static void main(String[] args) {
		
		try(ObjectInputStream ois = 
				new ObjectInputStream(
								new FileInputStream("2020-05-01.dat"))){
			ArrayList<MovieDTO> list = (ArrayList<MovieDTO>)ois.readObject();
			for(MovieDTO dto : list) {
				System.out.println(dto);
			}
		}catch(Exception e) {}

	}

}
