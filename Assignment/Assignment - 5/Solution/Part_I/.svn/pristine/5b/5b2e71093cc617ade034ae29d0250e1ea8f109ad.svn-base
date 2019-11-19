//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

import java.util.*;
import java.io.*;
public class Main {

	// Method to provide input till a happy number is found
	public static void nextHappyNum(int input) {

		// Defining variable answer.
		int answer = -1;
		while (answer == -1) {
			answer = checkHappyNum(input,0);
			input++;
		}

		input -=1; 
		System.out.println("Next smaller happy number is " + input);
	}		

	// Use of recursion and counter to check if the number is a happy number for the given case. 
	public static int checkHappyNum(int num,int counter) {
		if (counter == 4953) {
			return -1;
		}
		if (num == 1) {
			return 1;
		}
		
		List<Integer> list = split(num);
		int sum = 0;
		
		for (int i =0; i<list.size(); i++) {
			sum +=(int)Math.pow(list.get(i),2);
		}

		counter+=1;
		return checkHappyNum(sum,counter);	
	}

	// Using linked list to split a given number into an individual digits 
	public static List<Integer> split(int num) {
		List<Integer> individual = new ArrayList<Integer>();
		
		while(num>0) {
			individual.add(num%10);	
			num = num/10;
		}
		return individual;
	
	}

	// The method to decode given string
	public static String decodeString(String str) {
		
		if (str.length() == 0) 
			return "";

		String string = "";

		for (int i = 0; i < str.length(); i ++) {
			
			char c = str.charAt(i);
			
			if (Character.isDigit(c)) {
				
				int number = i;
				while (str.charAt(i) != '[') i++;
				
				int num = Integer.valueOf(str.substring(number, i));
				int count = 1;
				int strStart = i+1;
				i ++;
				
				while (count != 0) {
					if (str.charAt(i) == '[') count ++;
					else if (str.charAt(i) == ']') count --;
					i ++;
				}
				i--;
				
				// Use fo recursion here.
				String str1 = decodeString(str.substring(strStart, i));
				for (int j = 0; j < num; j ++) {
					string +=str1;
				}
			} 

			else {
				string +=c;
			}
		}
		
		return string;
	
	}		

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter a number");
		nextHappyNum(ip.nextInt());	
		String input = "3[b2[ca]1[d]]";
		System.out.println("Input : " + input);
   		System.out.println("Output :" + decodeString(input));	
	
	}
}
