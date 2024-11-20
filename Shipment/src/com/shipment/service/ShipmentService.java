package com.shipment.service;

import java.util.List;
import java.util.Optional;

import com.shipment.model.Shipment;

public interface ShipmentService {

	public Shipment addProduct(Shipment shipment);

	public Optional<Shipment> getShipment(String shipmentId);

	public Optional<List<Shipment>> getShipments();

	public void deleteShipment(String shipmentId);

	public Shipment updateShipment(String id, Shipment shipment);

}
