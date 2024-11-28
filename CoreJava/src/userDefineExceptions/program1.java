package userDefineExceptions;

import java.util.Scanner;

public class program1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age : ");
		int age = sc.nextInt();
		
		if (age>=18) {
			System.out.println("vote here...!");
			System.out.println("1.BJP");
			System.out.println("2.SHIVSENA");
			System.out.println("3.RASHTRAWADI");
			
		} else {
			//type 1
			//throw new InvalidAgeException();
			
			//type 2 (passing message from here)
			throw new InvalidAgeException("you are not allowed to vote....!");
		}
	}
}
