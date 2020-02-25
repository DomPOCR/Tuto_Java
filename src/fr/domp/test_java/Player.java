package fr.domp.test_java;

public class Player {

	private String name = "Domi";
	private double health = 20;
	private double attack = 0.5;

	public Player(String name, double attack, double health) {
		this.name = name;
		this.health = health;
		this.attack = attack;
	}

	public void damage(double damage) {
		this.health -= damage;
		System.out.println(name + " vient de subir " + damage);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealth() {
		return health;
	}

	public void setHealth(double health) {
		this.health = health;
	}

	public double getAttack() {
		return attack;
	}

	public void setAttack(double attack) {
		this.attack = attack;
	}
}
