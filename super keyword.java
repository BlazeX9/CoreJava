Note: The super keyword is used in inheritance to access the parent class's methods, variables, and constructors. It is commonly used when the child class has a method or variable with the same name as the parent class. 
When the parent and child classes have methods with the same name and parameters, the child class method overrides the parent class method. The super keyword can be used to call the overridden method from the parent class.	
The super keyword can also be used to call the parameterized constructor of the parent class by passing values to it.

	
Example:
--------
class ClassP {
	void show() {
	 System.out.println("Hello");
	}
}

class ClassC extends ClassP {
	void show() {
	 super.show();
	 System.out.println("World");
	}
}

class MyClass {
	public static void main(String[] args) {
	 ClassC obj=new ClassC();
         obj.show();
	}
}


Example:
-------------------------------
class ClassY {
	ClassY() {
	 System.out.println("ClassY");
	}
	ClassY(int a) {
	 System.out.println("ClassYY "+a);
	}
}

class ClassX extends ClassY {
	ClassX() {
	 System.out.println("ClassX");		
	}
	ClassX(int a) {
	 super(30);
	 System.out.println("ClassXX "+a);
	}
}

class MyClass {
	public static void main(String[] args) {
	 ClassX obj1=new ClassX();
	 ClassX obj2=new ClassX(10);
	}
}
