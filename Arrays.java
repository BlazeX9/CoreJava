## Array Declaration

```java
int[] marks = new int[5];
int[] marks = {10, 20, 30, 40, 50};
```

### To print the array values

```java
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}
```

### To print the array values in reverse order

```java
for (int i = marks.length - 1; i >= 0; i--) {
    System.out.println(marks[i]);
}
```

### To print the array values using a for-each loop

```java
for (int element : marks) {
    System.out.println(element);
}
```
