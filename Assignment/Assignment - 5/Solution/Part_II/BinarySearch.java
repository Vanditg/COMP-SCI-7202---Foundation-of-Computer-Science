//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - II
//===================================

//  BinarySearch class which extends the MySearchAlg abstarct class. 

public class BinarySearch extends MySearchAlg {
	// Instatiating a new object sorting.
	MergeSort sorting = new MergeSort();

	// Binary search method logic here. 
	public int search(int[] array, int value) {
		
		int ans = searching(array, value);
		
		if (ans !=1) {
			for (int i=0; i<array.length ;i++ ) {
				if (array[i] == ans) {
					return i;
				}
			}		
		}
		return -1;
	}

	// Searching method logic here. 
	public int searching(int [] array, int value){
		
		int[] array1 = sorting.sort(array);
		int answer = this.locate(array1, value, 0, array.length-1);
		
		if (answer == -1) {
			return -1;
		}
		return array1[answer];
	}

	// Locate method here.
	public int locate(int [] array, int value, int lower, int upper) {

		if (upper < lower)
			return -1;
		
		int middle = (int) (lower + upper)/2;
		if (array[middle] == value)
			return middle;

		if (array[middle] < value)
			return this.locate(array, value, middle+1, upper);
		else
			return this.locate(array, value, lower, middle-1);

	}
}
