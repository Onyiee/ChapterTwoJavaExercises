import java.util.Scanner;

public class Exercise2_17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter number2: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter number3: ");
        int number3 = scanner.nextInt();
        int sum = number1 + number2 + number3;
        int average = (number1 + number2 + number3)/3;
        int product = number1 * number2 * number3;
        int smallest = number1;
        int largest = number1;
        if (number1 > number2 && number1 > number3){
            System.out.println("number1 is the largest");
        }

        if (number2 > number1 && number2 > number3){
            System.out.println("number2 is the largest");
            largest = number2;
        }

        if (number3 > number1 && number3 > number2){
            System.out.println("number3 is the largest");
            largest = number3;
        }
        if (number1 < number2 && number1 < number3){
            System.out.println("number1 is the smallest");
           }
        if (number2 < number1 && number2 < number3){
            System.out.println("number2 is the smallest");
            smallest = number2;
            }
        if (number3 < number1 && number3 < number2){
            System.out.println("number3 is the smallest");
            smallest = number3;}

        System.out.printf("%s%d%n", "sum: = ",  number1 + number2 + number3);
        System.out.printf("%s%d%n", "average: = ", (number1 + number2 + number3)/3);
        System.out.printf("%s%d%n", "product = ",number1 * number2 * number3 );


    }
}
