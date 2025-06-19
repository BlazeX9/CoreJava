import java.util.Scanner;

public class MyClass {
	   public static void main(String[] args) {
     
		      Scanner MyScn = new Scanner(System.in);
		
		      int a;
		      System.out.println("Enter a integer number");
		      a = MyScn.nextInt();
		      System.out.println("User Input: "+a);
		
		      long b;
		      System.out.println("Enter a long number");
		      b = MyScn.nextLong();
		      System.out.println("User Input: "+b);
		
		      float c;
		      System.out.println("Enter a float number");
		      c = MyScn.nextFloat();
		      System.out.println("User Input: "+c);
		
		      double d;
		      System.out.println("Enter a double number");
		      d = MyScn.nextDouble();
		      System.out.println("User Input: "+d);
		
		      char e;
		      System.out.println("Enter a character");
		      e = MyScn.next().charAt(0);
		      System.out.println("User Input: "+e);
		
		      Scanner MyScnr = new Scanner(System.in);		   //String and other data types can't be used in same scanner
		      String f;
		      System.out.println("Enter a string");
		      f = MyScnr.nextLine();
		      System.out.println("User Input: "+f);
	    }
}





public class PracticeSet_1 {
	   public static void main(String[] args) {
     
		      Scanner MyScn = new Scanner(System.in);
		
		      //Swap between two numbers without using variable
		      System.out.println("First number: ");
		      int num1 = MyScn.nextInt();
		      System.out.println("Second number: ");
		      int num2 = MyScn.nextInt();
		
		num1 = num1+num2; 		
		num2 = num1-num2;
		num1 = num1-num2;
		
		System.out.println("After swap first numer is "+num1);
		System.out.println("After swap second numer is "+num2);
		
		//Swap between two numbers using variable
		System.out.println("First number: ");	
		int num3 = MyScn.nextInt();
		System.out.println("Second number: ");
		int num4 = MyScn.nextInt();
		
		int swap=num3;			
		num3=num4;
		num4=swap;
		
		System.out.println("After swap first numer is "+num3);
		System.out.println("After swap second numer is "+num4);
	}
}


