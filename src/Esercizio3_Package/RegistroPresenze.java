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

		System.out.println("");
		System.out.println("Di seguito il registro presenze letto dal file presenzeDue.txt");
		HashMap<String, Integer> presenzeDue = leggiFile();
		System.out.println(presenzeDue);

	}

	// - - - - - - - - - - - - - - - - - - - - FileUtils.writeStringToFile
	public static void scriviFile(HashMap<String, Integer> _presenze) {

		StringBuilder stringBuilder = new StringBuilder();

		// Mario Rossi@5#Paolo Bianchi@4#Antonio Antani@5#Giovanni Gianni@4
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

	// - - - - - - - - - - - - - - - - - - - - FileUtils.readFileToString
	public static HashMap<String, Integer> leggiFile() {

		HashMap<String, Integer> presenzeDue = new HashMap<>();

		try {
			String presenzeString = FileUtils.readFileToString(new File("presenzeDue.txt"), "UTF-8");
			String[] presenzeArray = presenzeString.split("#");
			for (String _presenza : presenzeArray) {
				String[] presenzaSplit = _presenza.split("@");
				String chiave = presenzaSplit[0];
				int valore = Integer.parseInt(presenzaSplit[1]);
				presenzeDue.put(chiave, valore);
			}
		} catch (IOException _e) {
			_e.printStackTrace();
		}

		return presenzeDue;

	}
}
