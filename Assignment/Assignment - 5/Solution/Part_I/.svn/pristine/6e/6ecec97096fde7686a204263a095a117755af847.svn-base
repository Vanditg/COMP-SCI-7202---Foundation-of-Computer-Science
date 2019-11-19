//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

public class Main {

	// Instatiating a new object for Sorting algorithm. 

	public static MySortAlg object = new InsertionSort();
	// public static MySortAlg object = new MergeSort();
	// public static MySortAlg object = new QuickSort();
	
	public static void main(String[] args) {
		
		int[] question = {1, 20, 52, 5, 6, -76};
		int[] answer = {88, 3452, 20, 6, 5, 0};

		System.out.print("This array values are before sorting the array.");
		object.printArray(question);
		
		System.out.print("This is the predefined answer of the given array.");
		object.printArray(answer);

		int[] result = object.sort(question);
		System.out.print("This array values are after sorting the array.");
		object.printArray(result);

		showAnswer(test(result,answer));
		System.out.println("*********************");
		
		int[] array1 = {1, 52, 55, 89, 5, 56};
		int[] array2 = {5, 55, 52, 56, 1, 89};
		int[] array3 = {1, 8, 5, 9, 5, 6};
		
		System.out.print("Array1 = ");
		object.printArray(array1);

		System.out.print("Array2 = ");
		object.printArray(array2);

		System.out.print("Array3 = ");
		object.printArray(array3);

		System.out.print("Comparing Array1 and Array2, returns : ");
		showAnswer(compare(array1,array2));

		System.out.print("Comparing Array1 and Array3, returns : ");
		showAnswer(compare(array1,array3));

		System.out.println("*********************");

		System.out.print("The given Array is:  ");
		object.printArray(question);

		System.out.println("The smallest sum for the above Array is " + findSmallestSum(question));
	
	}

	// Method to find the smallestsum for given array.
	public static int findSmallestSum(int[] array) {
		
		int[] ans = object.sort(array);

		return ans[ans.length-1] + ans[ans.length-2];

 	}

 	// Method to compare between two arrays, and returns True or False. 
	public static boolean compare(int[] arr1, int[] arr2) {
		
		int[] ans1 = object.sort(arr1);
		int[] ans2 = object.sort(arr2);

		return test(ans1,ans2);

	}

	// Method for the testing of two arrays. 
	public static boolean test(int[] arr1, int[] arr2) {
		
		for (int i=0; i<arr1.length ;i++ ) {
			
			if (arr1[i] != arr2[i]) {
				
				return false;	

			}
		}

		return true;
	}

	// Method to print the answer for given boolean value. 

	public static void showAnswer(boolean value) {

		if (value) {

			System.out.println("The answer is same.");

		}

		else {
			
			System.out.println("The answer is not same");

		}
	}
}
