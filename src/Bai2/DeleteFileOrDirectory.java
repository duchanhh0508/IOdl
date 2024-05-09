package Bai2;
import java.io.File;
import java.util.Scanner;
public class DeleteFileOrDirectory {
  public static void main(String[] args) {
	  Scanner scanner = new Scanner(System.in);
	  System.out.println("Nhập đường dẫn thư mục hoặc file: ");
	  String path = scanner.nextLine();
	  File fileOrDirectory = new File(path);
	  if(fileOrDirectory.delete()) {
		  System.out.println("Đã xóa thành công:"+path);
	  } else {
		  System.out.println("Không thể xóa: "+path);
	  }
  }
}
