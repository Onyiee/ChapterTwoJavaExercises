import java.util.Scanner;

public class Exercise2_30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int digit1;
        int digit2;
        int digit3;
        int digit4;
        int digit5;
        System.out.println("Enter a number with 5 digits");
        int number = input.nextInt();
        if(number > 9_999 &&number < 100_000){
            digit5 = number % 10;
            number = number /10;
            digit4 = number % 10;
            number = number /10;
            digit3 = number % 10;
            number = number /10;
            digit2 = number %10;
            number = number /10;
            digit1 = number %10;
            System.out.println(digit1 + "   " + digit2 + "   " + digit3 + "   " + digit4 + "   " + digit5 );
        } else {
            System.out.println("Number must have 5 digits");
        }
    }
}
