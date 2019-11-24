/*==================================
Foundations of Computer Science
Student: Vandit Jyotindra Gajjar
id: a1779153
Semester: 2
Year: 2019
Practical Exam Number: 5
===================================*/

public class Queue {

	//Defining private variable.
	private Node rear;

	//Defining accessor - getRear.
	public Node getRear() {
		return this.rear;
	}

	//Defining mutator - setRear.
	public void setRear(Node rear) {
		this.rear = rear;
	}

	//Method enqueue - parameter tmpStudent.
	public void enqueue(Student tmpStudent) {
		
		Node node = new Node(tmpStudent);
		
		if (rear != null) {
			node.setNext(this.rear);
			this.rear = node;	
		}

		else {
			this.rear = node;				
		}
	}

	//Method dequeue.
	public Node dequeue() {

		Node front = new Node();
		if(this.rear != null) {
			if(this.rear.getNext() != null) {
				Node tmp = this.rear;
				Node prev = null;
				while(tmp.getNext() != null) {
					prev = tmp;
					tmp = tmp.getNext();
				}

				front = tmp;
				prev.setNext(null);
				if (front == this.rear) {
					this.rear = null;
				}

			} else {
				front = this.rear;
				this.rear = null;
			}

		}
		
		return front;
	}

	//Method displayQueue.
	public void displayQueue() {
		if (this.rear != null) {
			System.out.println("Unexpected Output!");
		}

		else {
			System.out.println("");
		}

	}


}
