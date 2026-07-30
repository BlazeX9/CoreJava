public class myClass {
    public static void main(String[] args) {
        int [][] flats = {
            {101,102,103},
            {201,202,203}
        };

        for (int i=0;i<flats.length;i++) {
            for(int j=0;j<flats[i].length;j++) {
                System.out.print(flats[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
