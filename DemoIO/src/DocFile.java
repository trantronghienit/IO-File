import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class DocFile {
	public static void main(String[] args) {
		// nó đọc ra 2 loại dữ liệu 1 là int 2 là mảng byte dạng đọc từng kí tự 
		InputStream input = null;
		try {
			input = new FileInputStream("Filedemo.txt");
			while(true){
				// đọc từng kí tự 
				int kitu = input.read();
				// convert về char
				System.out.println((char)kitu);
				
				//+ Cách 1: dùng input.available() kiểm tra số byte của file còn có thể đọc của file nếu == 0 thì dừng  
				if(input.available() == 0) break;
				
				//Cách 2: vì khi nó đọc đến kí tự cuối cùng không còn gì để đọc thì nó sẽ trả về số -1 
				// if(kitu == -1) break;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally{
			try {
				input.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
