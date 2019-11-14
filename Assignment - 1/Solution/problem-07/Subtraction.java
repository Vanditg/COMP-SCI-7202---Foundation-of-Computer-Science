/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class Subtraction{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// creating variables

		float C;

		// taking input from the user for int A and B
		
		System.out.println("Enter integer A: ");
		int A = input.nextInt();
		System.out.println("Enter integer B: ");
		int B = input.nextInt();
		
		C = (float) B - A;

		System.out.println("The Devision of " + A + " and " + B + " is " + C);

	}

}
