//abstract class is a restricted class that cant be used to create objects
//abstract class can only be accessed through inheritance from another class

//abstract method can only be used in abstract class and it does not have a body
//abstract method body is provided by the sub class

//main objective of using abstract class and method is to must use of parent class abstract method in child class.

abstract class Car {
    abstract void maxSpeed();
    void color1() {
        System.out.print("Black");
    }
    void color2() {
        System.out.print("Red");
    }
    void color3() {
        System.out.print("White");
    }
}

class Alto extends Car {
    void maxSpeed() {
        System.out.print("100");
    }
}

class Mauti extends Car {
    void maxSpeed() {
        System.out.print("120");
    }
}

public class JavaAbstractClass {
    public static void main(String[] args) {
        Alto obj1 = new Alto();
        Mauti obj2 = new Mauti();
        System.out.print("Alto max speed: ");
        obj1.maxSpeed();
        System.out.print(" Available colors: ");
        obj1.color1();
        System.out.print(", ");
        obj1.color3();

        System.out.print("\nMaruti max speed: ");
        obj2.maxSpeed();
        System.out.print(" Available colors: ");
        obj2.color1();
        System.out.print(", ");
        obj2.color2();
    }
}
