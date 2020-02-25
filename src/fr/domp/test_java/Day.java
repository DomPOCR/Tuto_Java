package fr.domp.test_java;

public enum Day {

	MATIN(8, "Debout !"), MIDI(12, "A table"), APRESMIDI(15, "Boulot"), SOIR(22, "Dodo"),
	NUIT(2, "Fais de beaux rêves");

	private int hour;
	private String message;

	Day(int hour, String message) {
		this.hour = hour;
		this.message = message;
	}

	public int getHour() {
		return hour;
	}

	public String getMessage() {
		return message;
	}
}
