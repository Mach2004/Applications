import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
int ans = 0;
        while(true) {

            System.out.println("Enter the operation you want");
            char op = input.next().trim().charAt(0);
            if(op == '+' || op == '-'||op=='*'|| op == '%'||op == '/' )
            {
                System.out.println("Enter 1st number");
                int a = input.nextInt();
                System.out.println("Enter 2nd number");
                int b = input.nextInt();

                if(op == '+' ) {
                    ans = a + b;
                }
                  if(op == '-'){
                    ans = a -b;
                }
                if (op == '*') {
                    ans = a * b;
                }
                if(op == '%')
                {
                    ans = a % b;
                }
                if(op == '/')
                {
                    ans = a / b;

                }


                System.out.println("The answer is " +ans);


            }
            else
            {
                System.out.println("You have entered wrong value");

            }


        }

    }


}
