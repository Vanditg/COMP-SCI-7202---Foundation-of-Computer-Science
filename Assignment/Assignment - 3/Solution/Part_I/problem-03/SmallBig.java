/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class SmallBig {

  static void myNumber() {

    //Handling exceptions using try, catch and finally.
    try {  
  
      int a, b, big;
      Scanner scan = new Scanner(System.in);

      //Asking for user input here.
      System.out.print("----------");
      System.out.println();
      System.out.print("Please, insert a number (1) : ");
      a = scan.nextInt();
      System.out.print("Please, insert a number (2) : ");
      b = scan.nextInt();
      //Creating logic here.
      if(a>b) {
        big = a;
      }
      
      else {
        big = b;
      }
        
      System.out.print("The bigger number is " +big);
      System.out.println();
      System.out.print("----------");
    }

    catch (Exception e) {
      System.out.println();
      System.out.println("Please do not use any other variable type!");
   } 

    finally{
      System.out.println();
      System.out.println("The try catch is finished, you must use Integer in both inputs. ");
  }
}
  //Calling the above method to perform finding big number. 
  public static void main(String[] args) {
    myNumber();
  }  
}   
