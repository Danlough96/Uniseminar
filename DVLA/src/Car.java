
public class Car extends Vehicle {
/*
 * We then went on to create a car class to show extentions of classes and build constructors
 */
	String make;
	String model;
	String year;
	
	public Car(String make, String model, String year, String regNumber) {
		super(regNumber);
		this.make = make;
		this.model = model;
		this.year = year;	
	}
	public void soundHorn() {
		System.out.println("Broom Broom");
	}
	
}
