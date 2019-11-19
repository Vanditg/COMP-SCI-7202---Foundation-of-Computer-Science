//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class Node {

	//Instatiating private variables.
	private char charData;
	private int intData;
	private Node next;

	//Default constructor. 
	Node() {
		this.next = null;
	}

	//Method to print nodes.
	public static void printNode(Node node) {
		System.out.print(node.getIntData() + " ");
	}

	//Defining accessors here. 
	public char getCharData() {
		return this.charData;
	}

	public int getIntData() {
		return this.intData;
	}

	public Node getNext() {
		return this.next;
	}

	//Defining mutators here.
	public void setCharData(char charData) {
		this.charData = charData;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setIntData(int intData) {
		this.intData = intData;
	}
}
