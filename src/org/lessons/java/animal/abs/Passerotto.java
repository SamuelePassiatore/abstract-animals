package org.lessons.java.animal.abs;

public class Passerotto extends Animale implements IVolante{

	@Override
	public String verso() {
		 return "Cip cip!";
	}

	@Override
	public String mangia() {
		return "Erba";
	}
	
	@Override
	public String vola() {
		return "Sto volando!!!";
	}

	public String toString() {
		return "Passerotto: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
}
