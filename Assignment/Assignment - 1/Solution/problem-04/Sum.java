/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class Sum {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Creating variable 

		int numberC;
		
		// taking input from the user for int A and B
		
		System.out.println("Enter integer A: ");
		int numberA = input.nextInt();
		System.out.println("Enter integer B: ");
		int numberB = input.nextInt();

		numberC = numberA + numberB;

		// Display information

		System.out.println();
		System.out.println("The sum of " + numberA + " and " + numberB + " is " + numberC + ".");

	}

}
