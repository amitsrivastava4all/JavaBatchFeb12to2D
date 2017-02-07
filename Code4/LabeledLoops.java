
public class LabeledLoops {

	public static void main(String[] args) {
		// break , continue
		myloop:
		for(int x = 1; x<=3; x++){
			for(int y = 1; y<=3; y++){
				if(x==y){
					continue myloop;
					//break myloop;
					//continue ; // skip from the current loop
					//break; // exit from the current loop
				}
				System.out.println("X is "+x+" and Y is "+y);
			}
		}
		
		System.out.println("Outside the Loop....");
		
		int k = 1;
		int p = k++;
		System.out.println(p);
		p= ++k;
		System.out.println(p);
		for(int i = 1; i<=10; ++i){
			System.out.println("i is "+i);
		}
		
		int j = 1;
		while(j<=10){
			if(j==5){
				j+=2;
			}
			else
			{
				j++;
			}
			System.out.println("J is "+j);
		}

	}

}
