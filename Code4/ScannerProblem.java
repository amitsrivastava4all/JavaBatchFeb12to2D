import java.util.Scanner;

public class ScannerProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the Id");
		int id = scanner.nextInt();
		System.out.println("Enter the Salary");
		double salary = scanner.nextDouble();
		System.out.println("Enter the Name");
		scanner.nextLine(); // eat the \n coming from the nextDouble()
		String name = scanner.nextLine(); // take till \n
		//String name = scanner.next();  //  it can't take after space
		System.out.println("Name "+name);
		System.out.println("Id "+id);
		System.out.println("Salary "+salary);
		scanner.close(); // it will close the buffer as well as System.in
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the VoterId");
		int vid = s.nextInt();
		System.out.println("VoterId "+vid);
		s.close();
		
	}

}
