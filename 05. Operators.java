public class MyClass {
    public static void main(String[] args) {
		
	// % (Modulus) > Returns the division remainder
	int num1=3;
	int num2=2;
	int res=num1%num2;
	System.out.println("Remainder: "+res);
		
	// x+=y > x=x+y
	int num1=5;
	int num2=3;
	num1+=num2;
	System.out.println("Output: "+num1);
		
	// x-=y > x=x-y
	// x*=y > x=x*y
	// x/=y > x=x/y
	// x%=y > x=x%y
		
	// ++a(pre-increment) --> Increments the value of a by 1 and returns the new value of a after incrementing
	int a=5;
	int b=++a;
	System.out.println("a:"+a);   //a becomes 6
	System.out.println("b:"+b);   //b becomes 6

	// a++(post-increment) --> Increments the value of a by 1 and returns the original value of a before incrementing
	int a=5;
	int b=a++;
	System.out.println("a:"+a);   //a becomes 6
	System.out.println("b:"+b);   //b becomes 5
		
	int a=6;
	int b=7;
	boolean res1=(a>b);
	System.out.println("Greater? "+res1);
	boolean res2=(a<b);
	System.out.println("Less? "+res2);
	boolean res3=(a>=b);
	System.out.println("Greater than or equals? "+res3);
	boolean res4=(a<=b);
	System.out.println("Less than or equals? "+res4);
	boolean res5=(a==b);
	System.out.println("Equal? "+res5);
	boolean res6=(a!=b);
	System.out.println("Not Equal? "+res6);

	//Ternary Operator
	(Condition)?"If true":"If false"    
		
	//Check a number is positive or negative using ternary operator
	int val=-7;
	String opt=(val>0)?"Positve":"Negative";
	System.out.println(opt);
		
	//Check a number is even or odd using ternary operator
	int val=10;
	String opt=(val%2==0)?"Even":"Odd";
	System.out.println(opt);
		
	//Find the largest number between two numbers using ternary operator
	int val1=5;
	int val2=7;
	int opt=(val1>val2)?val1:val2;
	System.out.println("Largest Number is: "+opt);
		
	//Find the largest number between three numbers using ternary operator
	int val1=5;
	int val2=9;
	int val3=3;
	int opt=(val1>val2 && val1>val3)?val1:((val2>val3)?val2:val3);
	System.out.println("Largest Number is: "+opt);
	}
}
