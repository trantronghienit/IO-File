package DemoBuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoBufferReader {
	public static void main(String[] args) {
		BufferedReader read = null;
		try {
			read = new BufferedReader(new FileReader("demoFile.txt"));
			
			while(true){
				// không đọc được nữa thì thoát 
				if(read.readLine() == null){
					break;
				}
				// đọc và in ra từng dòng 
				System.out.println(read.readLine());
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				read.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
