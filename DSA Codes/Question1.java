import java.util.Arrays;
import java.util.Scanner;

class Student {
    int roll;
    String name;
    Float Marks;

    public void show() {
        System.out.println(name + " = " + Marks + " =" + roll);
    }
}

public class Question1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Student[] s1 = new Student[2];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = new Student();

            s1[i].roll = input.nextInt();
            s1[i].Marks = input.nextFloat();
            s1[i].name = input.next();
            s1[i].show();
        }

        sort(s1);

        System.out.println("Sorted Students:");
        for (Student student : s1) {
            student.show();
        }
    }

    static void sort(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j].roll < arr[j - 1].roll) {
                    Student temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}
