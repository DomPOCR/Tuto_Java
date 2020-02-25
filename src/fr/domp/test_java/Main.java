package fr.domp.test_java;

public class Main {

	public static void main(String[] args) {

		Apple a = new Apple();
		a.taste();
		a.miam();

		PineApple pen = new PineApple();
		pen.taste();
		pen.miam();

		if (!(a instanceof PeelFruit)) {
			System.out.println("ce fruit n'implémente pas l'interface PeelFruit");
		}

	}
}
