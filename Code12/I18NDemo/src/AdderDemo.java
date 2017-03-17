import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class AdderDemo {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);	
		// Locale is For Language and Country
		Locale locale  = null;
		System.out.println("Press 1 for English");
		System.out.println("हिंदी के लिए 2 दबाएं");
		int choice = scanner.nextInt();
		if(choice == 1){
			 locale = new Locale("en","US");
		}
		else
		if(choice == 2)	{
			locale  = new Locale("hi","IN");
		}
		
		// Singleton (Which create only one object)
		// ResourceBundle class is used to read properties (Key and Value) 
		// from .Properties file
		
		ResourceBundle rb  = ResourceBundle.getBundle("messages",locale);
		System.out.println(rb.getString("firstnomsg"));
		double firstNo = scanner.nextDouble();
		System.out.println(rb.getString("secondnomsg"));
		double secondNo = scanner.nextDouble();
		double sum = firstNo + secondNo;
		NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
		String formattedSum = nf.format(sum);
		System.out.println(rb.getString("result")+" "+formattedSum);
		Date date = new Date(); // Get the Current Date
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
		String formattedDate = df.format(date);
		System.out.println("Date is "+formattedDate);
		scanner.close();

	}

}
