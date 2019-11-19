//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - I
//===================================

public class MyQueue {

	//Instatiating private variables.
	private Node front;
	private Node rear;

	//Default constructor.
	public MyQueue() {
		this.rear = null;
	}

	//Method Enqueue
	public void enqueue(Node node) {
		if (rear != null) {
			node.setNext(this.rear);
			this.rear = node;	
		}
		else {
			this.rear = node;	 
		}
	}

	//Node for Dequeue.
	public Node dequeue() {
		if(this.rear != null){
			if(this.rear.getNext() != null){
				Node tmp = this.rear;
				Node prev = null;
				while(tmp.getNext() != null){
					prev = tmp;
					tmp = tmp.getNext();
				}
				this.front = tmp;
				prev.setNext(null);
				if (this.front == this.rear) {
					this.rear = null;
				}

			} else{
				this.front = this.rear;
				this.rear = null;
			}

		}
		return front;
	}

	public Node getRear() {
		return this.rear;
	}

	//Method to display Queue.
	public static void displayQueue(MyQueue queue) {
		Node temp = queue.getRear();
		while(temp.getNext()!=null) {
			Node.printNode(temp);
			temp = temp.getNext();
		}
		Node.printNode(temp);
	}

	//Returning Boolean value.
	public boolean isEmpty() {
		if(this.rear == null) {
			return true;
		}
		return false;
	}
}
