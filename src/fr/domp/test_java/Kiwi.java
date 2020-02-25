package fr.domp.test_java;

public class Kiwi extends Fruit implements PeelFruit {

	public Kiwi(String myname) {
		super("kiwi");

	}

	@Override
	public void taste() {
		System.out.println("Le goût est plutôt sucré miam miam");

	}

	@Override
	public int getSize() {

		return 1;
	}

	@Override
	public boolean hasSeed() {

		return false;
	}

	@Override
	public boolean isPeeled() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getSkinType() {

		return "doux";
	}

}
