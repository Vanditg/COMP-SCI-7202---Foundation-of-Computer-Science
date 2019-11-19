//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        try {
           
            Student[] student = readData("students.txt");
            // student = Student.sortStudents(student);
            Student.printStudents(student);
       
        }
        
        catch(Exception e) {
            
            System.out.println(e);
        
        }
    }  

    // Defining method for reading data from .txt file. 
    public static Student[] readData(String fileName) throws IOException { 
        
        int count = 0;
        String file = fileName;
        List<String[]> content = new ArrayList<>();
        Student[] dummy = new Student[10];
        
        try(BufferedReader br = new BufferedReader (new FileReader(file))) {
            
            String line = "";
            while ((line = br.readLine()) != null) {
                
                content.add(line.split(" "));
            
            }
            
            Student[] student = new Student[content.size()];
           
            for (int i = 0; i< content.size(); i++ ) {
                
                String[] temp = content.get(i);
                student[i] = new Student( i+1 , temp[0], Integer.parseInt(temp[1]), Integer.parseInt(temp[2]), Integer.parseInt(temp[3]));
            
            }
            
            return student;
        
        } 
        
        catch (FileNotFoundException e) {
            
            System.out.println(e);
        
        }
        
        return dummy;
   
    }
}
