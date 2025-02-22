//1. Simple Inheritance  [P] --> [C]
import java.util.Scanner;
class classParent{
	String n,c;
	int r;
	void input(){
	Scanner MyScn1 = new Scanner(System.in);
	System.out.print("Enter name ");
	n = MyScn1.nextLine();
	System.out.print("Enter course ");
	c = MyScn1.nextLine();
	
	Scanner MyScn2 = new Scanner(System.in);
	System.out.print("Enter roll ");
	r = MyScn2.nextInt();
	}
}
class classChild extends classParent{
	void show(){
		System.out.print("User "+n+" has selected course "+c+" and his roll number is "+r);
	}
}
class MyClass{
	public static void main(String[] args){
		classChild obj = new classChild();
		obj.input();
		obj.show();
	}
}

//2. Multilevel Inheritance  [GP] --> [P] --> [C]
class grandClass{
	int x;
	void value(int a){
		x=a;
	}
}
class parentClass extends grandClass{
	int y;
	void newvalue(){
		y=x+5;
	}
}
class classChild extends parentClass{
	void show(){
		System.out.print("U "+y);
	}
}
class MyClass{
	public static void main(String[] args){
		classChild obj = new classChild();
		obj.value(5);
		obj.newvalue();
		obj.show();
	}
}
