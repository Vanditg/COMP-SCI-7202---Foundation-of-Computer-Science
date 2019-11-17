/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Lecturer extends Person {

	//List of private attributes.
	private double salary;
	private String [] disciplines = new String[5];

	//Default constructor.
	Lecturer() {
		
		//Calling the base constructor.
		super();
		salary = 0.0d;
		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = "None";
		}
	}

	//Parameterised constructor.
	Lecturer(String f_name, String l_name, int age, String gender, String citizenship, double salary, String[] disciplines) {

		//Calling the base constructor.
		super(f_name, l_name, age, gender, citizenship);
		this.salary = salary; 
		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = disciplines[i];
		}
	}
	
	//Defining methods annualSalary and display.
	public double annualSalary() {
		return 12*this.salary;
	}
	
	public void displayDisciplines() {
		for (int i =0; i< this.disciplines.length ; i++) {
			System.out.println(disciplines[i]);
		}
	}

	//Creating accessors for salary and disciplines.
	public double getSalary() {
		return this.salary;
	}
	public String[] getDisciplines() {
		return this.disciplines;
	}

	//Creating mutators for salary and disciplines.
	public void setMarks(double salary){
		this.salary = salary;
	}
	public void setDisciplines(String[] disciplines) {
		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = disciplines[i];
		}
	}
}
