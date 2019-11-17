/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*; 
  
public class Detem { 

    public static void main(String[] args) { 
        
        int rows, columns, row_index, column_index; 
        Scanner in = null; 
        in = new Scanner(System.in); 
        
        System.out.println(" Welcome to Matrix Determinant Calculator!");
        System.out.println("Would you like to calculate the determinant of a new matrix?");
        System.out.println("1. Yes, 2. No");
        int choice = in.nextInt(); 
        while(choice==1) {
            
            System.out.println("\n What is the dimension of the matrix?");
            System.out.println("Enter the number of rows of the matrix"); 
            rows = in.nextInt(); 
            System.out.println("Enter the number of columns of the matrix"); 
            columns = in.nextInt(); 
  
            //Declare the matrix 
            int ourMatrix[][] = new int[rows][columns]; 
  
            System.out.println("Great! Let's calculate this determinant then.\n" + "Please insert all the values for your matrix.");
            
            //Read the matrix values 
            System.out.println("Enter the elements of the matrix"); 
            for (row_index = 0; row_index < rows; row_index++) 
                for (column_index = 0; column_index < columns; column_index++) 
                {
                    System.out.print("New matrix ["+row_index+"]["+column_index+"]: ");
                    ourMatrix[row_index][column_index] = in.nextInt(); 
                }
                   
            int determinant = 0;
            
            //matirx is 2*2; formale for calculation of this matrix.
            if(rows==2) {
                determinant = ourMatrix[0][0]*ourMatrix[1][1]  - ourMatrix[0][1]*ourMatrix[1][0];
            }
            
            //matirx is 3*3; formale for calculation of this matrix.
            else if(rows==3) {
              
                determinant = ourMatrix[0][0]*ourMatrix[1][1]*ourMatrix[2][2]  
                            + ourMatrix[0][1]*ourMatrix[1][2]*ourMatrix[2][0]
                            + ourMatrix[1][2]*ourMatrix[1][0]*ourMatrix[2][1]
                            - ourMatrix[1][2]*ourMatrix[1][1]*ourMatrix[2][0]
                            - ourMatrix[0][1]*ourMatrix[1][0]*ourMatrix[2][2]
                            - ourMatrix[0][0]*ourMatrix[1][2]*ourMatrix[2][1];
            }
            
            System.out.println("The determinant of your matrix is : ");
            
            //Display the matrix 
            for (row_index = 0; row_index < rows; row_index++) { 
                System.out.print(" | ");
                for (column_index = 0; column_index < columns; column_index++) 
                    System.out.print(ourMatrix[row_index][column_index] + "  "); 
                System.out.print(" | \n");
            }
            System.out.print( "Determinant: "+determinant );
            break;     
        }
    }
}
