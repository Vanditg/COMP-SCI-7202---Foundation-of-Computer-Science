//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: 2
//===================================

public class Car {
	
	private String model;
	private int numGears;
	private float literTank;
	private int yearManufacture;


	// Creating the accessors for model, numGears, Litertank, and yearManufacture.
	public String getModel(){
		return model;
	}

	public int getNumGears(){
		return numGears;
	}

	public float getLiterTank(){
		return literTank;
	}

	public int getYearManufacture(){
		return yearManufacture;
	}

	// Creating the mutators for model, numGears, Litertank, and yearManufacture.
	public void setModel(String newModel){
		model = newModel;
	}

	public void setNumGears(int newNumGears){
		numGears = newNumGears;
	}

	public void setLiterTank(float newLiterTank){
		literTank = newLiterTank;
	}

	public void setYearManufacture(int newYearManufacture){
		yearManufacture = newYearManufacture;
	}
	
	//default constructor
	Car(){

	}
	//parametric constructor
	Car(String model, int numGears, float literTank, int yearManufacture){
		model = newModel;
		numGears = numGears;
		literTank = newLiterTank;
		yearManufacture = newYearManufacture;

	}

	

}