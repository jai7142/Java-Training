package com.shipment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.User;


public class UserServiceImpl implements UserService {

	private static UserServiceImpl userServiceImpl;

	private List<User> users = new ArrayList<>();

	private UserServiceImpl() {
	}

	public static UserServiceImpl getInstance() {
		if (userServiceImpl == null) {
			userServiceImpl = new UserServiceImpl();
		}
		return userServiceImpl;

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

}
