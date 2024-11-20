package com.shipment.model;


public class Order {

	private String id;
	private String customer;
	private String destination;
	private double weight;
	private String status;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Order(String id, String customer, String destination, double weight, String status) {
		super();
		this.id = id;
		this.customer = customer;
		this.destination = destination;
		this.weight = weight;
		this.status = status;
	}

}
