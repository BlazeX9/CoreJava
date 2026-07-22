//Varargs allows methods to accept any number of parameters

public class codeVarArgs {
    static int sum(int ...arr) {
        int result = 0;
        for(int a:arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,4,5));
    }
}