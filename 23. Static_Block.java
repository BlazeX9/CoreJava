//A static block is a block of code that executes once when the class is loaded before the main() method
class SubClass {
	static {
	 	System.out.println("Sub class static block");
	}
	void show() {
	 	System.out.println("Sub class method");
	}
}

public class StaticBlock {
    static {
	 	System.out.println("Main class static block");
	}
	public static void main(String[] args) {
		System.out.println("Main class method");
		SubClass obj=new SubClass();
		obj.show();
	}
}
//Main class static block first executes and then Sub class static block executes
