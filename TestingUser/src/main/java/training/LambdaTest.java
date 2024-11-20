package training;


public class LambdaTest {

	public static void main(String[] args) {

		test((a) -> {
			if (a % 7 == 0) {
				return true;
			} else {
				return false;
			}
		});

		Test testresult = (a) -> {
			if (a % 7 == 0) {
				return true;
			} else {
				return false;
			}
		};

		boolean testObg = testresult.isDivisable(7);
		System.out.println(testObg);

	}

	public static void test(Test t) {
		boolean result = t.isDivisable(1232);

		System.out.println(result);
	}

}

interface Test {

	public boolean isDivisable(int a);
}
