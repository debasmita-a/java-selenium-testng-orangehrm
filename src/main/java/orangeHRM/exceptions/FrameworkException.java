package orangeHRM.exceptions;

public class FrameworkException extends RuntimeException{
	
	public FrameworkException(String mesg) {
		super(mesg);
	}
	
	public FrameworkException(String mesg, Throwable cause) {
		super(mesg, cause);
	}
}
