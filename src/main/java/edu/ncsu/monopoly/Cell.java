package edu.ncsu.monopoly;

public abstract class Cell implements IOwnable {
	private String name;
	protected Player owner;
	private boolean available = true;

	public String getName() {
		return name;
	}

	@Override
	public Player getOwner() {
		return owner;
	}
	
	@Override
	public int getPrice() {
		return 0;
	}

	public abstract void playAction();

	void setName(String name) {
		this.name = name;
	}

	@Override
	public void setOwner(Player owner) {
		this.owner = owner;
	}
    
    public String toString() {
        return name;
    }

	@Override
	public boolean isAvailable() {
		return available;
	}

	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
