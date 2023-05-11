package org.lessons.java.animal.abs;

public class Cane extends Animale implements INuotante {

	@Override
	public String verso() {
		return "Bau!";
	}

	@Override
	public String mangia() {
		return "Carne e croccantini";
	}
	
	@Override
	public String nuota() {
		return "Sto nuotando!!!";
	}
	
	
	public String toString() {
		return "Cane: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}
}
