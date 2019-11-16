/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class Software{

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Scanner inputOne = new Scanner(System.in);
		Scanner inputTwo = new Scanner(System.in);

		// taking input from the user in string format and displaying information

		System.out.println("Please Enter your Name: ");
		String studentName = input.nextLine();
		System.out.println();
		System.out.println("The name of the student is " + studentName + ".");

		// taking input from the user in int format and displaying information

		System.out.println();
		System.out.println("Please Enter your Age in years and months: ");
		int studentAgeYears = input.nextInt();
		int studentAgeMonths = input.nextInt();
		System.out.println();
		System.out.println("The Age of " + studentName + " is " + studentAgeYears + " years and " + studentAgeMonths + " months.");

		// taking input from the user in string format and displaying information

		System.out.println();
		System.out.println("Please provide what you like in food? ");
		String studentFood = inputOne.nextLine();
		System.out.println();
		System.out.println(studentName + " likes " + studentFood);

		// taking input from the user in string format and displaying information

		System.out.println();
		System.out.println("Please enter your grades in Maths and English: ");
		String gradeMaths = inputTwo.nextLine();
		String gradeEnglish = inputTwo.nextLine();
		System.out.println();
		System.out.println("The garde in maths and english is " + gradeMaths + " and " + gradeEnglish + " respectively." );

		// taking input from the user in int format and displaying information

		System.out.println();
		System.out.println("Please enter the Height in Foot and Inch: ");
		int studentHeightFoot = input.nextInt();
		int studentHeightInch = input.nextInt();
		System.out.println();
		System.out.println("The provided height is " + studentHeightFoot + " Foot and " + studentHeightInch + " Inch.");		

		// taking input from the user in int format and displaying information

		System.out.println();
		System.out.println("Please enter the Weight in Kg: ");
		Float studentWeight = input.nextFloat();
		System.out.println();
		System.out.println("The Weight of " + studentName + " is " + studentWeight + " Kg.");

		// taking input from the user in int format and displaying information

		System.out.println();
		System.out.println("Please enter the number of subjects you have taken in this semester :");
		int studentSubject = input.nextInt();
		System.out.println();
		System.out.println(studentName + " has taken " + studentSubject + " subjects in this semester.");

		}

	
}
