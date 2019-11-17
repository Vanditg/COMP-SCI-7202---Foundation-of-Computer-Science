/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

abstract class Shape {

	//List of private attributes.
	private double width;
	private double height;
	private double radius;
	private double length;

	//Default constructor
	Shape(){
		this.width = 40.0d;
		this.height = 55.0d;
		this.radius = 22.0d;
		this.length = 30.0d; 
	}

	//Parametric Constructor
	Shape(double width, double height, double radius, double length) {
		this.width = width;
		this.height = height;
		this.radius = radius;
		this.length = length; 
	}

	//Creating accessors for Width, Height, Radius, and Length.
	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}
	
	public double getRadius() {
		return this.radius;
	}

	public double getLength() {
		return this.length;
	}

	//Creating mutators for Width, Height, Radius, and Length.
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setLength(double length) {
		this.length = length;
	}

	abstract public double area();
}
