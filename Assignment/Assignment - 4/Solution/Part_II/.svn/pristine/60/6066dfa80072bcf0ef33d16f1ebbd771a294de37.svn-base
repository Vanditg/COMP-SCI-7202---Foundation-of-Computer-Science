//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 4 Part - II
//===================================

import java.util.*;

//Creating class that extends ShakingParty class. 
public class ShakingPartyConstrainted extends ShakingParty {

	//Instatiating private variable number of couples here. 
	private int nCouples;
	Random rand = new Random();

	//Default constructor that generates number upto 4 for setting people and total sum here.
	ShakingPartyConstrainted() {
		this.nCouples = rand.nextInt(5);// generating number till 4
		System.out.println("Number of couples are :" + nCouples);
		this.setPeople(2*nCouples);
		this.setSum(this.getPeople()-1);
	}

	//Parametrized constructor.
	ShakingPartyConstrainted(int nTmp) {
		this();
		this.nCouples = this.nCouples + nTmp;
		System.out.printf("New couples %d are added. So total couples are %d \n", nTmp, this.nCouples);	
		this.setPeople(2*nCouples);
		this.setSum(this.getPeople()-1);
	}

	//Main logic here.
	//Creating method count hand shakes here using do-while loop 
	public int countHandShakes() {

		do {

			if (this.nCouples ==1) {

				return this.getSum();

			}

			this.nCouples--;
			this.setPeople(this.getPeople()-1);
			this.setSum(this.getSum()+this.getPeople()-1);

			return(countHandShakes());

		} while(this.nCouples>=1);
	}
}
