package com.shipment.service;

import java.util.List;
import java.util.Optional;

import com.shipment.model.User;

public interface UserService {

	public User addProduct(User user);

	public Optional<User> getUser(String userId);

	public Optional<List<User>> getUsers();

	public void deleteUser(String userId);

	public User updateUser(String id, User user);

}
