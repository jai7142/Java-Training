package training;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class Java11Feature {

	public static void main(String[] args) {
		// Local Variable Type Inference (var)

		var number = 10; // Inferred as int
		var name = "Air Cargo"; // Inferred as String

		System.out.println("Number: " + number);
		System.out.println("Name: " + name);

		// New String Methods

		String str = "  Hello, World!  ";

		// isBlank()
		System.out.println("Is string blank? " + str.isBlank());

		// lines()
		str.lines().forEach(System.out::println);

		// strip()
		System.out.println("Stripped string: '" + str.strip() + "'");
		
		
		//New Files Methods
		
		 Path filePath = Paths.get("example.txt");
     
     try {
         // Read all lines from a file
         var lines = Files.readString(filePath);
         System.out.println("File Content: " + lines);
     } catch (IOException e) {
         System.out.println("Error reading file: " + e.getMessage());


	}

	// Lambda Expressions
		List<String> cargoList = Arrays.asList("Electronics", "Furniture", "Clothing");

		// Using lambda expression to print each item
		cargoList.forEach(item -> System.out.println(item));

		// Functional Interfaces

		CargoProcessor processor = cargo -> System.out.println("Processing cargo: " + cargo);
		processor.process("Electronics");

		// Stream API

		List<String> cargoListStream = Arrays.asList("Electronics", "Furniture", "Clothing", "Food");

		// Creating a stream and filtering items
		long count = cargoListStream.stream().filter(cargo -> cargo.startsWith("E")).count();

		System.out.println("Count of cargo items starting with 'E': " + count);

		// Method References

		// Using method reference to print items
		cargoList.forEach(System.out::println);


	}
}

@FunctionalInterface
interface CargoProcessor {

	void process(String cargo);
}
