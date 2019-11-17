/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

import java.util.*;

public class PrintCurrentReverse {
  
  //Defining methods for printing int, string and float array values.
  void  printArray(int [] array) {
    System.out.println(Arrays.toString(array));
  }
    
  void printArray(String [] array) {
    System.out.println(Arrays.toString(array));
  }
  
  void printArray(float [] array) {
    System.out.println(Arrays.toString(array));
  }

  //Defining methods for printing int, string and float array values in reverse order.
  int [] reverseArray(int [] array) {
    for (int counter = 0; counter < array.length / 2; counter++) {
      int temp = array[counter];
      array[counter] = array[array.length - 1 - counter];
      array[array.length - 1 - counter] = temp;
    }
  return array;
  }
    
  String [] reverseArray(String [] array) {
    for (int counter = 0; counter < array.length / 2; counter++) {
      String temp = array[counter];
      array[counter] = array[array.length - 1 - counter];
      array[array.length - 1 - counter] = temp;
    }
  return array;
  }
  
  float [] reverseArray(float [] array) {
    for (int counter = 0; counter < array.length / 2; counter++) {
      float temp = array[counter];
      array[counter] = array[array.length - 1 - counter];
      array[array.length - 1 - counter] = temp;
    }
  return array;
  }

  //Perform a call to print array values. 
  public static void main(String[] args) {
    int[] intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10 }; 
    String[] stringArray = new String[]{ "vandit","gajjar","hello","world"}; 
    float[] floatArray = new float[]{ 1.2f,35.f,6.9f }; 

    PrintCurrentReverse newOb = new PrintCurrentReverse();

    //printing  int, String and Float arrays of given value.
    System.out.println();
    System.out.print("Current int array: ");
    newOb.printArray(intArray);
    System.out.println();
    
    System.out.print("Current String array: ");
    newOb.printArray(stringArray);
    System.out.println();

    System.out.print("Current Float array: ");
    newOb.printArray(floatArray);
    System.out.println();

    //printing reverse array of the given Int, String and Float values.

    System.out.print("Reverse int array: ");
    newOb.printArray(newOb.reverseArray(intArray));
    System.out.println();

    System.out.print("Reverse String array: ");
    newOb.printArray(newOb.reverseArray(stringArray));
    System.out.println();

    System.out.print("Reverse Float array: ");
    newOb.printArray(newOb.reverseArray(floatArray));
    System.out.println();
  }
}
