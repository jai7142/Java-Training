package repo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.Consumer;

import entity.User;
import exception.InvalidEmailFormatException;
import exception.InvalidMobileFormatException;

public class UserRepositoryImpl implements UserRepository {
	
	private static UserRepositoryImpl userRepositoryImpl;

	//private List<User> users = new ArrayList<>();
	//private List<User> users = new LinkedList<>();

	private Set<User> users = new HashSet<>();
	
	private UserRepositoryImpl() {
	}

	public static UserRepositoryImpl getInstance() {
		if (userRepositoryImpl == null) {
			userRepositoryImpl = new UserRepositoryImpl();
		}
		return userRepositoryImpl;

	}

	

	@Override
	public User addUser(User user) {
		boolean result = users.add(user);
		if (result) {
			return user;
		}
		return null;
	}

	@Override
	public Optional<User> getUserById(String id) {
		UUID uuid = UUID.fromString(id);

		/*
		 * for (User user : users) { if (user.getId().equals(uuid)) { return
		 * Optional.of(user); } }
		 */
		//atomic ref concepts
		
		/*
		 * AtomicReference<User> atomicRef = new AtomicReference<User>(); Consumer<User>
		 * consumer = e -> { if (e.getId().toString().equals(id)) { atomicRef.set(e); }
		 * }; users.forEach(consumer); return Optional.ofNullable(atomicRef.get());
		 */
		
		//stream API concept
		
		return users.stream().filter(e-> e.getId().toString().equals(id)).findFirst();
	}

	@Override
	public Optional<List<User>> getUsers() {
		if (users.isEmpty()) {
			return Optional.empty();
		} else {
			return Optional.of(new ArrayList<>(users));
		}
	}

	@Override
	public void deleteUser(String id) {
		Optional<User> userOpt = getUserById(id);
		if (userOpt.isPresent()) {
			users.remove(userOpt.get());
			System.out.println("User with ID " + id + " deleted.");
		} else {
			System.out.println("User with ID " + id + " not found.");
		}

	}

	@Override
	public User updateUser(String id, User user) throws InvalidEmailFormatException, InvalidMobileFormatException {
		Optional<User> existUset = getUserById(id);
		if (existUset.isPresent()) {
			User userobj = existUset.get();
			//Arraylist concept
			//int index = users.indexOf(userobj);
			//users.add(index, user);
			
			//Hashset concept
			users.remove(userobj);
			users.add(user);
			
			return user;
		}
		return user;
	}

	
	private void test() {
		// TODO Auto-generated method stub
		
		Consumer<User> consumer = e -> System.out.println(e);
		users.forEach(consumer);

	}

	
}
