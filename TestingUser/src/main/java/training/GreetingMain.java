package training;


public class GreetingMain {

	public static void main(String[] args) {

		greet((str) -> "Hello, " + str);
		oddOrEven((num) -> {
			if (num % 2 == 0) {
				return "Given " + num + " is even";
			} else {
				return "Given " + num + " is Odd";
			}
		});

		maths((a, b) -> "Addition of two number value is ==>" + (a + b));
		maths((a, b) -> "Substraction of two number value is ==>" + (a - b));
		maths((a, b) -> "Multiplication of two number value is ==>" + (a * b));

		stringHandle((str) -> str.toUpperCase());
		stringHandle((str) -> {
			String nstr = "";
			char ch;
			for (int i = 0; i < str.length(); i++) {
				ch = str.charAt(i);
				nstr = ch + nstr;
			}
			return nstr;
		});
	}

	public static void greet(Greeter greeter) {

		String str = greeter.greet("Jaya");
		System.out.println(str);
	}

	public static void maths(MathOperation math) {

		String str = math.operate(11, 23);
		System.out.println(str);
	}

	public static void stringHandle(StringManipulator strTest) {

		String str = strTest.manipulate("Hellow");
		System.out.println(str);
	}

	public static void oddOrEven(NumberCheck number) {

		String str = number.check(11);
		System.out.println(str);
	}
}

@FunctionalInterface
interface NumberCheck {

	public String check(int number);
}

@FunctionalInterface
interface MathOperation {

	public String operate(int a, int b);
}

@FunctionalInterface
interface StringManipulator {

	public String manipulate(String input);
}
