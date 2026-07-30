//'static' keyword is used to call a method without need to create an object of the class
public class myClass {
    static int summation(int x,int y) {
        int res = x+y;
        return res;
    }
    int multiplication(int x,int y) {
        int res = x*y;
        return res;
    }
    
    public static void main(String[] args) {
        int a=5, b=3;
        int res1 = summation(a,b);
        System.out.println("Summation: "+res1);

        myClass obj = new myClass();
        int res2 = obj.multiplication(a,b);
        System.out.println("Multiplication: "+res2);
    }
}
