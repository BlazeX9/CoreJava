//If child class have the same name, same parameters and same return type method as the parent class then parent class method gets overriden by the child class method
class myParentClass {
    void show() {
        System.out.println("Parent class method executed");
    }
}

class myChildClass extends myParentClass {
    void show() {
        System.out.println("Child class method executed");
    }
}

public class Overriding {
    public static void main(String[] args) {
        myChildClass obj = new myChildClass();
        obj.show();
    }
}