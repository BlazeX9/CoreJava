import java.util.Scanner;
import java.lang.Math;

class MyClass
{
 public static void main(String[] args)
 {
  Scanner MyScanner = new Scanner(System.in);
  System.out.print("Enter first number: ");
  int num1=MyScanner.nextInt();
  System.out.print("Enter second number: ");
  int num2=MyScanner.nextInt();
  int sum=num1+num2;
  System.out.print("Sum of two numbers is: "+sum);

  System.out.print("enter the value of base: ");
  int base=MyScanner.nextInt();
  System.out.print("enter the value of power: ");
  int power=MyScanner.nextInt();
  double res=Math.pow(base,power);
  System.out.println("Power: "+res);

  System.out.print("enter the value: ");
  int num=MyScanner.nextInt();
  double res=Math.sqrt(num);
  System.out.println("Square root: "+res);
 }
}


[Notes]
int --> nextInt()
long --> nextLong()
float --> nextFloat()
double --> nextDouble()
char --> next().charAt(0)
string --> nextLine()
