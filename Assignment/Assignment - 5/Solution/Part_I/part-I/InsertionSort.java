//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

// InsertionSort class which extends the MySortAlg abstarct class. 
public class InsertionSort extends MySortAlg {
	public int [] sort(int [] array) {
		
		// Total elements in a given array. 
		int n = array.length;
		int i;

		// Main logic of InsertionSort here, which results a sorted array in a descending order. 
		for (int j = 1; j < n; j++) {
			
			int key = array[j];
			i = j - 1;
			
			while (( i >= 0) && (array[i] < key )) {
				
				array[i+1] = array[i];
				i--;	
			
			}
			
			array[i+1] = key;
		}

		return array;
	}
}
