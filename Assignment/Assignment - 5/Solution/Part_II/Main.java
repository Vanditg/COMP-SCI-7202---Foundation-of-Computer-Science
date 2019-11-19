//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - II
//===================================

public class Main {

	// Instatiating objects here. 
	public static MySearchAlg search = new LinearSearch();
	// public static MySearchAlg search = new BinarySearch();

	public static void main(String[] args) {

		int[] array = {1, 3, 2, 89, 55, 45, 9};
		int[] ans = {4, 6, 2};
		int[] pos = new int[3];
		int[] searchArray = {55, 9, 2};
		
		for (int i = 0; i < pos.length; i++ ) {

			pos[i] = search.search(array, searchArray[i]);
			boolean check = test(pos[i], ans[i]);
			System.out.println("case" + i+1 + ": " + check);

		}

		int[] array1= {1, 5, 8, 12, 9, 7, -1};
		int answer = findMaxVal(array1);
		System.out.println("The maximum element is " + answer);		

	}

	// Method to return two integers which are same for true or false. 
	private static boolean test(int result, int ans) {
		if (result != ans) {
			return false;
		}
		return true;
	}

	// Method to find maximum value in the given array. 
	private static int findMaxVal(int array[]) {
		MergeSort sort = new MergeSort();
		int[] array1 = sort.sort(array);
		return search.search(array,array1[array1.length-1]);
	}
	
}
