// IS - A (Inheritance)
// Java Doesn't Have Multiple Inheritance in case of Classes
// Java Has MultiLevel Inheritance in case of classes
// e.g. class GrandFather {}   
//class Father extends GrandFather{}  
// class Son extends Father{}
// Benefits of IS -A
// A) Code Reuse
// b) Polymorphism
class Account  // Parent Class or Base Class
{
	int id;
	String name;
	double balance;
	void withDraw(){
		System.out.println("Account Class WithDraw Call");
	}
	void deposit(){
		System.out.println("Account Class Deposit Call");
	}
	void roi(){
		System.out.println("Account Class ROI CALL 4%");
	}
}
// Child Class
class SavingAccount extends Account{
	// Overriding
	/*
	 * Why Override?
	 * When Some feature is coming from the Parent class and
	 * that feature is outdated for the child class
	 * so child class will override the parent class feature
	 * and build a new feature so parent class feature is hide
	 * 
	 * Overriding is depend on Object Creation
	 */
	@Override
	void withDraw(){
		System.out.println("Saving Account Limit in WithDraw...");
	}
	void convertIntoFD(){
		System.out.println("Now Amount is Locked for 2 Years and ROI is 9%");
	}
}

class CurrentAccount extends Account{
	@Override
	void roi(){
	System.out.println("Current Account ROI is Need to Pay 7%"); 

	}
	
	void odLimit(){
		System.out.println("OD Limit in Current Account");
	}
}
class AccountCaller{
	// Polymorphic function
	void callMe(Account account){
		account.withDraw();
		account.deposit();
		account.roi();
		if(account instanceof SavingAccount){
			((SavingAccount) account).convertIntoFD();
//		SavingAccount sa = (SavingAccount) account; // Downcasting
//		sa.convertIntoFD();
		}
		else
		if(account instanceof CurrentAccount){	
			((CurrentAccount)account).odLimit();
//			CurrentAccount ca = (CurrentAccount) account; // Downcasting
//			ca.odLimit();
		}
		
		System.out.println("**************************");
	}
}
public class ISADemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccountCaller ac = new AccountCaller();
		ac.callMe(new SavingAccount());
		ac.callMe(new CurrentAccount());
//		Account sa = new SavingAccount();  // Upcasting
//		//SavingAccount sa = new SavingAccount();
//		sa.withDraw();
//		sa.deposit();
//		sa.roi();
//		sa.convertIntoFD();
//		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withDraw();
//		ca.deposit();
//		ca.roi();
//		ca.odLimit();
		
		
	}

}
