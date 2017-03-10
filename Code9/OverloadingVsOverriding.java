import java.util.LinkedList;



class Calc
{
	// overloading is not depend on return type
	public int add(int x, int y){
		return x + y;
	}
	// No of Arguments Differ
	public int add(int x, int y , int z ){
		return x+ y + z;
	}
	// Type of Arguments Differ
	public double add(double x , double y ){
		return x + y;
	}
	// Order of Arguments Differ
	public double add(int x, double y){
		return x + y;
	}
	
	public double add(double x , int y){
		return x + y;
	}
}

class VarArgsExample
{
	// ...x this is var args
	int sum(int ...x){
		int total = 0;
		for(int num : x){
			total = total + num;
		}
		return total;
	}
}

class TypePromotion
{
	void show(long ...x){
		System.out.println("long var args call");
	}
	void show(int  ...x){
		System.out.println("int Var args Call");
	}
	void show(Integer ww){
		System.out.println("Integer Wrapper Call");
	}
	void show(short x){
		System.out.println("this is short show");
	}
	void show(double x){
		System.out.println("this is double show");
	}
	void show(long x){
		System.out.println("this is long show");
	}
	void show(byte x){
		System.out.println("this is byte show");
	}
	void show(int x){
		System.out.println("this is int show");
	}
}
class OverloadingWithParentChildArguments
{
	void print(Object o){
		System.out.println("Object ....");
	}
	void print(String w){
		System.out.println("String...");
	}
//	void print(Integer w){
//		System.out.println("Integer....");
//	}
}
public class OverloadingVsOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = 100;
		Integer gg = new Integer(g);  // Boxing
		Integer vv = new Integer(200);
		// this will create a double linked list
		// this will store only Integer objects
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		linkedList.add(gg);
		linkedList.add(vv);
		// UnBoxing
		int result = linkedList.get(0).intValue() + linkedList.get(1).intValue();
		Integer ttt = 200;  // Boxing
		int pp = ttt; // Unboxing
		ttt++;  // AutoBoxing (Java 1.5)
		linkedList.add(g);
		linkedList.add(200);
		int sum = 0;
		for(Integer i : linkedList){
			sum = sum + i;
		}
		System.out.println("LinkedList Sum is "+sum);
		
		// Wrapper 
		int a = 100; // Primitive Type
		Integer b = 100;  // Wrapper Type
		byte ee = 10;
		Byte ww = 10;
		
		TypePromotion tp = new TypePromotion();
		//tp.show(1);
		tp.show(1);
		System.out.println("************* VAR ARGS EXAMPLE *******");
		VarArgsExample ve = new VarArgsExample();  // Java 1.5
		System.out.println(ve.sum());
		System.out.println(ve.sum(100));
		System.out.println(ve.sum(100,200));
		System.out.println(ve.sum(100,200,300));
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
		OverloadingWithParentChildArguments oa = new OverloadingWithParentChildArguments();
		//oa.print(10);
		//oa.print("Hello");
		oa.print(null);
		
		Integer t1 = 128;
		Integer t2 = 128;
		if(t1 == t2){
			System.out.println("Same Ref");
		}
		else
		{
			System.out.println("Not Same Ref");
		}
	}

}
