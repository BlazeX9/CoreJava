//A Java constructor is a method that is invoked automatically when an object of a class is created.
//The constructor name must be exactly identical to the class name
//A constructor does not have any return type, not even void
class Greetings {
    Greetings() {
        System.out.println("Hello World");
    }
}

public class MyClass {
    public static void main(String[] args) {
        Greetings obj = new Greetings();
    }
}
