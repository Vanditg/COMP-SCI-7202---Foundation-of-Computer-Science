//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class MyStack {
	//Instatiating private variables.
	private Node top;

	//Default constructor. 
	public MyStack() {
		Node top = null;
	}		

	//Method - Push
	public void push(Node node) {
		Node temp = top;
		top = node;
		node.setNext(temp);
	}

	//Method - Pop
	public Node pop() {
		if(top != null) {
			Node temp = this.top;
			this.top = this.top.getNext();
			return temp;
		}
		else {
			System.out.println("Stack is Empty");
			return null;
		}
	}

	//Peek
	public Node peek() {
		if (top != null) {
			return top;
		}
		else {
			return null;
		}
	}

	//Returing boolean value.
	public boolean isEmpty() {
		if (top != null) {
			return false;
		}
		else {
			return true;
		}
	}

}
