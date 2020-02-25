package fr.domp.test_java;

public abstract class Fruit {

	private String name;

	public Fruit(String myname) {
		this.name = myname;
	}

	public abstract void taste();

	public abstract int getSize();

	public abstract boolean hasSeed();

	public void miam() {
		System.out.println("Miam manger 5 fruits et légumes par jour / Nom du fruit : " + getName());
	}

	public String getName() {
		return name;
	}
}
