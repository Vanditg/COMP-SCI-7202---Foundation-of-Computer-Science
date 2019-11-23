//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: 3
//===================================

public class Problem extends ProblemAbstract {

//Tried the code but not able to perform it very well.
	
//Defining recursive method solve to get the substrings 
	public void solve(String str1) {

		char[] array = str1.toCharArray();

		if (array.length==1) {
			return;
		}

		display(array);
		System.out.println();

		int n=array.length;
		char [] a1 = subArray(array,n-1);
		String strA1 = new String(a1);

		solve(strA1);	

		int j = 1;
		char [] a2 = rSubArray(array,j);	
		j++;
		String strA2 = new String(a2);

		solve(strA2);

		display(a1);
		display(a2);
		System.out.println();
	}

	//Defining method to get the new array of n elements of the main array
	public char[] subArray(char[] array, int n) {

		char[] nArray = new char[n];

		for (int i=0; i<nArray.length  ;i++ ) {
			nArray[i] = array[i];
		}

		return nArray;
	}

	//Defining method to get the new array of n last elements of the main array.
	public char[] rSubArray(char[] array, int n) {

		char[] nArray = new char[n];
		int j=0;

		for (int i=array.length-n-1; i<nArray.length  ;i++ ) {
			nArray[j] = array[i];
			j++;
		}

		return nArray;
	}

	//Defining method to display the output
	public void display(char[] array) {

		if (array.length==0) {
			return;
		}

		System.out.print("{");

		for (int i =0;i<array.length ;i++ ) {
			System.out.print(array[i]);	
		}

		System.out.print("} ");

	}
}
