//A Java constructor is a method that is invoked automatically when an object of a class is created.
//The constructor name must be exactly identical to the class name
//A constructor does not have any return type, not even void

class MyClass {
    MyClass() {
        System.out.println("Hello World");
    }
}

public class codeConstructor {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.equals(obj);
    }
}
