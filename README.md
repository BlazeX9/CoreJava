````markdown
## Why is Java Platform Independent?

Java is a **platform-independent** programming language because its source code is compiled into **bytecode** instead of machine code.

The generated **bytecode** can run on **any operating system** that has a compatible **Java Virtual Machine (JVM)** installed.

### Flow

```text
Java Source Code (.java)
          ↓
      Java Compiler (javac)
          ↓
       Bytecode (.class)
          ↓
Java Virtual Machine (JVM)
          ↓
Runs on Windows, Linux, macOS, etc.
```

**Key Point:**  
**Write Once, Run Anywhere (WORA)** means you can write a Java program once and run it on any platform with a compatible JVM, without modifying the code.
````
