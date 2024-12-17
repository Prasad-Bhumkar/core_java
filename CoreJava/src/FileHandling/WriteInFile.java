package FileHandling;

import java.io.FileOutputStream;
import java.util.Scanner;

public class WriteInFile {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("type here........");
		
		//creating container for user entered text
		
		String data = sc.nextLine();
		
		String filepath = "D:\\GITHUB_REPOSITORIES\\core_java\\CoreJava\\src\\FileHandling\\file.txt";
		try (FileOutputStream fout = new FileOutputStream(filepath)) {
			fout.write(data.getBytes());
			System.out.println("data stored in the file successfully....");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
