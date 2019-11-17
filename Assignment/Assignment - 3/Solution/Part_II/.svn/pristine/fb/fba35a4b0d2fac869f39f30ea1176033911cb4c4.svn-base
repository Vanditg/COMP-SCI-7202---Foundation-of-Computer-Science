/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class MountainBike extends Bicycle {

	//List of private attributes.
	private String suspension;
	private String forks;

	//Default constructor.
	MountainBike() {
		super("yellow", 2018, 15, false, "10/02/2018", "01/03/2019", "not serviced");
		this.suspension = "yes";
		this.forks = "none";
	}	

	//Parametric constructor.
	MountainBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, String suspension, String forks) {
		super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
		this.suspension = suspension;
		this.forks = forks;
	}

	//Creating accessors for getSuspension & getForks. 
	public String getSuspension() {
		return this.suspension;
	}
	public String getForks() {
		return this.forks;
	}
	
	//Creating mutators for getSuspension & getForks. 
	public void setSuspension(String suspension) {
		this.suspension = suspension;
	}
	public void setForks(String forks) {
		this.forks = forks;
	}
}
