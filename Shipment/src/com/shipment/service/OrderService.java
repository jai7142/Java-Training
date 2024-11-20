package com.shipment.service;

import java.util.List;
import java.util.Optional;

import com.shipment.model.Order;

public interface OrderService {

	public Order addOrder(Order order);

	public Optional<Order> getOrder(String orderId);

	public Optional<List<Order>> getOrders();

	public void deleteOrder(String orderId);

	public Order updateOrder(String id, Order order);

}
