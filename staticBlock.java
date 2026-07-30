class SubClass {
	void show() {
	 	System.out.println("Sub class method");
	}
	static {
	 	System.out.println("Sub class static block");
	}
}

public class staticBlock {
    static {
	 	System.out.println("Main class static block");
	}
	public static void main(String[] args) {
		SubClass obj=new SubClass();
		obj.show();
	}
}
//Main class static block first executes and then Sub class static block executes