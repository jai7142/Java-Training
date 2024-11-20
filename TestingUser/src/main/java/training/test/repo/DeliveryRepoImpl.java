package training.test.repo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import exception.InvalidDataException;
import training.test.Delivery;


public class DeliveryRepoImpl implements DeliveryRepo {

	private List<Delivery> deliveries = new ArrayList<>();

	// Save a new delivery
	@Override
	public void save(Delivery delivery) {
		// deliveries.add(delivery);
	}

	// Find a delivery by its ID
	@Override
	public Optional<Delivery> findById(String deliveryId) {
		return deliveries.stream().filter(delivery -> delivery.getDeliveryId().equals(deliveryId)).findFirst();
	}

	// Get all deliveries
	@Override
	public List<Delivery> findAll() {
		return new ArrayList<>(deliveries);
	}

	// Update an existing delivery
	@Override
	public void update(Delivery delivery) {
		Optional<Delivery> existingDelivery = findById(delivery.getDeliveryId());
		if (existingDelivery.isPresent()) {
			deliveries.remove(existingDelivery.get());
			deliveries.add(delivery);
		}
	}

	// Delete a delivery by its ID
	@Override
	public void deleteById(String deliveryId) {
		deliveries.removeIf(delivery -> delivery.getDeliveryId().equals(deliveryId));
	}

	// Get deliveries that are completed
	@Override
	public List<Delivery> findCompletedDeliveries() {
		List<Delivery> completedDeliveries = new ArrayList<>();
		/*for (Delivery delivery : deliveries) {
			if (delivery.isCompleted()) {
				completedDeliveries.add(delivery);
			}
		}*/
		completedDeliveries = deliveries.stream().filter(e -> e.isCompleted()).toList();

		return completedDeliveries;
	}

	@Override
	public List<Delivery> findRevenuesexceedFifty() {
		return deliveries.stream().filter(e -> e.getRevenue() > 50d).toList();
	}

	@Override
	public void isDeliveried(String id) {
		
		
		
		List<Delivery> del = deliveries.stream()
    .filter(e -> !e.isCompleted() && e.getDeliveryId().equals(id))
    .map(a -> {
        a.setCompleted(true); 
        return a;              
    })
    .collect(Collectors.toList());
		
		List<Delivery> dellist = deliveries.stream().map(a -> {
      a.setCompleted(true);  
      return a;             
		}).collect(Collectors.toList());

	}

	@Override
	public void deleteDevliveried() {
		
		deliveries.stream().filter(e -> !e.isCompleted()).collect(Collectors.toList()).removeAll(deliveries);
		
		// deliveries.removeIf(e -> e.isCompleted());

	}

	// Delete : Remove deliveries
	// Remove completed deliveries

	// Analysis: Advanced operations
	// Compute total revenue
	// Average delvery time

	
// revenue-to-Time Ratio ( Higher is better)
public List<Delivery> findTopKPerformingDeliveries(int k) {
	return deliveries.stream()
			.filter(e -> e.isCompleted())
			.sorted((a, b) -> Double.compare(a.getDoubledeliveryTimeInHours(), b.getDoubledeliveryTimeInHours()))
			.limit(k)
			.toList();
}
	
	
	public double calculateTotalRevenue() {
		return deliveries.stream().mapToDouble(e -> e.getRevenue()).sum();
	}

	public double calculateAverageDeliveryTime() throws InvalidDataException {
		return deliveries.stream()
				.mapToDouble(e -> e.getDoubledeliveryTimeInHours())
				.average()
				.orElseThrow(() -> new InvalidDataException(""));

	}
}
