 class SecondDemo
{
public static int main(int x){
return x + 20;
}
public static void main(){

System.out.println("this is my main");
}
// public - it will provide the access from outside the folder(package)
// static - It will be load when class is loaded in the memory
// class is loaded once so main is loaded once
// void - no return type , main is entry point and exit point
// String - It is a predefine class in Java
// String - It is a collection of Chars
// String Internally is a char array
// args - it is just a variable name
// [] - it is an array
// String args[] - is called command line arguments
static public void main(String ...arr){
int a =Integer.parseInt(arr[0]); // convert string into int
int b =Integer.parseInt(arr[1]);
int c = a + b;
System.out.println("A is "+a+"\nB is "+b+"\nSum is "+c);
System.out.println("Sum of Two Numbers is  "+c);
main();
if(10>2)
{
System.out.println("I am Going to return "+main(10));
return ;
}
else
{
System.out.println("I am Not Return ");
}
System.out.println("I Will not execute ");
// System - It is a predefine class in Java
// out - out is an object of PrintStream class
// println- it a print new line method , and it is a member of 
// PrintStream class
// PrintStream - 
// Stream (Pipe) - Flow of Data
// InStream - Read 
// OutStream - Write
// System class is bind PrintStream (Pipe) with Channel (Console)
} // main ends
}  // class ends