public class MyClass {
    public static void main(String[] args) {
	int a = 9;
	double b = a;			//Automatic casting: int to double
	System.out.println(a);
	System.out.println(b);
		
	double c = 9.78d;
	int d = (int) c; 		//Manual casting: double to int
	System.out.println(c);
	System.out.println(d);
		
	int maxScore = 500;
	int userScore = 423;
	float percentage = (float) userScore / maxScore * 100.0f;
	System.out.println("User's percentage is " + percentage);
	}
}

(automatically) byte -> short -> char -> int -> long -> float -> double
(manually)      double -> float -> long -> int -> char -> short -> byte
