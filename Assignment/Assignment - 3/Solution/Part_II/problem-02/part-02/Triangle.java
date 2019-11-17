/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Triangle extends Shape {

	//Default constructor
	Triangle() {

		//Calling the base constructor.
		super();
	}

	//Parametric Constructor
	Triangle(double base, double height) {

		//Calling the base constructor.
		super(0, height, 0, base); 
	}

	//Defining abstract method.
	@Override
	public double area() {
		return 0.5*(this.getHeight() * this.getLength());
	}
}
