/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class PrimeNumber {

  static void myPrime(int n) {

    //Handling exceptions using try, catch and finally.

    try {  
      
      //Developing logic from here. 
      int i,m=0,flag=0;   
      System.out.print("----------");
      System.out.println();
      System.out.print("Please add number here: ");
      Scanner input = new Scanner(System.in);
      n = input.nextInt();   
      m=n/2;      
      

      if(n==0||n==1) {  
        System.out.println(n+" is not prime number");      
      }

      else {  
        for(i=2;i<=m;i++) {      
          if(n%i==0) {      
            System.out.println(n+" is not prime number");      
            flag=1;      
            break;      
          }      
        }      
    
      if(flag==0) { 
        System.out.println(n+" is prime number"); }  
    
      } 
      System.out.print("----------");
      System.out.println();
    }

    catch (Exception e) {
      System.out.println("Please do not use any other variable type!");
    } 

    finally{
      System.out.println("The try catch is finished, you must use Integer only.");
    }
  }

  //Calling the above method to perform finding prime number. 
  public static void main(String[] args) {
    myPrime(5);
  }  
}   
