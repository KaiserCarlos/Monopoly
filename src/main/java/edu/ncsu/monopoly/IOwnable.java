package edu.ncsu.monopoly;

public interface IOwnable {

	Player getOwner();

	int getPrice();

	void setOwner(Player owner);

	boolean isAvailable();

	void setAvailable(boolean available);

}