public class Jagged_array {
    public static void main(String[] args) {
        int array[][] = new int[3][];

        array[0] = new int[3];
        array[1] = new int[2];
        array[2] = new int[1];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                array[i][j] = (int)( Math.random()*100);

            }

        }
for (int n[] : array){
    for (int m : n){
        System.out.print(m + " ");

    }
    System.out.println();
}


    }
}
