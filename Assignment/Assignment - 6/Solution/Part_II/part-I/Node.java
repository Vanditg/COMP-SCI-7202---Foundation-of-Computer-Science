//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class Node {
	//Defining private variables.
	private int input;
	private Node left;
	private Node right;

	//Default constructor.
	Node() {

		this.left = null;
		this.right = null;
		this.input = 0;

	}

	//Parametric constructor.
	Node(int value) {

		this.left = null;
		this.right = null;
		this.input = value;

	}

	//Displaying message.
	public void printNode() {

		System.out.println("Node value: " + input);

	}

	//Defining accessors. 
	public int getInput() {

		return this.input;

	}
	public Node getLeft() {

		return this.left;

	}
	public Node getRight() {

		return this.right;

	}

	//Defining mutators. 
	public void setInput(int input) {

		this.input = input;

	}
	public void setLeft(Node left) {

		this.left = left;

	}
	public void setRight(Node right) {

		this.right = right;
		
	}	

}
