import java.util.Scanner;

public class Case_check {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        char ch = input.next().trim().charAt(0);
        System.out.println("The first letter is " +ch);
        if (ch>='a' && ch<='z')
        {
            System.out.println("The first letter is lower case");
        }
        else {
            System.out.println("The fist letter is upper case");
        }
    }
}
