public class NRNA {
   public static void main(String[] args) {
	//NRNA--->No Return No Argument
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

public class NRHA {
   public static void main(String[] args) {
	//NRHA--->No Return Having Argument
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

public class HRNA {
   public static void main(String[] args) {
	//HRNA--->Having Return No Argument
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

public class HRHA {
   public static void main(String[] args) {
	//HRHA--->Having Return Having Argument
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
