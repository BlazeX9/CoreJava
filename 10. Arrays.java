//One Dimensional Array
int[] marks = new int[5];
int[] marks = {10, 20, 30, 40, 50};

// To print the array values
for (int i=0; i<marks.length; i++) {
    System.out.println(marks[i]);
}

// To print the array values in reverse order
for (int i=marks.length -1; i>=0; i--) {
    System.out.println(marks[i]);
}

// To print the array values using a for-each loop
for (int value:marks) {
    System.out.println(value);
}

//Multi Dimensional Array
public class Main {
    public static void main(String[] args) {
        int [][] flats = {
            {101,102,103},
            {201,202,203}
        };

        for (int i=0; i<flats.length; i++) {
            for(int j=0; j<flats[i].length; j++) {
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
