#Rules for declaring a variable name:-
1. Must not begin with a digit
2. Blank spaces are not allowed
3. Name can't be a reserved keyword
4. Can contain characters like $ _
5. Variable name is case sensitive

public class MyClass {
    public static void main(String[] args) {

	int a = 7;
	System.out.println(a);

	long b = 1234567890123456789l;	//l
	System.out.println(b);

	float c = 3.14f;		//f
	System.out.println(c);

	double d = 3.14159265359;
	System.out.println(d);

	char e = 'X';
	System.out.println(e);		//Single quotation

	String f = "Java";
	System.out.println(f);		//Double quotation
     }
}
