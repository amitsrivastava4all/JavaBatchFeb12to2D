// this class only contain execution logic
public class TestEmployee {

	public static void main(String[] args) {
		int x =10;
		Employee ram  = new Employee() ;
		// when object is created , it is treated as instance
		// and it allocate the memory for instance variables
		//ram.id = -1001;
		//ram.name="Ram";
		//ram.salary = -9999;
		ram.takeInput(-1001, "Ram", -9999);
		ram.print();
//		System.out.println("Showing Default Values");
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		
		
//		ram.id = 1001;
//		ram.name = "Ram";
//		ram.salary = 9999;
		//ram.print();
//		System.out.println("After Changes...");
//		System.out.println(ram.id);
//		System.out.println(ram.name);
//		System.out.println(ram.salary);
		
		Employee shyam = new Employee();
		shyam.takeInput(1002, "Shyam", 2222);
//		shyam.id = 1002;
//		shyam.name = "Shyam";
//		shyam.salary = 9009;
		shyam.print();
//		System.out.println("Id "+shyam.id);
//		System.out.println("Name "+shyam.name);
//		System.out.println("Salary "+shyam.salary);
//		

	}

}
