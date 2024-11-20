package training;

public class CollectionsTesting {

	public static void main(String[] args) {

		/*Hi hi = new Hello();
		
		hi.test();
		hi.test21();*/

		/*Hi h2 = () -> {
			System.out.println("Hello from lamb");
		};
		
		h2.test();*/
		// System.out.println(h2.test());
		// h2.test21();

		/*	Hi hi = new Hi() {
		
					@Override
					public boolean test() {
						// TODO Auto-generated method stub
						return false;
					}
		
				@Override
				public void test21() {
					// TODO Auto-generated method stub
					System.out.println("override method");
				}
		
			};*/

		// hi.test21();
		demo((a, b) -> a + b);

	}

	public static void demo(Hi hi) {
		System.out.println(hi.test(10, 20));
	}
}

interface Hi {

	public int test(int a, int b);

	public default void test21() {
		System.out.println("HI");
	}
}

/*class Hello implements Hi {

	@Override
	public boolean test() {
		// TODO Auto-generated method stub
		System.out.println("Hello from test method");
		return true;
	}

	@Override
	public void test21() {

		System.out.println("default method overrided");

	}

}*/