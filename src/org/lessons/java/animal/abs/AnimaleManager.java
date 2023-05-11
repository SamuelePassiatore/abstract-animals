package org.lessons.java.animal.abs;

public class AnimaleManager {
	
	 public String faiVolare(IVolante animale) {
	        return animale.vola();
	    }

	    public String faiNuotare(INuotante animale) {
	        return animale.nuota();
	    }
}
