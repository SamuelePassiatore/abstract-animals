package org.lessons.java.animal.abs;

public class Aquila extends Animale {

	@Override
	public String verso() {
		return "Grido dell'aquila!";
	}

	@Override
	public String mangia() {
		return "Carne";
	}
	
	public String toString() {
		return "Aquila: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
	 
}
