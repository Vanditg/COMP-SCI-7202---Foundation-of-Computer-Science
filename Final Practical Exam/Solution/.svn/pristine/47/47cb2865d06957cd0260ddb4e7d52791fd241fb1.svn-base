//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// id: a1779153
// Semester: 2
// Year: 2019
// Practical Exam Number: Final practical exam
//===================================
import java.lang.*;

public class DataStructure implements Structurable {

	//Overriding the method sort which implements the Sort algorithm and throws exception for a given case. 
	@Override 
	public int [] sort(int [] array) {
		
		if (array.length==0) {
			//Throwing exception if no elements present.
    			throw new UnsupportedOperationException("No elements.");
    		}
		
		else {
			for (int index = 1; index < array.length; index++) {
                		int current = array[index];
                		int j = index - 1;
                		while (j >= 0 && current < array[j]) {
                    			array[j + 1] = array[j];
                    			j--;
                		}
                		array[j + 1] = current;
            		}
            		return array;
		}
	}
	
	//Overriding the method search which implements the search algorithm and throws exception for a given case. 
	@Override 
	public int search(String [] array, String value) {
		if (array.length == 0) {
			//Throwing exception if no elements present.
			throw new UnsupportedOperationException("No elements.");
		}
		else {
			for (int index = 0; index < array.length; index++) {
                		if (array[index] == value) {
                    			return index;
                		}
            		}
            		return -99;
		}
	}
}
