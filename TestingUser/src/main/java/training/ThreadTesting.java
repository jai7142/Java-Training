package training;

import java.util.stream.IntStream;

public class ThreadTesting {

	public static void main(String[] args) throws InterruptedException {

		Runnable runnable = () -> {

			IntStream.range(1, 10).forEach(e -> {
				try {
					Thread.sleep(1000);
					System.out.println(e + Thread.currentThread().getName());
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			});
		};
		Thread th = new Thread(runnable);
		th.setName("thread21");
		th.setPriority(1);
		th.join();

		th.start();

		Thread th1 = new Thread(runnable);
		th1.setName("thread22");
		th1.setPriority(3);
		th1.join();

		th1.start();

		Thread th2 = new Thread(runnable);
		th2.setName("thread23");
		th2.setPriority(8);
		th2.join();

		th2.start();

		Thread.getAllStackTraces().forEach((k, v) -> {
			if (k.getThreadGroup().getName().equals("main")) {
				System.out.println(k);
			}
		});
	}

}
