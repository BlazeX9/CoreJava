//Java does not support multiple inheritance of classes, so a child class cannot extend multiple parent classes. 
//Instead Java uses interfaces which allow a child class to implement multiple interfaces and achieve multiple inheritance.

//Example 1
interface Payment {
    void pay(double amount);
}

class CreditCard implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class UPI implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PayPal implements Payment {
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using PayPal");
    }
}

public class JavaInterface1 {
    public static void main(String[] args) {
        CreditCard obj1 = new CreditCard();
        UPI obj2 = new UPI();
        PayPal obj3 = new PayPal();

        obj1.pay(1000);
        obj2.pay(900);
        obj3.pay(950);
    }
}

//Example 2
interface Payment {
    void pay(double amount);
}

interface Item {
    void product(int amount);
}

class Delivery implements Payment, Item {
    public void product(int amount) {
        System.out.print("Delivered "+amount+" Boxes");
    }
    public void pay(double amount) {
        System.out.print(" and received amount "+amount);
    }
}

public class JavaInterface2 {
    public static void main(String[] args) {
        Delivery obj = new Delivery();
        obj.product(100);
        obj.pay(21000);
    }
}
