package org.lessons.java.animal.abs;

public class Regno {
	public static void main(String[] args) {

		Cane cane = new Cane();
		Passerotto passerotto = new Passerotto();
		Aquila aquila = new Aquila();
		Delfino delfino = new Delfino();

		Animale[] animali = { cane, passerotto, aquila, delfino };

		for (int i = 0; i < animali.length; i++) {

			Animale animale = animali[i];
			System.out.println(animale);
		}
		
		AnimaleManager animaleManager = new AnimaleManager();

		System.out.println("Cane: " + animaleManager.faiNuotare(cane));
		System.out.println("Passerotto: " + animaleManager.faiVolare(passerotto));
		System.out.println("Aquila: " + animaleManager.faiVolare(aquila));
		System.out.println("Delfino: " + animaleManager.faiNuotare(delfino));
	}
}
