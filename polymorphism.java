//Complie time polymorphism - Function overloading
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj=new NewClass();
	 obj.calculate(10);
	 obj.calculate(10,20);
	 obj.calculate(10,3.1415f);
	}
}

class NewClass
{
	void calculate(int a)
	{
	 int area=a*a;
	 System.out.println("Area of square "+area);
	}
	void calculate(int a,int b)
	{
	 int area=a*b;
	 System.out.println("Area of rectange "+area);
	}
	void calculate(int a,float b)
	{
	 float area=a*a*b;
	 System.out.println("Area of circle "+area);
	}
}

//Complie time polymorphism - Constructor overloading
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj2=new NewClass(10);
	 NewClass obj1=new NewClass(10,20);
	 NewClass obj3=new NewClass(10,3.1415f);
	}
}

class NewClass
{
	NewClass(int a,int b)
	{
	 int area=a*b;
	 System.out.println("Area of rectange "+area);
	}
	NewClass(int a)
	{
	 int area=a*a;
	 System.out.println("Area of square "+area);
	}
	NewClass(int a,float b)
	{
	 float area=a*a*b;
	 System.out.println("Area of circle "+area);
	}
}

//Run time polymorphism - overriding
class MyClass
{
	public static void main(String[] args)
	{
	 ChildClass obj=new ChildClass();
	 obj.show();
	}
}

class ParentClass
{
	void show()
	{
	 System.out.println("Parent class");
	}
}
class ChildClass extends ParentClass
{
	void show()
	{
	 System.out.println("Child class");
	}
}