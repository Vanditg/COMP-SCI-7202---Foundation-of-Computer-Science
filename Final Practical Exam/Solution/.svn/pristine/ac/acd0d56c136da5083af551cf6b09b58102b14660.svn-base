/*==================================
Foundations of Computer Science
Student: Vandit Jyotindra Gajjar
id: a1779153
Semester: 2
Year: 2019
Practical Exam Number: Final Practical Exam
===================================*/

import java.lang.*; 
import java.util.*;

//Defining person class that extends personabstract. 
public class Person extends PersonAbstract {

    //Default constructor. 
    public Person() {
        this.name = "unknown";
        this.age = -99;
        this.address = "None";
    }

    //Parametric constructor. 
    public Person(int _age, String _name, String _address) {
        this.name = _name;
        this.age = _age;
        this.address = _address;

    }

    //Overriding the method display. 
    @Override
    public void display() {
        System.out.println("name:" + this.name + "," + " age: " + this.age + "," + " address: " + this.address +";");
    }

    //Overriding the accessor from abstract class - getAge.
    @Override
    public int getAge() {
        return this.age;
    }

    //Overriding the accessor from abstract class - getName.
    @Override
    public String getName() {
        return this.name;
    }
    
    //Overriding the accessor from abstract class - getAddress.
    @Override
    public String getAddress() {
        return this.address;
    }

    //Overriding the mutator from abstract class - setAge.
    @Override
    public void setAge(int _age) {
        this.age = _age;
    }

    //Overriding the mutator from abstract class - setName.
    @Override
    public void setName(String _name) {
        this.name = _name;
    }

    //Overriding the mutator from abstract class - setAddress.
    @Override
    public void setAddress(String _address) {
        this.address = _address;
    }

}
