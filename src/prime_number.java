import java.util.Scanner;

public class prime_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
      int num = input.nextInt();
        String a = ans(num);
        System.out.println(a);
    }

    static String ans(int num){

        int temp = 0;
        for (int i = 2; i < num-1; i++) {
            if (num % 2 == 0) {
                temp = temp + 1 ;

            }

            }
        if (temp>0) {

            System.out.println("Entered number is not prime");

        }
        else {
            System.out.println("Entered number is prime");
        }


        return "Enter again" ;

    }
}