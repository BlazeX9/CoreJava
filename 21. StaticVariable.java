class NewClass {
	static int a;
	NewClass() {
	    a=0;
	}
	void increment() {
	    a++;
		System.out.println("Result "+a);
	}
}

public class StaticVariable {
    public static void main(String[] args) {
	    NewClass obj1=new NewClass();
	    NewClass obj2=new NewClass();
	    NewClass obj3=new NewClass();
		
	    obj1.increment();
	    obj2.increment();
	    obj3.increment();
	}
}
//Without Static Output is: a = 1, a = 1, a = 1
