package Esercizio1_Package;

public class Esercizio1_Main {

	public static void main(String[] args) {

		FirstThread firstThread = new FirstThread("firstThread", "*", 1000);
		FirstThread secondThread = new FirstThread("secondThread", "#", 1000);

		// firstThread.run();
		// secondThread.run();

		Thread threadOne = new Thread(firstThread);
		Thread threadTwo = new Thread(secondThread);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 1 - - - - - - - - - -");
		System.out.println("");

		threadOne.start();
		threadTwo.start();

	}

}
