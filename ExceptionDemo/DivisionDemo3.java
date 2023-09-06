

//prog: Division of two  with using multiple try exception handling
import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionDemo3 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter a first no : ");
            a = sc.nextInt();
            System.out.println("Enter a second no :  ");
            b = sc.nextInt();
            c = a / b;
            System.out.println("Division of " + a + " And " + b + " is " + c);
        } catch (ArithmeticException ex) {
            System.out.println(" Don't enter 0 as second no");
        } catch (InputMismatchException ex) {
            System.out.println("Enter a valid no ");
        }
        System.out.println("Main Termenated Normally");
    }
}