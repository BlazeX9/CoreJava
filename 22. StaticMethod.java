class StaticClass {
	static int a;
	static int b;
	static void show() {
	    System.out.println("a = "+a+" b = "+b);
	}
}

public class StaticMethod {
    public static void main(String[] args) {
		StaticClass.a = 10;
		StaticClass.b = 15;
		StaticClass.show();
	}
}
//Only static variables can be used in a static method
