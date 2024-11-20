package com.shipment.model;


public class Shipment {

	private String id;
	private Order order;
	private String trackingNumber;
	private String assignedDriver;

	public Shipment(String id, Order order, String trackingNumber, String assignedDriver) {
		super();
		this.id = id;
		this.order = order;
		this.trackingNumber = trackingNumber;
		this.assignedDriver = assignedDriver;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String getTrackingNumber() {
		return trackingNumber;
	}

	public void setTrackingNumber(String trackingNumber) {
		this.trackingNumber = trackingNumber;
	}

	public String getAssignedDriver() {
		return assignedDriver;
	}

	public void setAssignedDriver(String assignedDriver) {
		this.assignedDriver = assignedDriver;
	}
}
