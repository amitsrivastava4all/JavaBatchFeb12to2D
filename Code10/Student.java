
public class Student {
	private int id;
	private String name;
	private int[] marks;
	private String collegeName;
	
	Student(){
		// this is default Constructor
		collegeName = "SRCC";
	}
	Student(int id , String name ,int []marks){
		this();
		if(id>0 ){
		this.id = id;
		this.name = name;
		this.marks = marks;
		}
		else
		{
			System.out.println("Invalid ID");
		}
		}
	
	private int totalMarks(){
		int total = 0;
		for(int mark: marks){
			total +=mark;
		}
		return total;
		
	}
	
	private int percentage(){
		return this.totalMarks()/marks.length;
	}
	
	private String grade(){
		int per = percentage();
		return per>=90?"A Grade ":"B Grade";
		
	}
	
	public void printReportCard(){
		System.out.println("********** Student Report Card *******");
		System.out.println("College "+collegeName);
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Marks ");
		for(int mark : marks){
			System.out.println(mark);
		}
		System.out.println("Total Marks "+totalMarks());
		System.out.println("Percentage "+percentage());
		System.out.println("Grade "+grade());
	}
	
	

}
