package multi_threading;

public class JavaMultiThread {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		FirstThread firstThread = new FirstThread();

		firstThread.start();

		firstThread.setPriority(firstThread.MAX_PRIORITY);

		SecondThread secondThread = new SecondThread();

		secondThread.start();

		secondThread.setPriority(secondThread.MIN_PRIORITY);

	}

}

class FirstThread extends Thread {

	public void run() {

		for (int i = 0; i < 5; i++) {

			System.out.println("Thread 1 :  " + i);

			try {

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println("Thread Id = " + Thread.currentThread().getId());
		}

	}

}

class SecondThread extends Thread {

	public void run() {

		for (int j = 0; j < 5; j++) {

			try {

				System.out.println("Thread 2 : " + j);

				Thread.sleep(1000);

			} catch (InterruptedException e) {

				e.printStackTrace();

			}

			System.out.println("Thread1 Id =" + Thread.currentThread().getId());
		}

	}

}
