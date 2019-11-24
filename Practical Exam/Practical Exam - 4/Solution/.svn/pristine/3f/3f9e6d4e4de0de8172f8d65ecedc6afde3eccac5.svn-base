/*
*   Foundations of Computer Science
*   2019, Semester 02
*   Practical-Exam-04
*
*   student (id): a1779153
*   student (name): Vandit Jyotindra Gajjar
*
*/
public class Test{

	public static void main(String [] args) {

		Insertion sorting = new Insertion();
		Search searching = new BinarySearch();
		int unsorted [] = new int []{3,1,5,2,4};
        String [] uname = new String [] {"dex", "chenko","adam", "budy", "titus", "cerry"};
        String [] name = new String [] {"adam",  "budy", "cerry", "dex", "chenko", "titus"};
		int unsorted2 [] = new int []{3,1,5,2,4};
		int [] sortedInd = sorting.sortInt(unsorted);
		sorting.printArray(uname, "unames: ");
		String[] sortedNames = sorting.sortString(uname);
		sorting.printArray(uname, "unames: ");

		String space = " ";
		System.out.println("search(id): " + name[searching.search(name, "titus")]);
		System.out.println("search(id): " + sortedNames[searching.search(sortedNames, "titus")]);
		System.out.println("search(id): " + searching.search(sortedInd, 4));
		System.out.println("search(id): " + searching.search(sortedInd, 1));

		String a = "b";
		System.out.println(name.length);
		System.out.println(a.compareTo("b"));
		System.out.println(a.compareTo("a"));
		System.out.println(a.compareTo("c"));

	}
}
