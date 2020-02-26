package fr.domp.test_java;

public class NoMoneyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public NoMoneyException() {
		super("Attention la balance ne peut pas être négative");
	}

}
