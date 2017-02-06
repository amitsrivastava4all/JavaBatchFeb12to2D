
public class ArrayDemo {

	public static void main(String[] args) {
		int [][] x = new int[3][4];
		//int y[][] = {{10,20,30,40,50},{90,10}};
		int y[][] = new int [3][];
		y[0] = new int[10];
		y[1] = new int [20];
		y[2] =new int[30];
		y[1][10]=1;
		for(int i = 0; i<y.length; i++){
			for(int j = 0 ; j<y[i].length; j++){
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************************");
		for(int i[]:y){
			for(int j : i){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		int p[] = {10,20,30};
		for(int l : p){
			System.out.println(l);
		}

	}

}
