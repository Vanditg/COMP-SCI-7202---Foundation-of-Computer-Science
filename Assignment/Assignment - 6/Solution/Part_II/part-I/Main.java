//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class Main {

	public static void main(String[] args) {

		MyBST tree = new MyBST();
		int[] nodeElement = {5, 15, 9, 20, 6, 3, 8, 49};

		for (int i=0 ;i<nodeElement.length ;i++ ) {
			tree.insert(nodeElement[i]);
		}

		//Insert the search value here.
		int[] searchInput = {5, 20, 55, 1};

		for (int i=0 ;i<searchInput.length ;i++ ) {

			System.out.println("-----------------------");
			System.out.println("Searching the element: " + searchInput[i]);
			boolean answer = tree.search(searchInput[i]);

			if (answer) {

				System.out.println("The Element is found!");

			}
		}

	}
}
