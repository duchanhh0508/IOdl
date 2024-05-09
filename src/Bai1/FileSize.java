package Bai1;
import java.io.File;
import java.util.Scanner;
public class FileSize {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập đường dẫn file:");
		String filePath = scanner.nextLine();
		File file = new File(filePath);
		long fileSize = file.length();
		System.out.println("Độ lớn của file là: "+fileSize+"bytes");
	}

}
