package com.shipment.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.Shipment;


public class ShipmentServiceImpl implements ShipmentService {

	private static ShipmentServiceImpl shipmentServiceImpl;

	private List<Shipment> shipments = new ArrayList<>();

	private ShipmentServiceImpl() {
	}

	public static ShipmentServiceImpl getInstance() {
		if (shipmentServiceImpl == null) {
			shipmentServiceImpl = new ShipmentServiceImpl();
		}
		return shipmentServiceImpl;

	}

	@Override
	public Shipment addProduct(Shipment shipment) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Shipment> getShipment(String shipmentId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<List<Shipment>> getShipments() {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void deleteShipment(String shipmentId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Shipment updateShipment(String id, Shipment shipment) {
		// TODO Auto-generated method stub
		return null;
	}

}
