//Rules for declaring a variable name:-
//1. Must not begin with a digit
//2. Blank spaces are not allowed
//3. Name can't be a reserved keyword
//4. Can contain characters like $ _
//5. Variable name is case sensitive

class VariableClass
{
	public static void main(String[] args)
	{
		int i=100;
		System.out.println("Value: "+ i);
		
		long l=33333333;
		System.out.println("Value: "+ l);
		
		float f=3.14f;
		System.out.println("Value: "+ f);
		
		double d=100.53;
		System.out.println("Value: "+ d);
		
		char c='A';
		System.out.println("Value: "+ c);
		
		String s="Hello";
		System.out.println("Value: "+ s);
	}
}
