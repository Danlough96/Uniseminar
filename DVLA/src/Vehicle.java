
public abstract class Vehicle {
	/*
	 * Today we were looking at Abstract methods and classes
	 * To begin we created a class named vehicle. and set and set a string called 'regNumber'
	 * 
	 */
	String regNumber;
	//We then made a public vehicle method to assign the regNumber
	public Vehicle(String regNumber) {
		this.regNumber = regNumber;
	}
	//we made a public void (later made abstract to test overriding override it) to help test the code and show it on the console
	public abstract void soundHorn();
}
