//To access private variables Getters and Setters method is used
class Employee {
    private String name;

    public void setName(String x) {
        name = x;
    }
    public String getName() {
        return name;
    }
}

public class MyClass {
    public static void main(String[] args) {
        Employee classObj = new Employee();
        classObj.setName("Abhik");
        System.out.println(classObj.getName());
    }
}
