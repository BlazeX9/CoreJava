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
