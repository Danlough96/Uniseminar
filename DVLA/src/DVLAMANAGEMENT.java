import java.util.ArrayList;

public class DVLAMANAGEMENT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle ford = new Car("ford", "fiesta", "2002", "WE14RFF");
		Vehicle LandRover = new SUV("Land", "Rover", "2014", "DTY14RFG");
		ArrayList<Vehicle> myVehicles = new ArrayList<Vehicle>();
		myVehicles.add(ford);
		myVehicles.add(LandRover);
		
		for (Vehicle vehicle : myVehicles) {
			vehicle.soundHorn();
		}
	}

}
