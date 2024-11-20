package lab4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class LabMain {

	public static void main(String[] args) {
		var number = 10; // Inferred as int
		var name = "Air Cargo"; // Inferred as String

		System.out.println("Number: " + number);
		System.out.println("Name: " + name);

		String str = "  Hello, World!  ";

		// isBlank()
		System.out.println("Is string blank? " + str.isBlank());

		// lines()
		str.lines().forEach(System.out::println);

		// strip()
		System.out.println("Stripped string: '" + str.strip() + "'");

		Path filePath = Paths.get("example.txt");

		try {
			// Read all lines from a file
			var lines = Files.readString(filePath);
			System.out.println("File Content: " + lines);
		} catch (IOException e) {
			System.out.println("Error reading file: " + e.getMessage());
		}

		List<String> cargoList = Arrays.asList("Electronics", "Furniture", "Clothing");

		// Using lambda expression to print each item
		cargoList.forEach(item -> System.out.println(item));

	}

}
