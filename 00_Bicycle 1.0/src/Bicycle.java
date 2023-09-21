/**
 * Class Bicycle with visibility public and private
 * 
 */

class Bicycle {

	private int cadence = 0;
	private int speed = 0;
	private int gear = 1;

	// Constructors
	public Bicycle() {
	}

	public Bicycle(int startCadence, int startSpeed, int startGear) {
		setGear(startGear);
		setCadence(startCadence);
		speedUp(startSpeed);
	}

	public Bicycle(Bicycle bike) {
		this.gear = bike.getGear();
		this.speed = bike.getSpeed();
		this.cadence = bike.getCadence();
	}


	// Observers
	public int getCadence() {
		return cadence;
	}
	public int getSpeed() {
		return speed;
	}

	public int getGear() {
		return gear;
	}

	// Modifiers
	public void setCadence(int newValue) {
		cadence = newValue;
	}

	public void setGear(int newValue) {
		gear = newValue;
	}
	public void setSpeed(int newValue) {
		gear = newValue;
	}

	public void applyBrake(int decrement) {
		setSpeed(getSpeed()-decrement);
	}

	public void speedUp(int increment) {
		setSpeed(getSpeed()+increment);
	}

	// Other observer
	public void printStates() {
		System.out.println(" -- Bicycle -- ");
		System.out.println("cadence:"+getCadence()+" speed:"+getSpeed()+" getGear()"+gear);
	}

	public String toString() {
		return String.format("Cadencia: %s\nVelocidad: %s\nMarcha: %s", 
				this.getCadence(), this.getSpeed(), this.getGear());
	}
}