package orangeHRM.exceptions;

@SuppressWarnings("serial")
public class PropertyFileUsageException extends FrameworkException{

	public PropertyFileUsageException(String mesg) {
		super(mesg);
	}
	
	public PropertyFileUsageException(String mesg, Throwable cause) {
		super(mesg, cause);
	}

}
