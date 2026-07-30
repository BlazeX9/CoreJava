public class Overloading {
    public static void main(int x) {
        System.out.println("Int: "+x);
    }

    public static void main(String n) {
        System.out.println("String: "+n);
    }

    public static void main(String[] args) {
        main(10);
        main("Abhik");
    }
}