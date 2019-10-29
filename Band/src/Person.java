
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	public Person(String FirstName, String LastName, int Age) {
		firstName = FirstName;
		lastName = LastName;
		age = Age;
	}
	public String getFirstName() {return firstName;}
	
	public void setFirstName(String fname){
		firstName = fname;}
	
	public String getLastName() {return lastName;}
	
	public void setLastName(String lName) {
		lastName = lName;
	}
	
	public int getAge() {return age;}
	public void setAge(int Age) {
		age = Age;
	}
	
}
