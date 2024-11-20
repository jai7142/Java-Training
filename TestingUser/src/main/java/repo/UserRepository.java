package repo;

import java.util.List;
import java.util.Optional;

import entity.User;
import exception.InvalidEmailFormatException;
import exception.InvalidMobileFormatException;

public interface UserRepository {
	
	public User addUser(User user);

	public Optional<User> getUserById(String id);

	public Optional<List<User>> getUsers();

	public void deleteUser(String id);

	public User updateUser(String id, User user) throws InvalidEmailFormatException, InvalidMobileFormatException;

}
