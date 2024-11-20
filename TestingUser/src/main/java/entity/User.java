package entity;

import java.util.UUID;
import java.util.regex.Pattern;

import exception.InvalidEmailFormatException;
import exception.InvalidMobileFormatException;

public class User {

	private static final String EMAIL_PATTERN = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
	private static final Pattern emailPattern = Pattern.compile(EMAIL_PATTERN);

	private static final String MOBILE_PATTERN = "^[1-9][0-9]{9}$";
	private static final Pattern mobilePattern = Pattern.compile(MOBILE_PATTERN);
	private UUID id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private Long mobileNumber;

	public User(
			String firstName,
			String lastName,
			String password,
			String email,
			Long mobileNumber) throws InvalidEmailFormatException, InvalidMobileFormatException {
		id = UUID.randomUUID();
		setUserName(firstName, lastName);
		setFirstName(firstName);
		setLastName(lastName);
		setPassword(password);
		setEmail(email);
		setMobileNumber(mobileNumber);
	}

	public UUID getId() {
		return id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String firstName, String lastName) {
		this.userName = firstName + lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName != null && firstName.length() >= 2) {
		this.firstName = firstName;
	}
}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName != null && lastName.length() >= 1) {
		this.lastName = lastName;
		}
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password != null && password.length() >= 10) {
			this.password = password;
		}
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) throws InvalidEmailFormatException {
		if (email != null && emailPattern.matcher(email).matches()) {
			this.email = email;
		} else {
			throw new InvalidEmailFormatException("Invalid email format.");
		}
	}

	public Long getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(Long mobileNumber) throws InvalidMobileFormatException {
		if (mobileNumber != null && mobilePattern.matcher(mobileNumber.toString()).matches()) {
			this.mobileNumber = mobileNumber;
		} else {
			throw new InvalidMobileFormatException("Invalid mobile number format.");
		}
	}
	
}
