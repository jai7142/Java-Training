package exception;


public class UserIdNotFoundException extends Exception {


	private static final long serialVersionUID = 1L;

	public UserIdNotFoundException(String e) {
		super(e);
	}

	@Override
	public String toString() {
		return this.getMessage();
	}
}
