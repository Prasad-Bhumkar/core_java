package FileHandling;

import java.io.FileInputStream;
import java.util.Scanner;

public class ReadFromFile {

	public static void main(String[] args) {
		
		String filepath = "D:\\GITHUB_REPOSITORIES\\core_java\\CoreJava\\src\\FileHandling\\file.txt";
		
		try {
			FileInputStream in = new FileInputStream(filepath);
			int data = 0;
			while ((data = in.read())!=-1) {
				System.out.println((char)data);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
