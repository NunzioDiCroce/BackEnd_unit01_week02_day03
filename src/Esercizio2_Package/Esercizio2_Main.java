package Esercizio2_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Esercizio2_Main {

	// - - - - - - - - - - main method definition
	public static void main(String[] args) {

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 2 - - - - - - - - - -");
		System.out.println("");

		List<Integer> numbersArray = generateArray();
		System.out.println("ListArray: " + numbersArray);
		System.out.println("ListArray.size = " + numbersArray.size());

		SumThread firstThread = new SumThread(numbersArray.subList(0, 1000));
		SumThread secondThread = new SumThread(numbersArray.subList(1000, 2000));
		SumThread thirdThread = new SumThread(numbersArray.subList(2000, 3000));

		Thread threadOne = new Thread(firstThread);
		Thread threadTwo = new Thread(secondThread);
		Thread threadThree = new Thread(thirdThread);

		threadOne.start();
		threadTwo.start();
		threadThree.start();

		try {
			threadOne.join();
			threadTwo.join();
			threadThree.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int sum = firstThread.getSum() + secondThread.getSum() + thirdThread.getSum();
		System.out.println("");
		System.out.println("firstThread sum: " + firstThread.getSum());
		System.out.println("secondThread sum: " + secondThread.getSum());
		System.out.println("thirdThread sum: " + thirdThread.getSum());
		System.out.println("total sum: " + sum);

	}

	// - - - - - - - - - - generateArray method definition
	public static List<Integer> generateArray() {

		// - - - - - - - - - - ArrayList object definition
		List<Integer> numbersArray = new ArrayList<>();

		// - - - - - - - - - - Random object definition
		Random randomNumber = new Random();

		// - - - - - - - - - - for loop to populate ArrayList object
		for (int i = 0; i < 3000; i++) {
			numbersArray.add(randomNumber.nextInt(11));
		}
		return numbersArray;
	}
}
