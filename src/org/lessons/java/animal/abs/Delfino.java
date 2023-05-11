package org.lessons.java.animal.abs;

public class Delfino extends Animale implements INuotante {

	@Override
	public String verso() {
		return "Verso del delfino!";	
	}

	@Override
	public String mangia() {
		return "Pesce";
	}
	
	@Override
	public String nuota() {
		return "Sto nuotando!!!";
	}
	
	public String toString() {
		return "Delfino: " 
		+ "\nverso: " + verso()
		+ "\nmangia: " + mangia()
		+ "\ndorme: " + dorme()
		+ "\n--------------------";
	}

}
