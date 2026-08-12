//Method Overloading is the process of defining multiple methods with the same name but different parameters in the same class

class MyClass {
    void user(String Name,int Age) {
        System.out.println(Name+" "+Age+" ...running user method one");
    }
    void user(String Name,int Age,String City) {
        System.out.println(Name+" "+Age+" "+City+" ...running user method two");
    }
}

public class Overloading {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.user("Abhik", 31, "Kolkata");
    }
}
