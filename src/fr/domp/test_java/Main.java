package fr.domp.test_java;

import java.util.HashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> ages = new HashMap<>();

		ages.put("Cooky", 10);
		ages.put("DomP", 55);
		ages.put("Aldo", 15);

		ages.put("Mimi", 99);

		System.out.println(ages.toString());

		System.out.println(ages.get("Cooky"));

		ages.remove("Mimi");

		if (ages.containsKey("Mimi")) {
			System.out.println("La clef existe");
		} else {
			System.out.println("La clef n'existe pas");
		}

		System.out.println(ages.toString());

	}
}
