package Esercizio2_Package;

import java.util.List;

public class SumThread implements Runnable {

	// - - - - - - - - - - attributes definition
	List<Integer> numbersArray;
	int sum;

	// - - - - - - - - - - constructor definition
	public SumThread(List<Integer> _numbersArray) {
		this.numbersArray = _numbersArray;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		sum = 0;
		for (Integer number : numbersArray) {
			sum += number;
		}

	}

}
