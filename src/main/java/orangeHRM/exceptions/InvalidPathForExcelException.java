package orangeHRM.exceptions;

@SuppressWarnings("serial")
public class InvalidPathForExcelException extends FrameworkException{

	public InvalidPathForExcelException(String mesg) {
		super(mesg);
	}
	
	public InvalidPathForExcelException(String mesg, Throwable cause) {
		super(mesg, cause);
	}

}
