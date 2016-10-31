package DemoWriterReadObject;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class DemoWriterObject {
	
	
	public static void main(String[] args) {
		SinhVien sv = new SinhVien("001" , "Trần Trọng Hiến");
		ObjectOutputStream stream = null;
		try {
			stream = new ObjectOutputStream(new FileOutputStream("SinhVien.dat"));
			stream.writeObject(sv);
		} catch (FileNotFoundException e) {
			System.out.println("không tìm thấy file");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("không ghi đc file");
			e.printStackTrace();
		}finally{
			try {
				stream.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
