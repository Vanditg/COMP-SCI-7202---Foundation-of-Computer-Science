/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Rectangle {

	//List of private attributes.
	private double width;
	private double height;
	
	//Parametric constructor.
	Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
 	
 	//Defining methods.
 	public void display() {
 		System.out.println(this.width + " " + this.height);
 	}

 	//Creating acessors width and height.
	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

 	//Creating mutators width and height.
	public void setWidth(double width) {
		this.width = width;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
