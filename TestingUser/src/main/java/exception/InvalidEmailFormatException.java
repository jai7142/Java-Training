package exception;


public class InvalidEmailFormatException extends Exception {


	private static final long serialVersionUID = 1L;

	public InvalidEmailFormatException(String e) {
		super(e);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}
}
