package exception;


public class InvalidDataException extends Exception {


	private static final long serialVersionUID = 1L;

	public InvalidDataException(String e) {
		super(e);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.getMessage();
	}
}
