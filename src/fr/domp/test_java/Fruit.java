package fr.domp.test_java;

public abstract class Fruit {

	public abstract void taste();

	public abstract int getSize();

	public abstract boolean hasSeed();

	public void miam() {
		System.out.println("Miam manger 5 fruits et légumes par jour");
	}

}
