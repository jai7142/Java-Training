package com.shipment.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.shipment.model.Shipment;


public class ShipmentRepositoryImpl implements ShipmentRepository {

	private static ShipmentRepositoryImpl shipmentRepositoryImpl;

	private List<Shipment> shipments = new ArrayList<>();

	private ShipmentRepositoryImpl() {
	}

	public static ShipmentRepositoryImpl getInstance() {
		if (shipmentRepositoryImpl == null) {
			shipmentRepositoryImpl = new ShipmentRepositoryImpl();
		}
		return shipmentRepositoryImpl;

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
