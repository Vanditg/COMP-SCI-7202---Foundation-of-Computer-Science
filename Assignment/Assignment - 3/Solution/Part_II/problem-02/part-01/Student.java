/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Student extends Person {

	//List of private attributes.
	private double [] marks = new double[5];
	private String [] disciplines = new String[5];

	//Default constructor.
	Student() {
		
		//Calling the base constructor.
		super(); 
		for (int i = 0;i< marks.length ;i++ ) {
			this.marks[i] = 0;
		}

		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = "None";
		}
	}

	//Parameterised constructor.
	Student(String f_name, String l_name, int age, String gender, String citizenship, double[] marks, String[] disciplines) {
		
		//Calling the base constructor.
		super(f_name, l_name, age, gender, citizenship);
		for (int i = 0;i< marks.length ;i++ ) {
			this.marks[i] = marks[i];
		}

		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = disciplines[i];
		}
	}
	
	//Defining methods averageMarks, and Display.
	public double averageMarks() {
		int sum = 0;
		for (int i =0; i< this.marks.length ; i++) {
			sum += marks[i];
		}

		float average = (float)sum/marks.length;
		return average;
	}
	
	public void displayDisciplines() {
		for (int i =0; i< this.disciplines.length ; i++) {
			System.out.println(disciplines[i]);
		}
	}

	//Creating accessors for Marks and Disciplines.
	public double[] getMarks() {
		return this.marks;
	}
	public String[] getDisciplines() {
		return this.disciplines;
	}

	//Creating mutators for Marks and Disciplines.
	public void setMarks(double[] marks){
		for (int i = 0;i< marks.length ;i++ ) {
			this.marks[i] = marks[i];
		}
	}
	public void setDisciplines(String[] disciplines) {
		for (int i = 0;i< disciplines.length ;i++ ) {
			this.disciplines[i] = disciplines[i];
		}
	}
}
