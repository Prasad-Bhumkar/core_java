package userDefineExceptions;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		
		boolean exit = true;
		
		Scanner sc = new Scanner(System.in);
		do {
		System.out.println("Enter your mail : ");
		String email = sc.next();
		
		if (email.contains("@")&&email.contains(".com")) {
			
			System.out.println("Your mail id : "+email);
			
			exit=false;
		} else {
			//type 1
//			try {
//			throw new InvalidEmailException();
//			}catch(Exception e)
//			{
//				System.out.println(e.getMessage());
//			}
			
			//type 2 (passing message from here)
			try {
				throw new InvalidEmailException("you are not allowed to login  ....!");
				}catch(Exception e)
				{
					e.printStackTrace();
				}
		}
		
	}while(exit==true);
		
	}
}