1. Simple Inheritance [Parent] --> [Child]
------------------------------------------
import java.util.Scanner;
class MyClass
{
	public static void main(String[] args)
	{
	 classChild obj=new classChild();
	 obj.input();
	 obj.show();
	}
}

class classParent
{
	String n,c;
	int r;
	void input()
	{
	 Scanner MyScn1=new Scanner(System.in);
	 System.out.print("Enter name ");
	 n=MyScn1.nextLine();
	 System.out.print("Enter course ");
	 c=MyScn1.nextLine();
	
	 Scanner MyScn2=new Scanner(System.in);
	 System.out.print("Enter roll ");
	 r=MyScn2.nextInt();
	}
}
class classChild extends classParent
{
	void show()
	{
	 System.out.print("User "+n+" has selected course "+c+" and his roll number is "+r);
	}
}

2. Multilevel Inheritance [GrandParent] --> [Parent] --> [Child]
----------------------------------------------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 classChild obj=new classChild();
	 obj.value(5);
	 obj.newvalue();
	 obj.show();
	}
}

class grandClass
{
	int x;
	void value(int a)
	{
	 x=a;
	}
}
class parentClass extends grandClass
{
	int y;
	void newvalue()
	{
	 y=x+5;
	}
}
class classChild extends parentClass
{
	void show()
	{
	 System.out.print("Result "+y);
	}
}

3. Hierarchical Inheritance [Parent] --> [Child 1] + [Parent] --> [Child 2]
---------------------------------------------------------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 classChildOne obj1=new classChildOne();
	 obj1.value();
	 obj1.newvalue(3);
	 obj1.show();
		
	 classChildTwo obj2=new classChildTwo();
	 obj2.value();
	 obj2.newvalue(7);
	 obj2.show();
	}
}

class parentClass
{
	int y;
	void value()
	{
	 y=10;
	}
}
class classChildOne extends parentClass
{
	int x;
	void newvalue(int a)
	{
	 x=a+y;
	}
	void show()
	{
	 System.out.println("Updated Child Class Value "+x);
	}
}
class classChildTwo extends parentClass
{
	int x;
	void newvalue(int a)
	{
	 x=a+y;
	}
	void show()
	{
	 System.out.println("Updated Child Class Value "+x);
	}
}
