package training;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();

		map.put("A", 10);
		map.put("B", 20);
		map.put("C", 30);
		map.put("D", 40);
		map.put("E", 50);
		map.put("R", 60);

		for (Map.Entry<String, Integer> entry : map.entrySet()) {
			System.out.println("Key is ->" + entry.getKey() + ", and value is ->" + entry.getValue());
		}

		map.forEach((k, v) -> System.out.println("Key is ->" + k + ", and value is ->" + v));
		
		// Function<T, R>
	}

}
