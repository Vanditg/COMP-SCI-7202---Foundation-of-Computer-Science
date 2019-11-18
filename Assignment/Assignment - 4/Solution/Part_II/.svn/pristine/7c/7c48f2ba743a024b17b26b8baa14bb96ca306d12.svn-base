//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 4 Part - II
//===================================

import java.util.*;

public class ShakingParty {

	//Instatiating private variable number of people and sum here.
	private int nPeople;
	private int sum;

	//Instatiating a rand object for random generation.
	Random rand = new Random();
	
	//Default constructor that gets random number till 50.
	public ShakingParty() {
		this.nPeople = rand.nextInt(51);
		this.sum= nPeople-1;
		System.out.println(nPeople);
	}

	//Parametrized constructor
	public ShakingParty(int nTmp) {
		this.nPeople = nTmp;
		this.sum= nPeople-1;
	}
	
	//Main logic here. 
	//Creating a method count hand shake here using do-while loop.

	public int countHandShakes() {

		do {

			if (this.nPeople ==1) {

				return this.sum;

			}

			this.nPeople--;
			this.sum += this.nPeople-1;

			return(countHandShakes());

		} while(this.nPeople>=1);
	}
}
