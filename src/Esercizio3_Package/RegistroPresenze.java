package Esercizio3_Package;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import org.apache.commons.io.FileUtils;

public class RegistroPresenze {

	public static void main(String[] args) {

		// - - - - - - - - - - - - - - - - - - - - HashMap object creation
		HashMap<String, Integer> presenze = new HashMap<>();

		// - - - - - - - - - - - - - - - - - - - - HashMap object population
		presenze.put("Mario Rossi", 5);
		presenze.put("Paolo Bianchi", 4);
		presenze.put("Antonio Antani", 5);
		presenze.put("Giovanni Gianni", 4);

		System.out.println("");
		System.out.println("- - - - - - - - - - ESERCIZIO 3 - - - - - - - - - -");
		System.out.println("");
		System.out.println("Registro presenze");
		System.out.println(presenze);

		System.out.println("");
		System.out.println("Il registro presenze è stato salvato nel file presenze.txt, verificarne il contenuto");
		scriviFile(presenze);

	}

	// Mario Rossi@5#Paolo Bianchi@4#Antonio Antani@5#Giovanni Gianni@4

	public static void scriviFile(HashMap<String, Integer> _presenze) {

		StringBuilder stringBuilder = new StringBuilder();

		_presenze.forEach((_chiave, _valore) -> {
			stringBuilder.append(_chiave).append("@").append(_valore).append("#");
		});

		String presenzeString = stringBuilder.toString();

		if (presenzeString.endsWith("#")) {
			presenzeString = presenzeString.substring(0, presenzeString.length() - 1);
		}

		try {
			FileUtils.writeStringToFile(new File("presenze.txt"), presenzeString, "UTF-8");
		} catch (IOException _e) {
			_e.printStackTrace();
		}

	}
}
