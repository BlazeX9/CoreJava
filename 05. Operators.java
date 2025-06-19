public class MyClass {
    public static void main(String[] args) {
		
	// % (Modulus) > Returns the division remainder
	int num1=3;
	int num2=2;
	int res=num1%num2;
	System.out.println("Remainder: "+res);
		
	// x+=3 > x=x+3
	int num3=5;
	int num4=3;
	num3+=num4;		//num3=num3+num4
	System.out.println("Output: "+num3);
		
	// x-=3 > x=x-3
	// x*=3 > x=x*3
	// x/=3 > x=x/3
	// x%=3 > x=x%3
		
	// ++a(pre-increment) --> Increments the value of a by 1 and returns the new value of a after incrementing
	int a1=5;
	int b1=++a1;	//a becomes 6 and b becomes 6
	System.out.println("a1:"+a1);
	System.out.println("b1:"+b1);

	// a++(post-increment) --> Increments the value of a by 1 and returns the original value of a before incrementing
	int a2=5;
	int b2=a2++;	//a becomes 6 and b becomes 5
	System.out.println("a2:"+a2);
	System.out.println("b2:"+b2);
		
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
		
	//Check a number is positive or negative using ternary operator
	int val1=-7;
	String opt1=(val1>0)?"Positve":"Negative";
	System.out.println(opt1);
		
	//Check a number is even or odd using ternary operator
	int val2=10;
	String opt2=(val2%2==0)?"Even":"Odd";
	System.out.println(opt2);
		
	//Find the largest number between two numbers using ternary operator
	int val3=5;
	int val4=7;
	int opt3=(val3>val4)?val3:val4;
	System.out.println("Largest Number is: "+opt3);
		
	//Find the largest number between three numbers using ternary operator
	int val5=5;
	int val6=9;
	int val7=3;
	int opt4=(val5>val6 && val5>val7)?val5:((val6>val7)?val6:val7);
	System.out.println("Largest Number is: "+opt4);
	}
}
