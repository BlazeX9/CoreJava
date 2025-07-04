public class MyClass {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.increment(1,3);
	}
	void increment(int x, int y) {
		if(x<=y) {
			System.out.println(x);
			increment(x+1,y);
		}
	}
}

import java.util.Scanner;

public class MyClass {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		Scanner Scn = new Scanner(System.in);
		System.out.print("Enter the value: ");
		int a = Scn.nextInt();
		int res = obj.series(a);
		System.out.println("Sum of the series: "+res);
	}
	int series(int x) {
		if(x>0) {
			return x + series(x-1);
		}
		else {
			return 0;
		}
	}
}
