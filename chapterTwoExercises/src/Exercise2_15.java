import java.util.Arrays;
import java.util.Scanner;

public class Exercise2_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = scan.nextInt();
        //int sum = firstNumber + secondNumber;
        //int product = firstNumber * secondNumber;
       // int difference = firstNumber - secondNumber;
       // int division = firstNumber / secondNumber;
        System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n", "sum = " ,firstNumber + secondNumber,"product = ", firstNumber * secondNumber, "difference = ", firstNumber - secondNumber,"division = ", firstNumber / secondNumber);
//        System.out.println("sum  = " + sum);
//        System.out.println("product  = " + product);
//        System.out.println("difference  = " + difference);
//        System.out.println("division  = " + division );
    }
}
