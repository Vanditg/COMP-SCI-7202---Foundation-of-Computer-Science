//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: 2
//===================================

public class Cake {
	
	private String name;
	private float qtSugar;
	private float qtFlour;
	private float qtYeast;
	private double timePrepare;

	// Creating the accessors for name, qtSugar, qtFlour, qtYeats, and timePrepare.
	public String getName(){
		return name;
	}

	public float getQtSugar(){
		return qtSugar;
	}

	public float getQtFlour(){
		return qtFlour;
	}

	public float getQtYeast(){
		return qtYeast;
	}

	public double getTimePrepare(){
		return timePrepare;
	}

	// Creating the mutators for name, qtSugar, qtFlour, qtYeats, and timePrepare.
	public void setName(String newName){
		name = newName;
	}

	public void setQtSugar(float newQtSugar){
		qtSugar = newQtSugar;
	}

	public void setQtFlour(float newQtFlour){
		qtFlour = newQtFlour;
	}

	public void setQtYeast(float newQtYeast){
		qtYeast = newQtYeast;
	}

	public void setTimePrepare(double newTimePrepare){
		timePrepare = newTimePrepare;
	}

	//default constructor
	Cake(){

	}
	
	//parametric constructor
	Cake(String name, float qtSugar, float qtFlour, float qtYeast, double timePrepare){
		name = newName;
		qtSugar = newQtSugar;
		qtFlour = newQtFlour;
		qtYeast = newQtYeast;
		timePrepare = newTimePrepare;

	}

}