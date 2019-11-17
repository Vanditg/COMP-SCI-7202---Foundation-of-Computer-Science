/*
*
* Foundations of Computer Science
* Semester 02 Year 2019
* id: a1779153 
* name: Vandit Jyotindra Gajjar 
*
*/

public class PhysicalBook extends Book {

	//List of private attributes.
	private int shelf;
	private int aisle;
	private int floor;

	//Default constructor
	PhysicalBook() {

		//Calling the base constructor.
		super();
		this.shelf = 0;
		this.aisle = 0;
		this.floor = 0;
	}

	//Parametric Constructor
	PhysicalBook(String title, int year, String publish, int pages,int shelf, int aisle, int floor) {
		
		//Calling the base constructor.
		super(title, year, publish, pages); 
		this.shelf = shelf;
		this.aisle = aisle;
		this.floor = floor;
		
	}

	//Ddefining Method for Book Location.
	public void displayBookLocation() {
		System.out.println("The book is on " + this.floor + " floor, " + this.aisle + " aisle " + this.shelf + " shelf.");
	}

	//Creating accessors for Shelf, Aisle, and Floor.  
	public int getShelf() {
		return this.shelf;
	}
	public int getAisle() {
		return this.aisle;
	}
	public int getFloor() {
		return this.floor;
	}

	//Creating mutators for Shelf, Aisle, and Floor.  
	public void setShelf(int shelf) {
		this.shelf = shelf;
	}
	public void setAisle(int aisle) {
		this.aisle = aisle;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
}
