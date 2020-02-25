package fr.domp.test_java;

public class Apple extends Fruit {

	@Override
	public void taste() {
		System.out.println("La pomme a un goût plutôt sucré");
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public boolean hasSeed() {
		// TODO Auto-generated method stub
		return true;
	}

}
