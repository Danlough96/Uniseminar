
public class Bicycle {
	private int cadence;
	private int speed;
	private int gear;
	public void Bicycle(int cadence, int speed, int gear) {
		this.cadence = cadence;
		this.speed = speed;
		this.gear = gear;
	}
	public void setGear(int gearLevel) {
		this.gear = gearLevel;
	}
	public void setCadence(int cadenceLevel) {
		this.cadence = cadenceLevel;
	}
	public void applyBreak(int applyBreak) {
		this.speed -= applyBreak;
	}
	public void speedUP(int speedUp) {
		this.speed += speedUp;
	}
}
