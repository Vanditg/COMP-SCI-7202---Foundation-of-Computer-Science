/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Bicycle extends VehicleAbstract implements Vehicle {

	//List of private attributes.
	private boolean is_serviced;
	private String inDate;
	private String outDate;
	private String serviceResponsible;

	//Parametric constructor.
	Bicycle(String color, int year, int	numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible) {
		super(color, year, numberGears);
		this.is_serviced = is_serviced;
		this.inDate = inDate;
		this.outDate = outDate;
		this.serviceResponsible = serviceResponsible;
	}

	//Defining methods for Chekoutservice, ChangeGear, and Checkgear.
	public void checkoutService() {
		System.out.println("CheckoutService() method: ");
	}

	public  void changeGear(int a) {
		System.out.println("Changing the gears by " + a);
	}

	public void checkBrakes() {
		System.out.println("Checking the brakes");
	} 

	//Defining abstract assessors getColor, getYear, getNumberGears.
	public String getColor() {
		return this.color;
	}
	public int getYear() {
		return this.year;
	}
	public int getNumberGears() {
		return this.numberGears;
	}

	//Defining accessors getIs_service, In & Out date, Service Responsible.
	public boolean getIs_serviced() {
		return this.is_serviced;
	}
 	public String getInDate() {
		return this.inDate;
	}
	public String getOutDate() {
		return this.outDate;
	}
	public String getServiceResponsible() {
		return this.serviceResponsible;
	}

	//Defining abstract mutators getColor, getYear, getNumberGears.
	public void setColor(String color) {
		this.color = color;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setNumberGears(int numberGears) {
		this.numberGears = numberGears;
	}

	//Defining accessors getIs_service, In & Out date, Service Responsible.
	public void setIs_serviced(boolean is_serviced) {
		this.is_serviced = is_serviced;
	}
 	public void setInDate(String inDate) {
		this.inDate = inDate;
	}
	public void setOutDate(String outDate) {
		this.outDate = outDate;
	}
	public void setServiceResponsible(String serviceResponsible) {
		this.serviceResponsible = serviceResponsible;
	}	
}
