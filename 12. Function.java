//NRNA---> No Return No Argument 
public class NRNA {
   public static void main(String[] args) {
	NRNA obj = new NRNA();
	obj.sum();
   }
   void sum() {
	int a = 5;
	int b = 7;
	int res = a+b;
	System.out.println("Sum: "+res);
   }
}

//NRHA---> No Return Having Argument
public class NRHA {
   public static void main(String[] args) {
	NRHA obj = new NRHA();
	int a = 5;
	int b = 5;
	int res = a+b;
	obj.sum(res);
   }
   void sum(int x) {
	int res = x;
	System.out.println("Sum: "+res);
   }
}

//HRNA---> Having Return No Argument
public class HRNA {
   public static void main(String[] args) {
	HRNA obj = new HRNA();
	int res = obj.sum();
	System.out.println("Sum: "+res);
   }
   int sum() {
	int a = 6;
	int b = 8;
	int res = a+b;
	return res;
   }
}

//HRHA---> Having Return Having Argument
public class HRHA {
   public static void main(String[] args) {
	HRHA obj = new HRHA();
	int a = 3;
	int b = 5;
	int res = obj.sum(a,b);
	System.out.println("Sum: "+res);
   }
   int sum(int x, int y) {
	int a = x;
	int b = y;
	int res = a+b;
	return res;
   }
}
