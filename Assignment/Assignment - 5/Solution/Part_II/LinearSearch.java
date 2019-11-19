//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - II
//===================================

// LinearSearch class which extends the MySearchAlg abstarct class. 

public class LinearSearch extends MySearchAlg {

	// Linear search method logic here. 
	public int search(int[] array, int num) {

		for (int i = 0; i < array.length; i++) {

			if (num == array[i]) {
				return i;
			}
		}
		
		return -1;
	}
}
