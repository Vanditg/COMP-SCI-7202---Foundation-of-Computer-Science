//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 6 Part - II
//===================================

import java.util.*;

public class Main {

	public static void main(String[] args) {

		int [][] matrix = getMatrix(); 
        MyGraph graph = new MyGraph();
        graph.matrixToList(matrix);
        graph.displayAdjListArray();

	}

	public static int[][] getMatrix() {

		int m = 0, i, j;
		Scanner input = new Scanner(System.in);

        while(true) {

            try {

                input = new Scanner(System.in);
                System.out.println("Enter the number of rows and number of columns: ");
                m = input.nextInt();

                int[][] adj = new int[m][m];

                // Read the matrix values 
                System.out.println(" Individual element of the defined matrix: ");

                for (i = 0; i < m; i++) {

                    for (j = 0; j < m; j++) {

                        while(true) {

                        	if (i==j) {

                        		adj[i][j] = 0;
                        	}

                        	else {

                        		System.out.println("Please enter a number in position of [" + i + "] and [" + j + "]");
                        		adj[i][j] = input.nextInt();
                        	}

                            if (adj[i][j] ==0 || adj[i][j] ==1) {

                                break;
                            }

                            else {

                                System.out.println("The input is wrong! Please consider to enter a number either 0 and 1"); 
                                System.out.println("A element 1 indicates that there is an edge from node i to node j and 0 indicates that there is no edge from node i to j.");

                            }
                        }
                    }
                }
                return adj;

            } catch (Exception e) {

                System.out.println("Someting went wrong! Please try again!");

            }
        }
        
	}
}
