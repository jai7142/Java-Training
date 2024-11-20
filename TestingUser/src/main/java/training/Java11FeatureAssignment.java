package training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java11FeatureAssignment extends Java11Feature {

	public static void main(String[] args) {

		/*Assignment 1: Explore String Methods
		Objective: Create a Java program that takes user input for a string and demonstrates the usage of isBlank(), lines(), and strip().*/

		var str = " Hi, Jai. Welcome back ";

		System.out.println(str.isBlank());

		if (!str.isBlank()) {
			System.out.println(str.strip());
			str.lines().forEach(e -> System.out.println(e));
		}

		/*	Assignment 2: Implement a Functional Interface
			Objective: Create a functional interface that processes cargo details and implement it using lambda expressions.*/

		Cargo cargo = () -> {
			System.out.println("Testing the FI");
		};

		cargo.cargoDetail();

		/*	Assignment 3: Stream API in Action
			Objective: Build a Java application that uses the Stream API to manage a collection of cargo items, allowing users to filter, sort, and count items based on criteria.*/

		List<String> cargoListStream = Arrays.asList("Electronics", "Furniture", "Clothing", "Food");

		System.out.println(cargoListStream.stream().filter(e -> e.endsWith("s")).collect(Collectors.toList()));
		System.out.println(cargoListStream.stream().filter(e -> e.endsWith("s")).count());
		System.out.println(cargoListStream.stream().sorted().toList());
	}

}

@FunctionalInterface
interface Cargo {

	public void cargoDetail();
}
