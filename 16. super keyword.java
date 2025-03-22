1. super keyword in variable
----------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 ChildClass obj=new ChildClass();
	 obj.show1();
	 obj.show2();
	 obj.show3();
	}
}

class GrandClass
{
	int a=100;
	void show1()
	{
	 System.out.println("Grand Parent class output "+a);
	}
}
class ParentClass extends GrandClass
{
	int a=70;
	void show2()
	{
	 System.out.println("Parent class output "+a+" "+super.a);
	}
}
class ChildClass extends ParentClass
{
	int a=50;
	void show3()
	{
	 System.out.println("Child class output "+a+" "+super.a);
	}
}

2. super keyword in method
--------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 ClassC obj=new ClassC();
     obj.show();
	}
}

class ClassP
{
	void show()
	{
	 System.out.println("Hello");
	}
}
class ClassC extends ClassP
{
	void show()
	{
	 super.show();
	 System.out.println("World");
	}
}

3. super keyword in constructor
-------------------------------
class MyClass
{
	public static void main(String[] args)
	{
	 ClassX obj1=new ClassX();
	 ClassX obj2=new ClassX(10);
	}
}

class ClassY
{
	ClassY()
	{
	 System.out.println("ClassY");		//[Note: parent class non parametazied constructor is called by default]
	}
	ClassY(int a)
	{
	 System.out.println("ClassYY "+a);
	}
}
class ClassX extends ClassY
{
	ClassX()
	{
	 System.out.println("ClassX");		
	}
	ClassX(int a)
	{
	 super(30);
	 System.out.println("ClassXX "+a);
	}
}
