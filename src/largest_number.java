import java.util.Scanner;

public class largest_number {
    public static void main(String[] args) {
        System.out.println("This program is for Finding largest number entered by user");
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        int max = b;
        if(a>max)
        {
            max = b;
        }
        if(c>max){
            max = c;

        }
        System.out.println(max);
    }
}
