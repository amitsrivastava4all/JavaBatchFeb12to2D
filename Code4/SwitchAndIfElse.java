import java.util.Scanner;

public class SwitchAndIfElse {

	public static void main(String[] args) {
		boolean b = false;
		if(b=true){
			System.out.println("I am in If"); 
			
		}
		else
		{
			System.out.println("I am in else");
		}
		// TODO Auto-generated method stub
		// Switch Case Equality Compare
		// Scanner - Predefine Class
		// System.in - to take Input
		//System.in and it read the data in form of bytes
		Scanner s = new Scanner("Hello how are you");
		while(s.hasNext()){
			System.out.println(s.next()); 
			// give current value and move to next
		}
		Scanner scanner =new Scanner(System.in);
		System.out.println("Res System");
		System.out.println("1. Burger ");
		System.out.println("2. Pizza");
		System.out.println("3. Soft Drink");
		System.out.println("4. Exit");
		int choice = scanner.nextInt();
		switch(choice){
		case 1:
			System.out.println("Burger Price is 100 Rs");
		case 2:
			System.out.println("Pizza Price is 300 Rs");
		case 3:
			System.out.println("Soft Drink Price is 50 Rs");
		case 4:
			System.out.println("Thanks for Coming...");
			break;
		default:
			System.out.println("Invalid Option...");
		}
		scanner.close();

	}

}
