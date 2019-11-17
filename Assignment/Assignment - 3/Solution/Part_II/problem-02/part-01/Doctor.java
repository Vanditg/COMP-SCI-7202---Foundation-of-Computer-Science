/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Doctor extends Person {

	//List of private attributes.
	private String speciality;

	//Default constructor.
	Doctor() {
		
		//Calling the base constructor.
		super();
		this.speciality = "neuroscience";
	}

	//Parameterised constructor.
	Doctor(String f_name, String l_name, int age, String gender, String citizenship, String speciality) {
		
		//Calling the base constructor.
		super(f_name, l_name, age, gender, citizenship);
		this.speciality = speciality;
	}

	//Creating accessors for speciality.
	public String getSpeciality() {
		return this.speciality;
	}

	//Creating mutators for speciality.
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
}
