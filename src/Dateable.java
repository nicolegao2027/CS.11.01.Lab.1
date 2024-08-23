import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        int minage = age/2 + 7;
        System.out.println(age + "-year olds should date somebody who is at least " + minage);
    }
}
