package userDefineExceptions;

public class InvalidEmailException extends Exception{
	
	public InvalidEmailException() {
		super("Your email address is wrong. Please rewrite !!");
	}

	public InvalidEmailException(String s) {
		super(s);
	}
}
