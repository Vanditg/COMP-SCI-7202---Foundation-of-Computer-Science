/*
*   Foundations of Computer Science
*   2019, Semester 02
*   Practical-Exam-04
*
*   student (id): a1779153
*   student (name): Vandit Jyotindra Gajjar
*
* Note: your are required to perform small changes, as accessors and mutators;
*
*/

public abstract class Person{
	protected String name;
	protected int age;
	
	Person(){
		this.name = "unnamed";
		this.age = 0;
	}

	/* implement accessors and mutators */

	//Defining accessors here. 
	public String getName() {
		return this.name;
	}
	public int getAge() {
		return this.age;
	}

	//Defining mutators here.
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
