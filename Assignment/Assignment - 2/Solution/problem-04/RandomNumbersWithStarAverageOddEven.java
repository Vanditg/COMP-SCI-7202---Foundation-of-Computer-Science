/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/


import java.util.Random;
import java.lang.Math;

public class RandomNumbersWithStarAverageOddEven {
	public static void main(String[] args) {

		//Creating variable and initiating random number.
		int sum = 0;
		float mean;
		char printingChar;
		Random random = new Random();
		System.out.print("\n");

		//Defining loop with the conditions and printing the char corresponding to generated number. 
		for (int i = 1; i <= 10; i++) {

			int randomNumber = random.nextInt(20);

			if((randomNumber%2)==0) {
				printingChar = '+';
			}

			else {
				printingChar = '-';
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
