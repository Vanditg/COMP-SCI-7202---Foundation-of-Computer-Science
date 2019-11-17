/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 name: Vandit Jyotindra Gajjar 
*
*/

public class Complex {
 
  private double real;
  private double imaginary;
  
  //Making getter and setter accessors and mutators here for real and imaginery numbers.
  public double getReal() {
    return this.real;
  }

  public void setReal(double real) {
    this.real = real;
  }

  public double getImaginary() {
    return this.imaginary;
  }

  public void setImaginary(double imaginary) {
    this.imaginary = imaginary;
  }

  public Complex() {
    this.setReal(0);
    this.setImaginary(0);
  }
 
  public Complex(double real, double imaginary){
    this.setReal(real);
    this.setImaginary(imaginary);
  }
 
  public void setRealAndImaginary(double real, double imaginary){
    this.setReal(real);
    this.setImaginary(imaginary);
  }
 
  public String toString() {
    return "Values : [ (" + real + " ) + (" + imaginary + " i ) ]";
  }
  
  //Creating methods for addition, subtraction, multiplication and Division. 
  public Complex addition(Complex temp){
    Complex result = new Complex();
    result.real = this.getReal() + temp.getReal();
    result.imaginary = this.getImaginary() + temp.getImaginary();
    return result;
  }
 
  public Complex subtraction(Complex temp){
    Complex result = new Complex();
    result.real = this.getReal() - temp.getReal();
    result.imaginary = this.getImaginary() - temp.getImaginary();
    return result;
  }
    
  public Complex multiplication(Complex temp){
    Complex result = new Complex();
    result.real = ( this.getReal() * temp.getReal() ) - ( this.getImaginary() * temp.getImaginary());
    result.imaginary = ( this.getReal() * temp.getImaginary() ) + ( this.getImaginary() * temp.getReal());
    return result;
  }
    
  public Complex division(Complex temp){
    Complex result = new Complex();
    result.real = ((( this.getReal() * temp.getReal() ) + ( this.getImaginary() * temp.getImaginary())) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
    result.imaginary =((( this.getReal() * temp.getImaginary() ) - ( this.getImaginary() * temp.getReal() )) / (Math.pow(temp.getReal(), 2) + Math.pow(temp.getImaginary(), 2)));
    return result;
  }
  
  //Calling the above methods to perform addition, subtraction, multiplication and devision of two numbers. 
  public static void main(String[] args) {
  
    Complex complex = new Complex();
    
    //Providing the data for number 1 and 2.
    Complex complex1 = new Complex(1,-1);
    Complex complex2 = new Complex(1,1);
  

    System.out.println("complex1  " + complex1);
    System.out.println("complex2  " + complex2);
  
    System.out.println("\n\n\nAddition  " + complex1.addition(complex2));
    System.out.println("Subtraction  " + complex1.subtraction(complex2));
    System.out.println("Multiplication " + complex1.multiplication(complex2));
    System.out.println("Division  " + complex1.division(complex2));
  
  }

}
