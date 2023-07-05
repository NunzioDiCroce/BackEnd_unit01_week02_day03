package Esercizio2_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Esercizio2_Main {

	public static void main(String[] args) {

		// - - - - - - - - - - ArrayList object definition
		List<Integer> numbersArray = new ArrayList<>();

		// - - - - - - - - - - Random object definition
		Random randomNumber = new Random();

		// - - - - - - - - - - for loop to populate ArrayList object
		for (int i = 0; i < 3000; i++) {
			numbersArray.add(randomNumber.nextInt(11));
		}

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 2 - - - - - - - - - -");
		System.out.println("");
		System.out.println();
		System.out.println("ListArray: " + numbersArray);
		System.out.println("ListArray.size = " + numbersArray.size());

	}
}
