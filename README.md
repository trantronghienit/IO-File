# Tổng Quan InputStream và OutputStream trong java
## Mục Lục: 
+ ![kiểu luồng Hỗ trợ ra vào dữ liệu](https://github.com/trantronghienit/IO-File-/blob/master/README.md#c%C3%B3-2-ki%E1%BB%83u-lu%E1%BB%93ng-h%E1%BB%97-tr%E1%BB%A3-ra-v%C3%A0o-d%E1%BB%AF-li%E1%BB%87u-file)
 + ![Inputstream và Outputstream](https://github.com/trantronghienit/IO-File-/blob/master/README.md#inputstream-v%C3%A0-outputstream)
 + ![Readder Và Writter](https://github.com/trantronghienit/IO-File-/blob/master/README.md#readder-v%C3%A0-writter)
+ ![Đọc Ghi Đối tượng](https://github.com/trantronghienit/IO-File-/blob/master/README.md#%C4%90%E1%BB%8Dc-ghi-%C4%90%E1%BB%91i-t%C6%B0%E1%BB%A3ng)
+ ![serialization là gì ?](https://github.com/trantronghienit/IO-File-/blob/master/README.md#serialization-l%C3%A0-g%C3%AC-)
+ ![FILE](https://github.com/trantronghienit/IO-File-/blob/master/README.md#file)


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

### serialization là gì ?
+ là 1 cơ chế, được gọi là đối tuợng tuần tự (object serialization) , là quá trình chuyển các cấu trúc dữ liệu và các đối tượng thành một định dạng có thể lưu trữ được ***(vào file, in-memory buffer, hoặc truyền qua network)***
### Tại sao lại phải dùng serialization
+ vì serialization giúp class (đối tuợng) biểu diễn đuợc  như một chuỗi các bytes đuợc sắp xếp tuần tự bao gồm ***dữ liệu*** của đối tượng cũng như ***thông tin về kiểu*** của đối tượng và ***kiểu dữ liệu được lưu trữ*** trong đối tượng.
+ khi nào thì cần dùng :
 + khi muốn xử lý (vào file, in-memory buffer, hoặc truyền qua network)

***Ví Dụ Điển Hình Cho Việc Khi Nào Sử Dụng serialization***
+ Một hệ thống Doanh Nghiệp điển hình thường có các thành phần nằm phân tán rải rác trên các hệ thống và mạng khác nhau. Trong Java mọi thứ đều được miêu tả như là một object. Nếu 2 thành phần Java cần liên lạc với nhau, ta cần phải có một cơ chế để chúng trao đổi dữ liệu. Serialization được định nghĩa cho mục đích này, và các thành phần Java sẽ sử dụng giao thức (protocol) này để truyền các object qua lại với nhau.
+ Có thể dùng trao đối dữ liệu giữa 2 hệ thông khác nhau sử dụng thuật tóan tuần tự hóa mà không phụ thuộc vào nền tảng giữa chúng.

một cơ chế liên quan serialization là : ![Parcelable](https://github.com/trantronghienit/Parcelable-Serializable-trong-Java-Android-)
 
# FILE 
## Properties 
[code demo](https://github.com/trantronghienit/IO-File/blob/master/PropertiesFile.java)
