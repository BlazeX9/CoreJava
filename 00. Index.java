What is Java?
  - Java is an object oriented programming language. Java complies source code into the bytecode(.class file) and then its interpreted into machine readable code.

Is Java Platform Independent?
  - Yes, Java is a Platform Independent language. This .class file is independent of the software or hardware but needs a JVM preinstalled in the operating system for execution. Although JVM is platform dependent the bytecode can be created on any System and can be executed in any other system which makes Java platform independent.

JRE (Java Runtime Environment)
  - JRE is an installation package that creates an environment to run the Java program or application on any machine.  

JDK (Java Development Kit)
  - JDK creates the environment for developing Java applications.

JVM (Java Virtual Machine)
  - JVM is part of JRE, JVM is a interpreter converts bytecode(.class file) into machine readable code.

JRE vs JDK
  - JDK creates an environment to develop Java programs and JRE to execute Java programs.

What is variables?
  - Variables are containers for storing data values.

What is typecasting?
  - Typecasting is the process of converting a variable from one type to another. In Java there are two types of casting:
    1. Implicit: automatic type conversion from a smaller to a larger type. Ex - int to double
    2. Explicit: manual type conversion converts a larger type to a smaller type. Ex- double to int

Array
  - An array is a container that holds a fixed number of values of a single type.
    int[] myIntArray = new int[10];
    String[] myStringArray = new String[50];

What are literals?
  -   

What is a function or method?
  - A method is a block of code that performs a specific task and can optionally return a result.

What is recursion?
  - Recursion is a technique where a method calls itself.

What is constructor?
  - A constructor is a block of code similar to a method but unlike methods constructors have no return type and have the same name as the class itself.

---OOPS---
Encapsulation
  - It refers to binding of data and methods into a single unit called a ‘class’, encapsulation helps hiding data from direct access.
  
Abstraction
  - Representation of essential features excluding their background details is known as data abstraction.

Inheritance
  - inherit existing class properties and methods into a new class.
  
What is Polymorphism?
  - Polymorphism is the ability of an object to take multiple forms. In java compile-time polymorphism is achieved with the help of method overloading and run-time polymorphism is achieved with the help of method overriding.

Method overloading
  - Method overloading means methods are having the same name but they differ either in the number of arguments or in the type of arguments. It is done during compile time, so it is known as compile-time polymorphism.

Method overriding
  - 

  
---JDBC---
Java Database Connectivity is an API that enables java programs to execute SQL statements.

Connect to a database
  - Connection conn = DriverManager.getConnection("jdbc:subprotocol:subname", "user", "password");

Statement vs PreparedStatement
  - Statement: Used to execute a simple SQL query with no parameters.
  - PreparedStatement: Used for executing SQL statements when you need to bind parameters to the query.

ResultSet
  - ResultSet is a table of data representing a database result set

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhik","root","");
String sql="insert into student values(?)";
PreparedStatement ps = con.prepareStatement(sql);
ps.setString(1, "Ashok");
ps.executeUpdate();

Class.forName("com.mysql.jdbc.Driver");
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/abhik","root","");
String sql = "select * from student";
PreparedStatement ps = cn.prepareStatement(sql);
ResultSet rs = ps.executeQuery();
while(rs.next()) {
			System.out.println(rs.getString("Name")));
		}

SQL exception handleing
  - try {
    } 
    catch (SQLException ex) {
    }

Connection Pooling
  - It a technique that make calls to a database by reusing the connections instead of creating a new one each time to improve performance in applications.
