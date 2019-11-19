//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - II
//===================================

public class MergeSort {

	public int [] sort(int [] array) {

		if(array.length > 1) {

			int q = Math.round(array.length/2);
			int [] array1 = this.getSubArray(array, 0, q);
			array1 = this.sort(array1);

			int [] array2 = this.getSubArray(array, q, array.length);
			array2 = this.sort(array2);
			
			return this.merge(array1, array2);

		} 

		else {

			return array;
		
		}
	}

	// Private method for Getting a Sub Array. 
	private  int [] getSubArray(int [] array, int start, int end){

		if(start < end) {

			int [] nArray = new int [end - start];
			int counter = 0;

			for(int i = start; i < end; i++){
				
				nArray[counter] = array[i];
				counter++;

			}

			return nArray;
		} 

		else {
			
			return array;
		
		}
	}

	// Private method for merging the arrays. 
	private  int [] merge(int [] array1, int [] array2){

		int n1 = array1.length;
		int n2 = array2.length;
		int nArray [] = new int[n1 + n2];
		int i1=0, i2=0,j=0;

		while (i1 < n1 && i2 < n2) {

			if(array1[i1] < array2[i2]) {
				nArray[j] = array1[i1];
				i1++;
				j++;
			} 

			else {
				nArray[j] = array2[i2];
				i2++;
				j++;
			}

		}
		
		while (i1 < n1) {

			nArray[j] = array1[i1];
			i1++;
			j++;

		}

		while (i2 < n2) {

			nArray[j] = array2[i2];
			i2++;
			j++;
			
		}

		return nArray;
	}
	
}
