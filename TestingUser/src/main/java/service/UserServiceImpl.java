package service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import entity.User;
import exception.InvalidEmailFormatException;
import exception.InvalidMobileFormatException;
import repo.UserRepository;
import repo.UserRepositoryImpl;

public class UserServiceImpl implements UserService {
	
	private UserRepository userRepository = UserRepositoryImpl.getInstance();

	private static UserServiceImpl userServiceImpl;

	private UserServiceImpl() {
	}

	//singleton concept
	public static UserServiceImpl getInstance() {
		if (userServiceImpl == null) {
			userServiceImpl = new UserServiceImpl();
		}
		return userServiceImpl;

	}

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepository.addUser(user);
	}

	@Override
	public Optional<User> getUserById(String id) {
		return userRepository.getUserById(id);
	}

	@Override
	public Optional<List<User>> getUsers() {
		return userRepository.getUsers();
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteUser(id);

	}

	@Override
	public User updateUser(String id, User user) throws InvalidEmailFormatException, InvalidMobileFormatException {
		return userRepository.updateUser(id, user);
	}
	
	Iterator<E>
}
