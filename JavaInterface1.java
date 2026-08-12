//Java does not support multiple inheritance of classes, so a child class cannot extend multiple parent classes. 
//Instead Java uses interfaces which allow a child class to implement multiple interfaces and achieve multiple inheritance.

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
