import java.util.Scanner;

class ScannerClass
{
	public static void main(String[] args)
	{
		Scanner MyScanner = new Scanner(System.in);
		System.out.print("Enter number 1: ");
		int num1=MyScanner.nextInt();
		System.out.print("Enter number 2: ");
		int num2=MyScanner.nextInt();
		int sum=num1+num2;
		System.out.print("Total is: "+sum);
	}
}



// int --> nextInt()
// long --> nextLong()
// float --> nextFloat()
// double --> nextDouble()
// char --> next().charAt(0)
// string --> nextLine()
