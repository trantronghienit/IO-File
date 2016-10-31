import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class DemoIO_GhiFile {

	public static void main(String[] args) {
		// 
		OutputStream output = null;
		try {
									   // tên file , true là có apen tức ghi đè lên dữ liệu cũ 		
			output = new FileOutputStream("Filedemo.txt" , false);
			int n;
			System.out.println("Nhập vào 1 số : ");
			// ở đây ta truyền vào n = 64 nó sẽ ra ký tự @ vì nó đọc từ kí tự 
			String chuoi = "truyền vào 1 số nguyên: ";
			n = new Scanner(System.in).nextInt();
			output.write(chuoi.getBytes());
			output.write(n);
			// System.lineSeparator() xuống hàng trong file 
			//output.write(System.lineSeparator().getBytes());
			output.write("\r\n".getBytes());
			
			// muốn truyền 64 vẫn ra 64 thì ta nên ép kiểu về String 
			
			String s = "sau khi ep kiểu: " + String.valueOf(n);
			output.write(s.getBytes());  // out File chỉ ghi xuống được mảng byte và số nguyên thôi 
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				output.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
