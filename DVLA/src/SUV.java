
public class SUV extends Vehicle {
	String make;
	String model;
	String year;
	public SUV(String make, String model, String year, String regNumber) {
		super(regNumber);
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	public void soundHorn() {
		System.out.println("Beep Beep");
	}

}
