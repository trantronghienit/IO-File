package DemoBuffer;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class DemoBufferWritter {
	
	public static void main(String[] args) {
		BufferedWriter writer = null;
		try {
			// nối ống FileWriter có chức năng đọc từng dòng gắn với ống BufferedWriter có chức năng write nhưng có bộ đệm 
			writer = new BufferedWriter(new FileWriter("demoFile.txt" , true));
			System.out.println("Nhập 2 dòng text: ");
			for (int i = 0; i < 2; i++) {
				String s = new Scanner(System.in).nextLine();
				writer.write(s);
				writer.newLine();  // để xuống dòng
			}
			writer.flush();  // đẩy dữ liệu đi 
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
