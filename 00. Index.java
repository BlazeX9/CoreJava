Java is an object oriented programming language

Java is compiled into the bytecode and then its interpreted into machine code
[Source code] --Compiled--> [Byte code] --Interpreted--> [Machine code]


class MyClass
{
 public static void main(String[] args)
 {
  System.out.print("Hello world");
 }
}


complie --> javac filename.javac
run --> java className

	
++a (pre-increment) --> Increments the value of a by 1 and returns the new value of a after incrementing
	int a=5;
        int b=++a;  --> a becomes 6 and b becomes 6

a++ (post-increment) --> Increments the value of a by 1 and returns the original value of a before incrementing
        int a=5;
        int b=a++;   --> a becomes 6 and b becomes 5


import java.util.Scanner;  --> To use user input from scanner
import java.lang.Math;	   --> To do mathematical operations
