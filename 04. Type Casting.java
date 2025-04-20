class MyClass
{
 public static void main(String[] args)
 {
  int num1=5;
  int num2=6;
  int num3=7;
  int sum=num1+num2+num3;
  float avg=sum/3;  	         --> Result will be in intiger
  float avg=(float)sum/3;     --> Result will be in float
  float avg=sum/(float)3;     --> Result will be in float
  float avg=sum/3f;           --> Result will be in float
  System.out.println(avg);
 }
}
