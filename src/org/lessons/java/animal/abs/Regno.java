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
	}
}
