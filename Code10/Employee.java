
public class Employee {
	private int id;
	private String name;
	private double salary;
	private String companyName;
	
	Employee(){
		companyName = "TCS";
		
	}
	
	Employee(int id , String name, double salary){
		this();
		this.id = id ;
		this.name = name;
		this.salary = salary;
	}
	
	private double hra(){
		return salary * 0.30;
	}
	
	private double da(){
		return salary * 0.20;
	}
	
	private double ta(){
		return salary * 0.10;
	}
	
	private double pf(){
		return salary * 0.05;
	}
	
	private double gs(){
		return salary + hra() + da() + ta() ;
	}
	
	private double ns(){
		return gs() - pf();
	}
	
	private String grade(){
		double netSalary = ns();
		if(netSalary>=50000){
			return "Team Lead";
		}
		else
		if(netSalary<50000 && netSalary>=30000){
			return "SSE";
		}
		else
		if(netSalary<30000 && netSalary>=20000){
			return "SE";
		}
		else
		{	
			return "Trainee";
		}
	}
	
	public void printSalaryReport(){
		System.out.println("Salary REPORT "+companyName);
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Salary "+salary);
		System.out.println("HRA "+hra());
		System.out.println("DA "+da());
		System.out.println("TA "+ta());
		System.out.println("PF "+pf());
		System.out.println("Gross Salary "+gs());
		System.out.println("Net Salary "+ns());
		System.out.println("Grade "+grade());
		
	}
}
