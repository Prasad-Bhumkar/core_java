package userDefineExceptions;

public class InvalidAgeException extends RuntimeException{

	public InvalidAgeException() {
		super("Your age is less than 18 years.");
	}

	public InvalidAgeException(String s) {
		super(s);
	}
		
	
}
