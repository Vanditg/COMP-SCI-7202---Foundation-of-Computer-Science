//==================================
// Foundations of Computer Science
// Student: Vandit Jyotindra Gajjar
// Student ID: a1779153
// Semester: 2
// Year: 2019
// Practical Number: 5 Part - I
//===================================

public class Student {

	// Defining private variables. 
	private String name;
	private int id;
	private int physics;
	private int chemistry;
	private int math;
	private float average;

	// Default constructor.
	public Student() {

	}

	// Parametric constructor.
	public Student(int id, String name, int physics, int chemistry, int math) {
		this.id = id;
		this.name = name;
		this.physics = physics;
		this.chemistry = chemistry;
		this.math = math;
		this.average = (float)((math + chemistry + physics)/3);
	}

	// Void method to print students details. 
	public static void printStudents(Student[] students){
		
		students = sortStudents(students);
		String[] row1 = {"id", "name", "Average Score", "Physics", "Chemistry", "Math" };
		System.out.printf("%-15s %-15s %-15s %-15s %-15s %-15s \n",row1[0], row1[1], row1[2], row1[3], row1[4], row1[5]);
		
		for (int i = 0; i < students.length; i++) {

			System.out.printf("%-15d %-15s %-15f %-15d %-15d %-15d \n",students[i].getId(), students[i].getName(), students[i].getAverage(), students[i].getPhysics(), students[i].getChemistry(), students[i].getMath());
		
		}
	}

	// Creating a method for sorting students.
	public static Student[] sortStudents(Student[] students) {
		
		Sort sorting = new Sort(); 
		return sorting.sort(students);
	
	}

	public int getId() {
		return this.id;
	}
	public String getName() {
		return this.name;
	}
	public int getPhysics() {
		return this.physics;
	}
	public int getChemistry() {
		return this.chemistry;
	}
	public int getMath() {
		return this.math;
	}
	public float getAverage() {
		return this.average;
	}

}
