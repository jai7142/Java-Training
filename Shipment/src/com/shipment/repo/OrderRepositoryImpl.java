package com.shipment.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.Order;


public class OrderRepositoryImpl implements OrderRepository {

	private static OrderRepositoryImpl orderRepositoryImpl;

	private List<Order> orders = new ArrayList<>();

	private OrderRepositoryImpl() {
	}

	public static OrderRepositoryImpl getInstance() {
		if (orderRepositoryImpl == null) {
			orderRepositoryImpl = new OrderRepositoryImpl();
		}
		return orderRepositoryImpl;

	}

	@Override
	public Order addOrder(Order order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Order> getOrder(String orderId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Order>> getOrders() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteOrder(String orderId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Order updateOrder(String id, Order order) {
		// TODO Auto-generated method stub
		return null;
	}

}
