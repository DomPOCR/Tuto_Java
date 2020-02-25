package fr.domp.test_java;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player("Aldo", 20.0, 300.0);
		System.out.println("Nom : " + player1.getName());
		player1.setAttack(30.0);
		System.out.println("Vie : " + player1.getHealth());

		Player player2 = new Player("Lili", 30.0, 400.0);

		player2.setName("Cooky");
		player2.damage(player1.getAttack());
		System.out.println("Nom : " + player2.getName());
		System.out.println("Vie : " + player2.getHealth());

	}
}
