package edu.ncsu.monopoly;
import java.util.Random;
public class Die {
	private static Random generador = new Random();
	public int getRoll() {
		return generador.nextInt(6)+1;
	}
}
