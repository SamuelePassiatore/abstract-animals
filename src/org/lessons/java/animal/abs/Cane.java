package org.lessons.java.animal.abs;

public class Cane extends Animale {

	@Override
	public String verso() {
		return "Bau!";
	}

	@Override
	public String mangia() {
		return "Carne e croccantini";
	}
	
	public String toString() {
		return "Cane: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
}
