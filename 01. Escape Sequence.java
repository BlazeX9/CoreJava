[Notes]
\t    --> space
\n    --> next line
\' \' --> ' '
\" \" --> " "


class MyClass
{
 public static void main(String[] args)
 {		
  System.out.println("1)\"Hello\"\t\'World\'");  --> 1)"Hello" 'World'
  System.out.println("2)\'Hello\'\t\"World\"");  --> 2)'Hello' "World"
  System.out.println("3)\"Hello\"\n\'World\'");
  System.out.println("4)\'Hello\'\n\"World\"");
  System.out.println("5)\"Amity\"\t\'Computar\'\tAcademy");
  System.out.println("6)Name\tRoll\tCourse\tMarks\tGrade\nRam\t1\tC\t90\tAA\nShyam\t2\tc++\t80\tA+");
 }
}
