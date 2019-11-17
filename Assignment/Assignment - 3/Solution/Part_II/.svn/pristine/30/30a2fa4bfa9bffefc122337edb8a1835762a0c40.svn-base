/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class RectangleArea extends Rectangle {

	Scanner ip = new Scanner(System.in);
	
	//Calling the base constructor. 
	RectangleArea() {
		super(0,0);
	}

	//Defining reading input method. 
	public void read_input () {
		
		//Defining string array. 
		String[] Inp; 
		System.out.println("Please enter two numbers that are separated with the space:");
		Inp = ip.nextLine().split(" ");
		double width=Double.parseDouble(Inp[0]);
		double height=Double.parseDouble(Inp[1]);
		setWidth(width);
		setHeight(height);
	}

	//Defining displaying output method.
	public void display() {
		System.out.println("Produced outpu: ");
 		super.display();
 		if ((getWidth()>=1 && getWidth()<=Math.pow(10,3)) && (getHeight()>=1 && getHeight()<=Math.pow(10,3))) {
 			System.out.println(getWidth() * getHeight());	
 		}
 		else {
 			System.out.println("Please enter number that needs to be in range.");
 		}
 		
 	}

}
