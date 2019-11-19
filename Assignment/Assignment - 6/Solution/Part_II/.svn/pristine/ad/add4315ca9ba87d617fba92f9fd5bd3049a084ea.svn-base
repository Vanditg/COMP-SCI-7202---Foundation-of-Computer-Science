//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class MyBST {

	//Defining private variables.
	private Node base;

	//Default constructor.
	public MyBST() {

		this.base = null;

	}

	//Defining method insert for adding value.. 
	public void insert(int value) {	

		insertRec(this.base,value);

	}

	//Defining private method insertRec for adding the value. 
	private void insertRec(Node current, int value) {

		Node temp = new Node(value);

		if(this.base!=null) {

			if( current.getInput() > value) {

				if(current.getLeft() != null) {

					insertRec(current.getLeft(), value);

				} else {

					current.setLeft(new Node(value));

				}

			} else if(current.getInput() < value) {

				if(current.getRight() != null) { 

					insertRec(current.getRight(), value);

				} else{

					current.setRight(new Node(value));

				}
			}

		} else {

			this.base = new Node(value);

		}
	}

	//Returning booleans for search. 
	public boolean search(int value) {

		return searchRec(this.base, value);

	}

	// Defining booleans searchRec. 
	private boolean searchRec(Node current, int value) {

		try {

			if (current.getInput() == value) {
				return true;
			}

			else if (current.getInput() > value) {
				return searchRec(current.getLeft(),value);
			}

			else if (current.getInput() < value) {
				return searchRec(current.getRight(),value);
			}

			else {
				return false;
			}

		} catch(Exception e) {

			System.out.println("There are no elements in the data.");
			return false;

		} 
		

	}


}
