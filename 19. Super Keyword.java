//'super' keyword is used to overcome method overriding
class ParentClass {
    void show() {
        System.out.println("Parent class method executed");
    }
}

class ChildClass extends ParentClass {
    void show() {
        super.show();
        System.out.println("Child class method executed");
    }
}

public class JavaSuper {
    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.show();
    }
}


//constructor overriding
class ParentClassX {
	ParentClassX(int a) {
        int res = a+10;
	    System.out.println("Values of a = "+res);
	}
	ParentClassX(int a,int b) {
        int res = a+b;
	    System.out.println("Values of b = "+b);
        System.out.println("Total is = "+res);
	}
    void show() {
        System.out.println("");
    }
}

class ChildClassX extends ParentClassX {
	ChildClassX(int a) {
        super(a,15);
	    System.out.println("Values of a = "+a);		
	}
}

public class JavaSuper2 {
    public static void main(String[] args) {
        ChildClassX obj = new ChildClassX(10);
        obj.show();
    }
}
