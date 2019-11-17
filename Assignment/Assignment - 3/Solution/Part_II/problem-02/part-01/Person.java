/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/


public class Person {
	//List of private attributes.
	private String givenName;
	private String lastName;
	private int age;
	private String gender;
	private String citizenship;

	//Deafualt constructor.
	Person(){
		this.givenName = "Vandit";
		this.lastName = "Gajjar";
		this.age = 23;
		this.gender = "Male";
		this.citizenship = "Indian"; 
	}

	//Parametric Constructor
	Person(String f_name, String l_name, int age, String gender, String citizenship) {
		this.givenName = f_name;
		this.lastName = l_name;
		this.age = age;
		this.gender = gender;
		this.citizenship = citizenship;
	}

	//Creating accessors for firstname, lastname, age, gender, and citizenship.
	public String getName() {
		return this.givenName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}
 	 
	public String getGender() {
		return this.gender;
	}

	public String getCitizenship() {
		return this.citizenship;
	}
	
	//Creating mutators for the name using array for first and last name, age, gender, and citizenship.
	public void setName(String name) {
		String [] split = name.split(" ");
		this.givenName = split[0];
		this.lastName = split[1];
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setCitizenship() {
		this.citizenship = citizenship;
	}
}
