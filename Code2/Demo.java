/*
IEEE-754 (Floating Point Standard)
*/

strictfp class Demo{
public static void main(String args[]){
// Data Types
// Primitive Data Types or Value Data Type
// Numbers (Without Decimals)
byte age = 21; // 1 Byte - 8 Bit
// 1 Bit is for + -
// 7 Bit , 0,1 Base 2
// -2 ^ 7 to 2 ^ 7 -1
// -128 to 127
short b = 20;  //2 Byte (16 Bit ) 1 Bit + - 15 Bit
// -32768 to 32767
int c = 30;  //4 Byte (32 Bit)
int r = c;
++c;
long d = 40L;  // 8 Byte 64 Bit

// Decimal
float e = 10.20f;  //4 byte
double f = 10.243322;  // 8 Byte

// boolean
boolean isPresent = true;  // true - 1 , 0 false (1 Byte , 2 Byte , 4 Byte)

// char 
char t = 'A';  // 2 Byte (UNICODE)

// Reference Data Types (Class)
// String is a class and it is also treated as a Data Type
// String is a collection of chars
// String is internally a char array
// String class has predefine methods like length() , uppercase(), lowercase() etc.
// How Many Ways to Create String Object
// a) String Literal 
// b) String new Object way
// Who Check the Object is Present in a Pool or Not - Ans is intern()
// Optional to Write , Because Compiler Add this Automatically
String name = "amit".intern();  // 1 or 0
String name2 = "amit";  // this is called String Literal
String name3= new String("AMIT");  // 2 or 1  // String Object Creation
//String name2 = name;
if(name==name3){
System.out.println("Same Ref ");
}
else{
System.out.println("Not Same Ref ");
}
//if(name.equals(name3)){
if(name.equalsIgnoreCase(name3)){
System.out.println("Same Value");
}
else
{
System.out.println("Not Same Value ");
}
// name is a String type and it hold the reference of amit String
//System.out.println("Hello Java ");
}
}