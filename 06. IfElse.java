package mypack;
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
	Scanner Scn = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char C = Scn.next().charAt(0);
		
	if((C>='a' && C<='z') || (C>='A' && C<='Z')) {
		if(C=='a' || C=='e' || C=='i' || C=='o' || C=='u' || C=='A' || C=='E' || C=='I' || C=='O' || C=='U') {
		    System.out.println("The character is vowel");
		}
		else {
		    System.out.println("Its character is consonent");
		}
	}
	else {
	    System.out.println("Invalid character");
	}
    }
}

public class MyClass {
    public static void main(String[] args) {
	Scanner Scn = new Scanner(System.in);
	System.out.print("Enter a character: ");
	char a=Scn.next().charAt(0);
		
	if(a>='a' && a<='z') {
	    int y=(int)a;
	    int u=y-32;
	    a=(char)u;
	    System.out.println(a);
	}
	else if(a>='A' && a<='Z') {
	    int y=(int)a;
	    int u=y+32;
	    a=(char)u;
	    System.out.println(a);
	}
	else {
	    System.out.println("Invalid character");
	}
    }
}
