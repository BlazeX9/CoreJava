Java is a **platform-independent** programming language because its source code is compiled into **bytecode**. This **bytecode** can run on **any operating system** that has a compatible **Java Virtual Machine (JVM)** installed.<br><br>

**Stack memory** is the portion of memory that is assigned to every individual program and it is fixed. On the other hand, **Heap memory** is the portion that is not allocated to the Java program but it will be available for use when it is required, during the runtime of the program.<br><br>

<p align="center">
  <img src="https://i.postimg.cc/zBL50FrD/jvm.jpg" alt="JDK, JRE, and JVM Diagram" width="700">
</p><br>

**Wrapper classes** provide a way to use **primitive data types** as **objects**<br><br>

**`System.out`** is used to output the data that we want to display on the  console.
```java
System.out.println("Hello, World!");
```
**`System.err`** is used to display **error messages** on the console.
```java
System.err.println("An error occurred!");
```
**`System.in`** is used to read **input from the terminal window**.
```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Hello, " + name);
    }
}
```
