import java.util.Scanner;

public class Prime_number2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();

        String ans = prime(num);
        System.out.println(ans);

    }

    static String prime(int num)
    {
        if (num<0) {
            return "Enter valid number" ;

        }
        int i = 2;
        while (i * i <= num)

        {
            if (num % i == 0) {
                return "Number is not prime" ;

            }
            i++ ;
        }
        if (i * i > num) {
            return "Entered number is prime" ;

        }
        else {
            return "Entered Number is not prime" ;
        }




    }
}
