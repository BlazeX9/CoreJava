class NewClass {
	static int a;
	NewClass() {
	    a=0;
	}
	void increment() {
	    a++;
	}
	void show() {
	    System.out.println("Result "+a);
	}
}

public class staticVariable {
    public static void main(String[] args) {
	    NewClass obj1=new NewClass();
	    NewClass obj2=new NewClass();
	    NewClass obj3=new NewClass();
		
	    obj1.increment();
	    obj1.show();

	    obj2.increment();
	    obj2.show();

	    obj3.increment();
	    obj3.show();
	}
}
//Without Static Output is: a = 1, a = 1, a = 1
