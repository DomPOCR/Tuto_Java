package fr.domp.test_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {

		Map<String, Integer> ages = new HashMap<>();

		ages.put("Cooky", 10);
		ages.put("DomP", 55);
		ages.put("Aldo", 15);

		ages.put("Mimi", 99);

		System.out.println(ages.toString());

		int moyenne = 0;

		for (Entry<String, Integer> element : ages.entrySet()) {
			System.out.println("La clef est : " + element.getKey() + " , son age est : " + element.getValue());
			moyenne += element.getValue();
		}

		System.out.println("Age moyen : " + moyenne / ages.size());
	}
}
