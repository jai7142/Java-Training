package training;

import java.time.Instant;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestIntStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> numbers = IntStream.range(1, 10_000_000).boxed().collect(Collectors.toList());
		Instant start = Instant.now();
		long sequentialSum = numbers.parallelStream().mapToLong(n -> (long) n * n).sum();
		Instant end = Instant.now();
		System.out
				.println("Sequential Sum: " + sequentialSum + ", Time: " + (end.toEpochMilli() - start.toEpochMilli()) + "ms");

	}
}
