/*
 * let take an array of 5 elements
 * and do the sum of those values which contain the digit no 4
 */
public class Example {

	public static void main(String[] args) {
		String fruit = "apple";
		System.out.println(fruit.length());
		fruit = "orange";
		System.out.println(fruit.length());
		String fruits[]={"apple","orange"};
		// TODO Auto-generated method stub
		//int arr[] = {400,890,450,120,724};
		//int [] arr = {400,890,450,120,724};
		//int []arr = new int[5];
//		for(int i = 0; i<arr.length; i++){
//			System.out.println(arr[i]);
//		}
		//arr[0]= 400; arr[1]= 890; arr[2]=450; arr[3]=120; arr[4]=724;
		int sum = 0;
		int arr[]= new int[]{400,890,450,120,724};
		for(int value : arr){ // Enhance For Loop (Java 1.5)
		//for(int i = 0; i<arr.length; i++){
			int number = value;
			//int number = arr[i];
			while(number!=0){
				int reminder = number % 10;
				if(reminder == 4){
					sum = sum + value;
					//sum = sum + arr[i];
				}
				number = number/10;
			}
		}
		System.out.println("Sum is "+sum);
		
	}

}
