1. Variable
-----------

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

2. Method
---------
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

3. Constructor
--------------
#Example 1
	
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj=new NewClass(25);
	}
}

class NewClass
{
	NewClass(int a)
	{
	 this();
	 System.out.println("Value "+a);
	}
	NewClass()
	{
	 System.out.println("Red");
	}
}

#Example 2
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj=new NewClass();
	}
}

class NewClass
{
	NewClass()
	{
	 this(30);
	 System.out.println("Red");
	}
	NewClass(int a)
	{
	 System.out.println("Value "+a);
	}
}
