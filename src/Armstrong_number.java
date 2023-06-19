import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Armstrong_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        String ans = armstrong(num);
        System.out.println(ans);

    }

    static @NotNull String armstrong(int num)
    {
        int original = num ;
        int sum = 0;
        while (num>0)
        {

            int remainder = num % 10 ;

                    num = num / 10 ;
           sum = sum + remainder * remainder * remainder;
        }
        if (sum == original) {
            System.out.println(original +" is an armstrong number");

        }
        else {
            System.out.println(original +" is not an armstrong number");
        }


return "enter again";
    }


}
