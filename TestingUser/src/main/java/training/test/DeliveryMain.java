package training.test;

import java.util.Arrays;
import java.util.List;

public class DeliveryMain {

	public static void main(String[] args) {

		List<Delivery> deliveries = Arrays.asList(
		    new Delivery("D1", true, 1.5, 10.0, 50.0),  // Completed
		    new Delivery("D2", false, 2.0, 15.0, 70.0), // Pending
		    new Delivery("D3", true, 1.0, 8.0, 40.0),   // Completed
		    new Delivery("D4", true, 3.0, 20.0, 90.0),  // Completed
		    new Delivery("D5", false, 0.5, 5.0, 20.0),  // Pending
				new Delivery("D6", true, 2.0, 12.0, 80.0)); // Completed
	}

}
