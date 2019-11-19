//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - II
//===================================

import java.util.*;

public class MyGraph {

    //Defining private variables LinkedList. 
    private LinkedList<Node> adjListArray[];

    //Default constructor.
    public MyGraph() {

        this.adjListArray = null;

    }

    //Defining method matrixToList which transform an adjacency matrix to an adjacency list.
    public void matrixToList(int[][] adj) {

        int n = adj.length;
        this.adjListArray = new LinkedList[n];

        for (int i=0; i<adj.length; i++) {

            LinkedList linkedList = new LinkedList();

            for (int j=0 ; j<adj[i].length; j++) {

                if (adj[i][j] == 1) {

                    linkedList.add(new Node(j));

                }
            }

            this.adjListArray[i] = linkedList;

        }
    }

    //Print out the adjacency list array.
    public void displayAdjListArray() {

        for (int i=0 ;i<this.adjListArray.length ; i++) {

            System.out.print(i + ":");

            for (Node node : this.adjListArray[i]) {

                node.printNode();

                if (node != this.adjListArray[i].peekLast()) {

                    System.out.print("-> ");    

                }
            }

            System.out.println("\n");
        }
    }
}
