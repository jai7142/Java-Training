package training;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTesting {

	public static void main(String[] args) {

		long s = System.currentTimeMillis();

		System.out.println(s);

		List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "orange", "jack");
		// List<String> result = new ArrayList<>();
		List<String> result = words.stream()
						.filter(a -> a.length() > 5)
						.map(e -> e.toUpperCase())
				.collect(Collectors.toList());
		
		long e = System.currentTimeMillis();

		// System.out.println(e);
		/*	for (String word : words) {
					if(word.length()>5) {
						result.add(word.toUpperCase());
					}
			}*/

		result.stream().forEach(e1 -> System.out.println(e1));
		result.forEach(e2 -> System.out.println(e2));
	}

}
