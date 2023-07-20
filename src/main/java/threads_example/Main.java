package threads_example;

import threads_example.synchronisation.BankAccount;

public class Main {

	public static void main(String[] args) {

		BankAccount bankAccount = new BankAccount(100);


		System.out.println(Thread.activeCount());

		ThreadEx thread1 = new ThreadEx();
		thread1.setName("First thread");
		thread1.start();

		ThreadEx thread2 = new ThreadEx();
		thread2.setName("second thread");
		thread2.start();

	}

}
