class MyClass
{
 public static void main(String[] args)
 {
  int num1=11;
  int num2=13;
  int num3=17;
  int sum=num1+num2+num3;
  float avg=sum/3;  	--> Result will be in intiger
  System.out.println(avg);
  
  float avg=(float)sum/3;  --> Result will be in float
  float avg=sum/(float)3;
  float avg=sum/3f;
  System.out.println(avg);
 }
}