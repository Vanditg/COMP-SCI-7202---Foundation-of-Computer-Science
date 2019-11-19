//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - II
//===================================

public class Node {
    
    //Defining private variables.
    private int index;
    private Node next;

    //Default constructor.
    public Node() {

        this.index = 0;
        this.next = null;

    }

    //Parametric constructor.
    public Node(int index) {

        this.index = index;
        this.next = null;

    }

    //Displaying message.
    public void printNode() {

        System.out.print("Node " + this.index);

    }

    //Defining accessors. 
    public int getIndex() {

        return index;

    }

    //Defining mutators. 
    public void setIndex(int index) {

        this.index = index;

    }
    
}
