/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class ElectricBike extends Bicycle {
	
	//List of private attributes.
	private int battery;

	//Default Constructor.
	ElectricBike() {
		super("Blue", 2019, 21, false, "21/12/2019", "22/11/2020", "Serviced");
		this.battery = 10;
	}

	//Parametric constructor.
	ElectricBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, int battery) {
		super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
		this.battery = battery;
	}

	//Defining method chargeBike.
	public void chargeBike() {
		System.out.println("Charging Bike");
		this.battery++;
		System.out.println("Battery: " + this.battery);
	}

	//Creating accessors getBattery. 
	public int getBattery() {
		return this.battery;
	}

	//Creating mutators getBattery. 
	public void setBattery(int battery) {
		this.battery = battery;
	}
}
