Note: this keyword is used to assign the value of a local variable to a global variable when both have the same name. It is also used to call other functions from another function or from a constructor.

1. this keyword in Variable
---------------------------
import java.util.Scanner;
class MyClass
{
	public static void main(String[] args)
	{
	 Scanner MyScanner1=new Scanner(System.in);
	 Student obj=new Student();
	 System.out.print("Enter roll: ");
	 int r=MyScanner1.nextInt();
	 
	 Scanner MyScanner2=new Scanner(System.in);
	 System.out.print("Enter name: ");
	 String n=MyScanner2.nextLine();
	 System.out.print("Enter class: ");
	 String c=MyScanner2.nextLine();
		
	 obj.input(n,r,c);
	 obj.marks(50,80,90);
	 obj.show();
	}
}

class Student
{
	String n,s;
	int r,m1,m2,m3,total;
	float avg;
	void input(String n,int r,String s)
	{
	 this.n=n;
	 this.r=r;
	 this.s=s;
	}
	void marks(int m1,int m2,int m3)
	{
	 this.m1=m1;
	 this.m2=m2;
	 this.m3=m3;
	 total=m1+m2+m3;
	 avg=(float)total/3;
	}
	void show()
	{
	 System.out.println(n+" roll "+r+" is in subject "+s+" total marks is: "+total+ " average marks is: "+avg);
	}
}

2. this keyword in Method
-------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj=new NewClass();
	 obj.MyShow1();
	}
}

class NewClass
{
	void MyShow1()
	{
	 System.out.println("Hello");
	 this.MyShow2();
	}
	void MyShow2()
	{
	 System.out.println("World");
	}
}

3. this keyword in Constructor
------------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass1 obj1=new NewClass1(25);
	 NewClass2 obj2=new NewClass2();
	}
}

class NewClass1
{
	NewClass1(int a)
	{
	 this();
	 System.out.println("Value "+a);
	}
	NewClass1()
	{
	 System.out.println("Red");
	}
}

class NewClass2
{
	NewClass2()
	{
	 this(50);
	 System.out.println("Green");
	}
	NewClass2(int a)
	{
	 System.out.println("Value "+a);
	}
}
