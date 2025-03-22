A constructor is a special method that is used to initialize objects. 
In constructor we create a function under the class, which name is same as class name without need of declaring any return type.

Default Constructor
-------------------
import java.util.Scanner;
class MyClass
{
	public static void main(String[] args)
	{
	 addition obj = new addition();
	 obj.add();
	 obj.show();
	}
}

class addition
{
	int a,b,c;
	addition()
	{
	 Scanner MyScn=new Scanner(System.in);
	 System.out.print("Enter number one: ");
	 a=MyScn.nextInt();
	 System.out.print("Enter number two: ");
	 b=MyScn.nextInt();
	}	
	void add()
	{
	 c=a+b;
	}	
	void show()
	{
	 System.out.println("Sum is: "+c);
	}
}

Parameterized Constructor
-------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 Time objone=new Time(10,20,30);
	 Time objtow=new Time(30,40,60);
	 Time objthree=new Time();
	 objthree=objone.add(objtow);
	 System.out.println("Hour Minute Second");
	 objone.show();
	 objtow.show();
	 objthree.show();
	}
}

class Time
{
	int x,y,z;
	Time(int a,int b,int c)
	{
	 x=a,y=b,z=c;
	}
	Time()
	{
	 x=0,y=0,z=0;
	}
	Time add(Time s)
	{
	 Time obj=new Time();
	 obj.z=(z+s.z)%60;
	 obj.y=((y+s.y)+((z+s.z)/60))%60;
	 obj.x=(x+s.x)+((y+s.y)/60);
	 return obj;
	}
	void show()
	{
	 System.out.println(x+" "+y+" "+z);
	}
}

Copy Constructor
----------------
class MyClass
{
	public static void main(String[] args)
	{
	 ClassA obj=new ClassA(10);
	 obj.show();
	 ClassA ob1=new ClassA(obj);
	 ob1.show();
	}
}

class ClassA
{
 	int x;
	ClassA(int a)
	{
	 x=a;
	}
	ClassA(ClassA a)
	{
	 x=a.x;
	}
	void show()
	{
	 System.out.println("Res: "+x);
	}
}
