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

public abstract class PersonAbstract {

    //Instatiating the protected variables for age, name, and address. 
    protected int age;
    protected String name;
    protected String address;

    //Defining abstract method display. 
    public abstract void display();

    //Defining abstract accessors for age, name and address. 
    public abstract int getAge();
    public abstract String getName();
    public abstract String getAddress();

    //Defining abstract mutators for age, name and address. 
    public abstract void setAge(int _age);
    public abstract void setName(String _name);
    public abstract void setAddress(String _address);

}