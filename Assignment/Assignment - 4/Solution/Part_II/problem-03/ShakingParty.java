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

	//Instantiating private variables number of people and sum. 
	private int nPeople;
	private int sum;

	//Instatiating a rand object for random generation.
	Random rand = new Random();
	
	//Default constructor that gets random number till 4.
	ShakingParty() {
		this.nPeople = rand.nextInt(5);
		this.sum= nPeople-1;
	}

	//Parametrized constructor. 
	ShakingParty(int nTmp) {
		this();
		this.nPeople = this.nPeople + nTmp;
		this.sum= nPeople-1; 
	}
	
	//Main logic developed here.
	//Creating method for counting hand shakes here. 

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

	//Craeting accessors for getting people here.	
	public int getPeople() {
		return this.nPeople;
	}
	//Creating accessors for getting total sum here.
	public int getSum() {
		return this.sum;
	}

	//Craeting mutators for getting people here.	
	public void setPeople(int nPeople) {
		this.nPeople = nPeople;
	}
	
	//Craeting mutators for getting total sum here.	
	public void setSum(int sum) {
		this.sum = sum;
	}
}
