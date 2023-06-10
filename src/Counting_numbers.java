import java.util.Scanner;

public class Counting_numbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = input.nextInt();
        System.out.println("Which number occurences do you have to check");
        int b = input.nextInt();
        int count = 0;
        while(a > 0) {
            int rem = a % 10 ;
            if (rem == b)
            {
                 count++;
            }

            a = a / 10;

        }
        System.out.println("The number occured "+count+ " times");
    }
}
