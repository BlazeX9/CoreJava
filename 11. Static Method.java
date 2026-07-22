//'static' keyword is used to call method without need to create an object of the class
public class staticMetod {
    static int sum(int x,int y) {
        int res = x + y;
        return res;
    }

    int mul(int x,int y) {
        int res = x * y;
        return res;
    }
    
    public static void main(String[] args) {
        int a = 5, b = 3;
        int res1 = sum(a, b);
        System.out.println("Sum: "+res1);

        staticMetod obj = new staticMetod();
        int res2 = obj.mul(a, b);
        System.out.println("Multiplication: "+res2);
    }
}