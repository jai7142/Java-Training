package com.shipment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.Order;

public class OrderServiceImpl implements OrderService {

	private static OrderServiceImpl orderServiceImpl;

	private List<Order> odrers = new ArrayList<>();

	private OrderServiceImpl() {
	}

	public static OrderServiceImpl getInstance() {
		if (orderServiceImpl == null) {
			orderServiceImpl = new OrderServiceImpl();
		}
		return orderServiceImpl;

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
