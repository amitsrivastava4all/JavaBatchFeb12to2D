
public class Student {
	private int id; // Instance Members 
	private String name;
	private int marks[] = new int[3];
	private String collegeName;
	private boolean awards;
	private String email;
	private String phone;
	private String currentAddress;
	private String permAddress;
	
	/*
	 * Every class has default constructor by default
	 * if u create any constructor , so the by default constructor
	 * is kill
	 * 
	 * Constructor is call when object is created
	 * Constructor role is to initalize the instance variables
	 * Class name and constructor name is same
	 * Constructor doesn't have return type
	 * Constructor is used to initalize the Primary fields
	 */
	public Student(){
		collegeName = "SRCC";
		//System.out.println(" I am A Default constructor");
	}
	// this is Param Constructor
	// this is an example of Constructor overloading..
	// Java 1.5 Introduce var args
	public Student(int id , String name, int ...marks){
		// Constructor chaning
		 // it must be on first line
		this();  // Calling one Constructor from another constructor
		this.id = id + collegeName.length();  // Instance Variables = local variable
		this.name = name;
		this.marks = marks;
	}
	public  void Student(){
		System.out.println(" I am a Method...");
	}
	
	public void print(){
		System.out.println("Id "+id+" Name"+name+" Marks");
		for(int mark: marks){
			System.out.print(mark+",");
		}
		System.out.print(" CollegeName "+collegeName);
	}
	
	
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public boolean isAwards() {
		return awards;
	}
	public void setAwards(boolean awards) {
		this.awards = awards;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}
	public String getPermAddress() {
		return permAddress;
	}
	public void setPermAddress(String permAddress) {
		this.permAddress = permAddress;
	}
	
	
	// setter and getter
	
	
	

}
