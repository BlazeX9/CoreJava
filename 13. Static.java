1. Static Variable
------------------
//Example 1
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass ob1=new NewClass();
	 NewClass ob2=new NewClass();
	 NewClass ob3=new NewClass();
		
	 ob1.increment();
	 ob1.show();
	 ob2.increment();
	 ob2.show();
	 ob3.increment();
	 ob3.show();
	}
}

class NewClass
{
	static int a;
	NewClass()
	{
	 a=0;
	}
	void increment()
	{
	 a++;
	}
	void show()
	{
	 System.out.println("Result "+a);
	}
}

Without Static Output is: a = 1
			  a = 1
			  a = 1

With Static Output is:    a = 1
			  a = 2
			  a = 3

//Example 2
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass ob1=new NewClass();
	 NewClass ob2=new NewClass();
	 NewClass ob3=new NewClass();
		
	 ob1.increment();
	 ob2.increment();
	 ob3.increment();
		
	 ob1.show();
	 ob2.show();
	 ob3.show();
	}
}

class NewClass
{
	static int a;
	NewClass()
	{
	 a=0;
	}
	void increment()
	{
	 a++;
	}
	void show()
	{
	 System.out.println("Result "+a);
	}
}

Without Static Output is: a = 1
			  a = 1
			  a = 1

With Static Output is:    a = 3
			  a = 3
			  a = 3

//Example 3
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass ob1=new NewClass();
	 NewClass ob2=new NewClass();
	 NewClass ob3=new NewClass();
		
	 ob1.increment();
	 ob1.show();
	 ob2.increment();
	 ob2.show();
	 ob3.increment();
	 ob3.show();
	}
}

class NewClass
{
	static int a;
	int b;
	NewClass()
	{
	 a=0;
	}
	void increment()
	{
	 b=a++;
	}
	void show()
	{
	 System.out.println("value of a "+a+" value of b "+b);
	}
}

Without Static Output is: a = 1 & b = 0
   			  a = 1 & b = 0
			  a = 1 & b = 0

With Static Output is:    a = 1 & b = 0
   			  a = 2 & b = 1
			  a = 3 & b = 2

//Example 4
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass ob1=new NewClass();
	 NewClass ob2=new NewClass();
	 NewClass ob3=new NewClass();
		
	 ob1.increment();
	 ob2.increment();
	 ob3.increment();
		
	 System.out.println("value of a "+NewClass.a+" value of b "+ob1.b);
	 System.out.println("value of a "+NewClass.a+" value of b "+ob2.b);
	 System.out.println("value of a "+NewClass.a+" value of b "+ob3.b);
	 //[Note: Static variable is called using class name & non static variable is called using object]
	}
}

class NewClass
{
	static int a;
	int b;
	NewClass()
	{
	 a=0;
	}
	void increment()
	{
	 b=a++;
	}
}

Without Static Output is: a = 1 & b = 0
   			  a = 1 & b = 0
			  a = 1 & b = 0

With Static Output is:    a = 3 & b = 0
   			  a = 3 & b = 1
			  a = 3 & b = 2


2. Static Method
----------------
class MyClass
{
	public static void main(String[] args)
	{
	 NewClass obj=new NewClass();
	 System.out.println("value of a "+NewClass.a+" value of b "+obj.b);
	 obj.show();
	 NewClass.view();
	}
}

class NewClass
{
	static int a;
	int b;
	NewClass()
	{
	 a=10;
	 b=15;
	}
	void show()
	{
	 System.out.println("value of a "+a+" value of b "+b);
	}
	static void view()
	{
	 System.out.println("value of a "+a);      //[Note: Non-Static variable can't be used inside a static function]
	}
}


3. Static Block
---------------
class MyClass
{
	static
	{
	 System.out.println("One"); 		//[Note: main class static block executes at first]
	}
	 public static void main(String[] args){
	 NewClass obj=new NewClass();
	 obj.show();
	}
}

class NewClass
{
	void show()
	{
	 System.out.println("Three");
	}
	static
	{
	 System.out.println("Two");		//[Note: subclass static block executes at second]
	}
}
