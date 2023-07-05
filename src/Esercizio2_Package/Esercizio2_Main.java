package Esercizio2_Package;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Esercizio2_Main {

	public static void main(String[] args) {

		List<Integer> numbersArray = new ArrayList<>();

		Random randomNumber = new Random();

		for (int i = 0; i < 3000; i++) {
			numbersArray.add(randomNumber.nextInt());
		}

	}
}
