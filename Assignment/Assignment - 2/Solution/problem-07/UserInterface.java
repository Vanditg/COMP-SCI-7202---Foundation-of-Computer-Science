/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class UserInterface {
	public static void main(String[] args) {
		
		System.out.println ("Welcome dear user!");
		System.out.println ("Would you like to");
		System.out.println ("a) sum again");
		System.out.println ("b) exit");
		System.out.print ("Option: ");

		// Declaring variables and uses Scanner function to ask the user for input.
		Scanner in = new Scanner(System.in);
		char optionSelected = in.next().charAt(0);

		// Running the while loop infinitely to ask the user every-time for the input.
		while (true) {
			
			if(optionSelected == 'a' || optionSelected == 'A') {

				System.out.print("Please, insert the first number: ");
				int firstNumber = in.nextInt();
				System.out.print("Please, insert the second number: ");
				int secondNumber = in.nextInt();
				System.out.println("-------\nThank you for your enquiry, the sum between " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber) + ".");
			
			}

			else if(optionSelected == 'b' || optionSelected == 'B') {
			
				System.out.println("Thank you! Have a good day.");
				break;

			}

			// After each iteration loop will ask the input from the user. 
			System.out.print("\n");
			System.out.println ("Welcome dear user!");
			System.out.println ("Would you like to");
			System.out.println (" a) sum again");
			System.out.println (" b) exit");
			System.out.println (" Option: ");

			optionSelected = in.next().charAt(0);
			
		}
	}
}
