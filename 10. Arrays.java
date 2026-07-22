// Array Declaration
int[] marks = new int[5];
int[] marks = {10, 20, 30, 40, 50};

// To print the array values
for (int i = 0; i < marks.length; i++) {
    System.out.println(marks[i]);
}

// To print the array values in reverse order
for (int i = marks.length - 1; i >= 0; i--) {
    System.out.println(marks[i]);
}

// To print the array values using a for-each loop
for (int value:marks) {
    System.out.println(value);
}
