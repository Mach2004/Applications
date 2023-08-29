import java.util.Scanner;

public class mulitdimensional_array {
    public static void main(String[] args) {


        int array[][] = new int[2][2];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {

                array[i][j] = (int)( Math.random()*100);

            }

        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(array[i][j] + " ");

            }
            System.out.println();
        }
        for (int n[] : array){
            for (int m : n){
                System.out.print(m + " ");
                // this is a enhanced for loop
            }
        }
    }
}
