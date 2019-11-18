//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 4 Part - II
//===================================

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		//Taking user input for the disk here. 
		Scanner input = new Scanner(System.in);

		//Instantiating a new object which is named as tower1.
		HanoiTower tower1 = new HanoiTower();
		tower1.solve(tower1.getDisk(),"pole1","pole3","pole2");
		System.out.println("Number of steps to solve: " + tower1.numberSteps());
		System.out.println("Enter the number of disks:");

		//Instantiating another new object which is named as tower2.
		HanoiTower tower2 = new HanoiTower(input.nextInt());
		System.out.println("----------------------");
		tower2.solve(tower2.getDisk(),"pole1","pole3","pole2");
		System.out.println("Number of steps to solve: " +tower2.numberSteps());

	}
	
}
