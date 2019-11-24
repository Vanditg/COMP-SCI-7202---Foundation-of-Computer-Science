/*==================================
Foundations of Computer Science
Student: Vandit Jyotindra Gajjar
id: a1779153
Semester: 2
Year: 2019
Practical Exam Number: 5
===================================*/

public class Student {

	//Defining private variables.
	private String name;
	private int age;
	private int period;

	//Default constructor - setting given values.
	Student() {
		this.name = "unknown";
		this.age = 0;
		this.period = 0;
	}

	//Parametric constructor - tmpName, tmpAge, tmpPeriod
	Student(String tmpName, int tmpAge, int tmpPeriod) {
		this.name = tmpName;
		this.age = tmpAge;
		this.period = tmpPeriod;
	}

	//Defining accessors - getName, getAge, getPeriod.
	public String getName(){
		return this.name;
	}

	public int getAge(){
		return this.age;
	}

	public int getPeriod(){
		return this.period;
	}

	//Defining mutators - setName, setAge, setPeriod.
	public void setName(String tmpName) {
		this.name = tmpName;
	}

	public void setAge(int tmpAge) {
		this.age = tmpAge;
	}

	public void setPeriod(int tmpPeriod) {
		this.period = tmpPeriod;
	}
} 