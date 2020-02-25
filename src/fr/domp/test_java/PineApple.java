package fr.domp.test_java;

public class PineApple extends Fruit {

	public PineApple() {
		super("Ananas");
		// TODO Auto-generated constructor stub
	}

	@Override
	public void taste() {
		System.out.println("L'ananas a un goût plutôt acide");

	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return false;
	}

}
