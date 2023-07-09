package Esercizio3_Package;

import java.util.HashMap;

public class RegistroPresenze {

	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - - - - - - HashMap object creation
		HashMap<String, Integer> presenze = new HashMap<>();

		// - - - - - - - - - - - - - - - - - - - - HashMap object population
		presenze.put("Mario Rossi", 5);
		presenze.put("Paolo Bianchi ", 4);
		presenze.put("Antonio Antani", 5);
		presenze.put("Giovanni Gianni", 4);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");
		System.out.println("");
		System.out.println("Registro presenze");
		System.out.println(presenze);

		System.out.println("");
		System.out.println("Il registro presenze è stato salvato nel file presenze.txt, verificarne il contenuto");

	}

	// Mario Rossi@5#Paolo Bianchi@4#Antonio Antani@5#Giovanni Gianni@4

}
