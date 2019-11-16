/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/


import java.util.Random;
import java.lang.Math;

public class RandomNumbersSwitchCase {
	public static void main(String[] args) {

		//Creating variable and initiating random number.
		int sum = 0;
		float mean;
		char printingChar;
		Random random = new Random();
		System.out.print("\n");

		//Defining loop with the conditions and printing the char corresponding to switch-case and generated number. 
		for (int i = 1; i <= 10; i++) {

			int randomNumber = random.nextInt(20);

			switch(randomNumber) {

				case 1 :
				case 2 :
				case 3 :
				case 4 :
				case 5 :
					printingChar = 'o';
					break;
				case 6 :
				case 7 :
				case 8 :
				case 9 :
				case 10 :
					printingChar = 'x';
					break;
				case 11 :
				case 12 :
				case 13 :
				case 14 :
				case 15 :
					printingChar = 's';
					break;
				default :
					printingChar = '*';
				
				}

			System.out.print ("Number ( "+randomNumber+ ") : " );
			for (int j = 1; j <= randomNumber; j++) {

				System.out.print(printingChar);
	
			}

			sum = sum + randomNumber;
			System.out.print("\n");
	
		}
		
		//Calculating the mean and round about the figure. 
		mean = (float)(sum / 10.0);
		System.out.print("Average " + "(" + Math.round(mean) + ")" + ": " );
		for (int j = 1; j <= mean; j++) {

			System.out.print("*"); 
		
		} 

		System.out.println();
	}
}
