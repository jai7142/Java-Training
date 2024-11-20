package training;

import java.util.function.Function;

public class FunctionInterfaceTesting {

	public static void main(String[] args) {

		Function<Integer, String> fun = (a) -> {
			if (a % 7 == 0) {
				return "" + true;
			} else {
				return "" + false;
			}
		};
		System.out.println(fun.apply(7));

		Function<String, Integer> fun1 = x -> x.length();
		Function<Integer, Integer> fun2 = x -> x * x;
		int result = fun1.andThen(fun2).apply("dfsadf");

		System.out.println(result);
	}

}
