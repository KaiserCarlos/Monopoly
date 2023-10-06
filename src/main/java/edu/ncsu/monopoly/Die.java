package edu.ncsu.monopoly;
import java.util.Random;
public class Die {
	public int getRoll() {
		return new Random().nextInt(6)+1;
	}
}
