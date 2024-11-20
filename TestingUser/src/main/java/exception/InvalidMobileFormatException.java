package exception;


public class InvalidMobileFormatException extends Exception {

	private static final long serialVersionUID = 1L;

	public InvalidMobileFormatException(String e) {
		super(e);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}
}
