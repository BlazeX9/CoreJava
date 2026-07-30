class Dog {
    String Color = "White";
    int Age = 5;
}

class Animal extends Dog {
    void view() {
        System.out.println("Dog age of "+Age+" available in color "+Color);
    }
}

public class publicInheritance {
    public static void main(String[] args) {
        Animal obj = new Animal();
        obj.view();
    }
}
