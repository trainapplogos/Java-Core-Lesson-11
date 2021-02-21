package ua.lviv.trainapplogos;

public class Engine extends Car {
	private int cylindersCount;

	public Engine(int cylindersCount) {
		super();
		this.cylindersCount = cylindersCount;
	}

	public int getCylindersCount() {
		return cylindersCount;
	}

	public void setCylindersCount(int cylindersCount) {
		this.cylindersCount = cylindersCount;
	}

	/*@Override
	public String toString() {
		return "Engine [cylindersCount=" + cylindersCount + "]";
	} */
	
	
}
