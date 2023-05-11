package org.lessons.java.animal.abs;

public class Passerotto extends Animale{

	@Override
	public String verso() {
		 return "Cip cip!";
	}

	@Override
	public String mangia() {
		return "Erba";
	}

	public String toString() {
		return "Passerotto: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
}
