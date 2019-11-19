//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

// QuickSort class which extends the MySortAlg abstarct class. 
public class QuickSort extends MySortAlg {
	public int [] sort(int [] array) {

		if(array.length > 1) {

			int [] array1 = this.getSmaller(array);
			array1 = this.sort(array1);

			int [] array2 = this.getBigger(array);
			array2 = this.sort(array2);

			return this.concatenate(array1, array[array.length-1], array2);

		} 

		else {
		
			return array;
		
		}
	}

	// Private method for concatenation.
	private  int [] concatenate(int []a1, int pivot, int [] a2) {
		
		int [] nArray = new int[a1.length + 1 + a2.length];
		int j = 0;
		
		for(int i = 0; i < a2.length; i++) {

			nArray[j] = a2[i];
			j++;

		}
		nArray[j] = pivot;
		j++;
		
		for(int i = 0; i < a1.length; i++) {
			nArray[j] = a1[i];
			j++;
		}

		return nArray;
	}

	// Private method for getSmaller number. 
	private  int [] getSmaller(int [] array) {

		int count = 0;

		for (int i = 0; i < array.length-1; i++)

			if(array[i] <= array[array.length-1])
				count++;
		
		int [] nArray = new int[count];
		int j = 0;

		for(int i = 0; i < array.length -1; i++) {
			
			if(array[i] <= array[array.length-1]) {
				nArray[j] = array[i];
				j++;
			
			}
		}
		
		return nArray;
	}

	// Private method for getBigger number. 
	private int [] getBigger(int [] array) {
		
		int count = 0;
		for (int i = 0; i < array.length-1; i++)
			
			if(array[i] > array[array.length-1])
				count++;
		
		int [] nArray = new int[count];
		int j = 0;

		for(int i = 0; i < array.length -1; i++) {
			
			if(array[i] > array[array.length-1]) {

				nArray[j] = array[i];
				j++;
				
			}
		}
		
		return nArray;
	}
}
