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

		int[] number = { 4, 7, 9, 1 };
		int calcul = 5 + 1;

		try {
			System.out.println(number[4]);
			calcul /= 0;
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
			System.out.println("Erreur ici");
		} finally {
			System.out.println("La vie est belle");
		}

		double balance = 5000;
		double price = 5200;
		try {
			buy(balance, price);
		} catch (NoMoneyException e) {
			e.printStackTrace();
		}

	}

	private static void buy(double balance, double price) throws NoMoneyException {

		double b = balance - price;

		if (b < 0) {
			throw new NoMoneyException();
		}
		System.out.println(b);

	}
}
