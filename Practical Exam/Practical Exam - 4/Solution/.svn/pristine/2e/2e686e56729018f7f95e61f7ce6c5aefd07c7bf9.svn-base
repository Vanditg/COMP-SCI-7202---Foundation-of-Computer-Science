/*
*   Foundations of Computer Science
*   2019, Semester 02
*   Practical-Exam-04
*
*   student (id): a1779153
*   student (name): Vandit Jyotindra Gajjar
*
* Note: in order to finish your exam you need to make changes in this class.
* Note that you have to implemented lines from 57 - 67
*
*/
public class Insertion extends Sort{

	//Implementing Insertion-Sort Algorithm for Integer Array using Index. 
	@Override
	public int [] sortIntByIndex(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] >= key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return index;
	}

	//Implementing Insertion-Sort Algorithm for Integer arrays. 
	@Override
	public int [] sortInt(int [] arr){
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++){
			int key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;
			while( j >= 0 && arr[j] > key){
				if(arr[j] >= key){
					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}
			}
			arr[j+1] = key;
			index[j+1] = keyIndex;
		}
		return arr;
	}

	//Implementing Insertion-Sort Algorithm for String Array using Index. 
	@Override
	public int [] sortStringByIndex(String [] arr) {

		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++) {

			String key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;

			while( j >= 0 && arr[j].compareTo(key)>0) {

				if(arr[j].compareTo(key)>=0) {

					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;
				}

			}

			arr[j+1] = key;
			index[j+1] = keyIndex;

		}

		return index;
	}

	//Implementing Insertion-Sort Algorithm for String arrays. 
	@Override
	public String [] sortString(String [] arr){
		
		int [] index = this.getIndex(arr.length);

		for(int i = 1; i < arr.length; i++) {

			String key = arr[i];
			int keyIndex = index[i];
			int j = i - 1;

			while( j >= 0 && arr[j].compareTo(key)>0) {

				if(arr[j].compareTo(key)>=0) {

					arr[j+1] = arr[j];
					index[j+1] = index[j];
					j--;

				}
			}

			arr[j+1] = key;
			index[j+1] = keyIndex;

		}

		return arr;
	}


}
