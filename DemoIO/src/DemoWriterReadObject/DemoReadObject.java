package DemoWriterReadObject;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class DemoReadObject {
	
	public static void main(String[] args) {
		ObjectInputStream read =null;
		try {
			read = new ObjectInputStream(new BufferedInputStream(new FileInputStream("SinhVien.dat")));
			Object obj = read.readObject();
			SinhVien sv = (SinhVien) obj;
			System.out.println(sv);
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
}
