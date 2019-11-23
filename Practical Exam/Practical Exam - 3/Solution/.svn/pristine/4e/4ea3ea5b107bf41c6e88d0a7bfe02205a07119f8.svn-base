//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: 3
//===================================


public class Problem extends ProblemAbstract{
	//Instatiating a string variable named myStr.
	private String myStr; 
	
	//Defining default constructor.
	Problem() {
		this.myStr = "none";
	}

	//Defining parametric constructor.
	Problem(String str) {
		this.myStr = str;
	}

	//Defining a method that reverse the string.
	public String reverse(String str) {

		char [] array=str.toCharArray();

		if (array.length==1) {
			return str;
		}

		else {
			//Using recursion here.
			return reverse(str.substring(1)) + str.charAt(0); 
		}
	}

	//Overriding the abstract method solve.

	@Override
	public void solve(String str1) {

		if (str1.equals(reverse(str1))) {
			System.out.println(str1+": palindrome");
		}

		else {
			System.out.println(str1+": non-palindrome");
		}

	}

	//Creating a accessor getMyStr here.
	public String getMyStr() {
		return this.myStr;
	}

	//Crating a mutator myStr here.
	public void setMyStr(String myStr) {
		this.myStr = myStr;
	} 
}
