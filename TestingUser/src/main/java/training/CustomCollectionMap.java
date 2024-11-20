package training;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CustomCollectionMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
				new Product("Laptop", 1200),
				new Product("Mouse", 20),
				new Product("Keyboard", 50),
				new Product("Monitor", 200),
				new Product("Charger", 30));

		// Custom Collector
		Map<String, Double> priceRangeTotals = products.stream().collect(Collectors.groupingBy(y -> {
			if (y.getPrice() < 50) {
				return "<50";
			} else if (y.getPrice() < 100) {
				return "50-100";
			} else {
				return ">100";
			}
		}, Collector.of(() -> new double[1], (a, b) -> a[0] += b.getPrice(), (a1, a2) -> {
			a1[0] += a2[0];
			return a1;
		}, a -> a[0])));

		priceRangeTotals.forEach((a, b) -> System.out.println("key->" + a + ", value->" + b));

		System.out.println("Total value by price range: " + priceRangeTotals);

	}

}

class Product {

	Runnable
	String name;
	double price;
	String 

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}
}
