// OOPS
// OOAD - Object Oriented Analysis and Design
// S O L I D
// S - SRP - Single Responsiblity Principle
// this class contains only Employee class related logic
// D - DRY - Don't Repeat YourSelf

// Class - Contains Member Variables + Member Methods
// Encapsulation = Binding Member Variables with member methods
// The Example of Encapsulation is class.
// Data Hiding
// Data Hiding (private variables) + public methods
// are become gud encapsulation
public class Employee {
	private int id;  // Instance Variable
	private String name;
	private double salary;
	
	// public is not global , Java doesn't support any global decleration 
	// public is a keyword and it is for access
	// public access means now the things are
	// avaliable outside the package (folder)
	// i , n , s - Local Variable
	public void takeInput(int id , String name, double salary){
		// When Local Variable name is same as Instance Variable name
		// u need to differentate by using this keyword
		if(id>0 && salary>0){
		this.id = id;  // Instance Variable = Local Variable
		this.name = name;
		this.salary = salary;
		}
		else
		{
			System.out.println("Invalid Id or Salary");
		}
	}
	
	public void print(){
		// this - it is a keyword , which hold the current reference
		// ram.print() ; ram reference is get copy in this (keyword)
		System.out.println(this.id);
		System.out.println(name);  // Internally compiler will inject this.name
		System.out.println(salary);
	}
	
}
