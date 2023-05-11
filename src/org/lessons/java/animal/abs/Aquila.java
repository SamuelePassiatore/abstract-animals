package org.lessons.java.animal.abs;

public class Aquila extends Animale implements IVolante {

	@Override
	public String verso() {
		return "Grido dell'aquila!";
	}

	@Override
	public String mangia() {
		return "Carne";
	}
	
	@Override
	public String vola() {
		return "Sto volando!!!";
	}
	
	public String toString() {
		return "Aquila: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
	 
}
