/*
*   Foundations of Computer Science
*   2019, Semester 02
*   Practical-Exam-04
*
*   student (id): a1779153
*   student (name): Vandit Jyotindra Gajjar
*
* Note: in order to finish your exam you need to make changes in this class
* Problem 03
*/
public class Selection extends Sort{

	@Override
	// returns index array after sorting 
	public int [] sortIntByIndex(int [] arr) {
		int n = arr.length;
		int [] index = new int[n];
		for (int i=0 ;i<n ;i++ ) {
			index[i] = i;
		}
		for (int i=0 ;i<n-1 ;i++ ) {
			int min_ind = i;
			for (int j=i+1 ;j<n ;j++ ) {
				if (arr[j]<arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
			temp = index[i];
			index[i] = index[min_ind];
			index[min_ind] = temp; 
		}
		return index;
	}

	@Override
	// normal insertion sort(integer)
	public int [] sortInt(int [] arr){
		int n = arr.length;
		for (int i=0 ;i<n-1 ;i++ ) {
			int min_ind = i;
			for (int j=i+1 ;j<n ;j++ ) {
				if (arr[j]<arr[min_ind]) {
					min_ind = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp; 
		}
		return arr;
	}


	@Override
	//Return the index array after Selection Sorting. 
	public int [] sortStringByIndex(String [] arr) {

		int n = arr.length;
		int [] index = new int[n];

		for (int i=0 ;i<n ;i++ ) {

			index[i] = i;
		
		}

		for (int i=0 ;i<n-1 ;i++ ) {

			int min_ind = i;
			
			for (int j=i+1 ;j<n ;j++ ) {

				if (arr[j].compareTo(arr[min_ind])<0) {

					min_ind = j;

				}
			}

			String temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp;
			int temp1 = index[i];
			index[i] = index[min_ind];
			index[min_ind] = temp1; 

		}

		return index;

	}

	@Override
	//Implementing Selection-sort for String arrays. 
	public String [] sortString(String [] arr) {

		int n = arr.length;
		
		for (int i=0 ;i<n-1 ;i++ ) {
		
			int min_ind = i;
		
			for (int j=i+1 ;j<n ;j++ ) {
		
				if (arr[j].compareTo(arr[min_ind])<0) {
					min_ind = j;
		
				}
		
			}
		
			String temp = arr[i];
			arr[i] = arr[min_ind];
			arr[min_ind] = temp; 
		
		}
		
		return arr;
	
	}
}

