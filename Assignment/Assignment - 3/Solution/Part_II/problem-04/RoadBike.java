/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class RoadBike extends Bicycle {

	//List of private attributes.
	private String tyres;

	//Default constructor. 
	RoadBike() {
		super("blue", 2015, 10, false, "10/07/2022", "01/04/2023", "not serviced");
		this.tyres = "OBC";
	}

	//Parametric constructor. 
	RoadBike(String color, int year, int numberGears, boolean is_serviced, String inDate, String outDate, String serviceResponsible, String tyres) {
		super(color, year, numberGears, is_serviced, inDate, outDate, serviceResponsible);
		this.tyres = tyres;
	}

	//Creating accessors for gettyres. 
	public String getTyres() {
		return this.tyres;
	}

	//Creating mutators for settyres. 
	public void setTyres(String tyres) {
		this.tyres = tyres;
	}
}
