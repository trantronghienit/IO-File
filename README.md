# Tổng Quan InputStream và OutputStream trong java
![](https://github.com/trantronghienit/IO-File-/blob/master/image/JT_Fig-9-1-550x775.jpg)

## Thao tác với file
### Có 2 kiểu luồng Hỗ trợ ra vào dữ liệu file 
![](https://github.com/trantronghienit/IO-File-/blob/master/image/doc-va-ghi-file-trong-java-5.jpg)

### Inputstream và Outputstream
![inputstream-and-outputstream](https://cloud.githubusercontent.com/assets/18228937/19880140/17161922-a02d-11e6-994f-b49e6862cce6.gif)

+ Ghi File sử dụng Luồng byte

 + Một số phương thức    <br>
```
1 	public void close() throws IOException{}
Phương thức này đóng output stream. Giải phóng bất kỳ nguồn hệ thống nào liên kết với file. Ném một IOException
2 	protected void finalize()throws IOException {}
Phương thức này xóa sự kết nối tới File đó. Bảo đảm rằng phương thức close của output stream này được gọi khi không có tham chiếu nào nữa tới stream này. Ném một IOException
3 	public int read(int r)throws IOException{}
Phương thức này đọc byte dữ liệu đã xác định từ InputStream. Trả về một int. Trả về byte dữ liệu tiếp theo và -1 sẽ được trả về nếu kết thúc file.
4 	public int read(byte[] r) throws IOException{}
Phương thức này đọc r byte từ input stream vào trong một mảng. Trả về tổng số byte đã đọc. Nếu kết thúc file, -1 được trả về.
5 	public int available() throws IOException{}
Cung cấp số byte mà được đọc từ input stream này. Trả về một int
```
 
[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DemoIO_GhiFile.java)

+ Đọc File sử dụng Luồng byte 
 + phương thức :
 ```
1 	public void close() throws IOException{}
Phương thức này đóng output stream. Giải phóng bất kỳ nguồn hệ thống nào liên kết với file. Ném một IOException
2 	protected void finalize()throws IOException {}
Phương thức này xóa sự kết nối tới File đó. Bảo đảm rằng phương thức close của output stream này được gọi khi không có tham chiếu nào nữa tới stream này. Ném một IOException
3 	public void write(int w)throws IOException{}
Phương thức này ghi byte đã xác định tới output stream
4 	public void write(byte[] w)
Ghi w byte từ mảng byte đã đề cập tới OutputStream.
```

[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DocFile.java)

### Readder Và Writter 
![writer-and-read](https://cloud.githubusercontent.com/assets/18228937/19880117/dd5e190a-a02c-11e6-93f8-f7af77a289ca.gif)

+ Ghi (Writter) File dạng ký tự
 + 
[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DemoBuffer/DemoBufferWritter.java)

+ Đọc (Reader) File dạng ký tự
[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DemoBuffer/DemoBufferReader.java)

===================================================
### Đọc Ghi Đối tượng
![](https://github.com/trantronghienit/IO-File-/blob/master/image/read-writer-object.jpg)
+ Chú ý : đối với lớp đối tượng nào ghi vào file thì phải implements serialization 

+ Ghi Object
[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DemoWriterReadObject/DemoWriterObject.java)

+ Đọc Object
[View Code](https://github.com/trantronghienit/IO-File-/blob/master/DemoIO/src/DemoWriterReadObject/DemoReadObject.java)

# FILE 

