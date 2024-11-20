package com.shipment.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.User;


public class UserRepositoryImpl implements UserRepository {

	private static UserRepositoryImpl userRepositoryImpl;

	private List<User> users = new ArrayList<>();

	private UserRepositoryImpl() {
	}

	public static UserRepositoryImpl getInstance() {
		synchronized (UserRepositoryImpl.class) {
			if (userRepositoryImpl == null) {
				userRepositoryImpl = new UserRepositoryImpl();
			}
		}

		return userRepositoryImpl;

	}

	@Override
	public User addProduct(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUser(String userId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<User>> getUsers() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub

	}

	@Override
	public User updateUser(String id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {

			UserRepositoryImpl user = UserRepositoryImpl.getInstance();

			System.out.println(user.hashCode());

		};

		Thread th = new Thread(runnable);

		th.start();

		Thread th1 = new Thread(runnable);

		th1.start();

		Thread th2 = new Thread(runnable);
		th2.start();

	}

}
