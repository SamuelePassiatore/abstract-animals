package org.lessons.java.animal.abs;

public class Delfino extends Animale {

	@Override
	public String verso() {
		return "Verso del delfino!";	
	}

	@Override
	public String mangia() {
		return "Pesce";
	}
	
	public String toString() {
		return "Delfino: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}

}
