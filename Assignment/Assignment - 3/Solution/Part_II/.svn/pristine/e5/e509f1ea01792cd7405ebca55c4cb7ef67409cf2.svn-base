/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Patient extends Person {

	//List of private attributes.
	private String diagnostic;
	private String inTime;
	private String prevTime;

	//Default constructor.
	Patient() {
		
		//Calling the base constructor.
		super();
		this.diagnostic = "Fever";
		this.inTime = "06:00 am";
		this.prevTime = "18:00 pm";
	}

	//Parameterised constructor.
	Patient(String f_name, String l_name, int age, String gender, String citizenship, String diagnostic, String inTime, String prevTime) {
		
		//Calling the base constructor.
		super(f_name, l_name, age, gender, citizenship);
		this.diagnostic = diagnostic;
		this.inTime = inTime;
		this.prevTime = prevTime;
	}

	//Creating accessors for Diagnostic, intime, and prevtime.
	public String getDiagnostic() {
		return this.diagnostic;
	}
	public String getInTime() {
		return this.inTime;
	}
	public String getPrevTime() {
		return this.prevTime;
	}

	//Creating mutators for Diagnostic, intime, and prevtime.
	public void setDiagnostic(String diagnostic) {
		this.diagnostic = diagnostic;
	}
	public void setInTime(String inTime) {
		this.inTime = inTime;
	}
	public void setPrevTime(String prevTime) {
		this.prevTime = prevTime;
	}
}
