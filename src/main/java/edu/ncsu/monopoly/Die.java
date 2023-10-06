package edu.ncsu.monopoly;
import java.security.SecureRandom;
public class Die {
	private static SecureRandom generador = new SecureRandom();
	public int getRoll() {
		return generador.nextInt(6)+1;
	}
}
