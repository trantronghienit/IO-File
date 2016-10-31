package DemoWriterReadObject;

import java.io.Serializable;

// implements Serializable để đánh dấu class này dùng để chuyển và ghi dữ liệu 
public class SinhVien implements Serializable{
	
	private String MaSv;
	private String Hoten ;
	
	
	public SinhVien() {
		super();
	}

	public SinhVien(String maSv, String hoten) {
		super();
		MaSv = maSv;
		Hoten = hoten;
	}

	public String getMaSv() {
		return MaSv;
	}

	public void setMaSv(String maSv) {
		MaSv = maSv;
	}

	public String getHoten() {
		return Hoten;
	}

	public void setHoten(String hoten) {
		Hoten = hoten;
	}

	@Override
	public String toString() {
		//return String.format("SinhVien{Mã %s , %s }" , MaSv , Hoten );
		return "Sinh viên{ Mã Sinh Viên: " + MaSv + " , Họ Tên: " + Hoten + "}" ;
	}
	

}
