//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

public class Sort {
	public Student[] sort(Student[] array){
		// Total number of elements. 
		int n = array.length;
		boolean hasChanged = false;
		
		do {

			hasChanged = false;
			for(int i = 0; i < (n - 1); i++) {
				int j = i + 1;
				boolean condition = array[i].getAverage() < array[j].getAverage();
				if (array[i].getAverage() == array[j].getAverage()) {
					condition = array[i].getPhysics() < array[j].getPhysics();
					
					if (array[i].getPhysics() == array[j].getPhysics()) {
						condition = array[i].getPhysics() < array[j].getPhysics();
						
						if (condition = array[i].getPhysics() == array[j].getPhysics()) {
							condition = array[i].getChemistry() < array[j].getChemistry();
							
							if (condition = array[i].getChemistry() == array[j].getChemistry()) {
								condition = array[i].getMath() < array[j].getMath();
							
							}
						}
					}
				}
				
				if(condition) {
					
					this.swapElements(array, i, j);
					hasChanged = true;
				
				}
			}
		} 

		while(hasChanged);
		
		return array;
	}

	public Student [] swapElements(Student [] array, int i, int j) {
		
		Student tmp = array[j];
		array[j] = array[i];
		array[i] = tmp;
		return array;
	
	}

}
