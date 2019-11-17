/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class Turtle extends Animal {
	
	//Default constructor
	Turtle() {

		//Calling the base constructor.
		super();
	}

	//Parametric Constructor
	Turtle(String name, double weight, String favouriteFood, int age) {
		
		//Calling the base constructor.
		super(name, weight, favouriteFood, age); 
	}

	//Defining abstract method makeSound.
	@Override
	public void makeSound() {
		System.out.println("Make Sound: ");
	}	
}
