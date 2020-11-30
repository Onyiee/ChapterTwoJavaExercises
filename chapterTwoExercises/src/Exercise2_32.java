import java.util.Scanner;

public class Exercise2_32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int positiveNumber = 0;
        int negativeNumbers = 0;
        int zeroes = 0;
        System.out.println("Enter first number: ");
        int temp = input.nextInt();
        if(temp > 0){
            positiveNumber++;
        } else if(temp < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }
        System.out.println("Enter second number: ");
        temp = input.nextInt();
        if(temp > 0){
            positiveNumber++;
        } else if(temp < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }
        System.out.println("Enter third number: ");
        temp = input.nextInt();
        if(temp > 0){
            positiveNumber++;
        } else if(temp < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }
        System.out.println("Enter fourth number: ");
        temp = input.nextInt();
        if(temp > 0){
            positiveNumber++;
        } else if(temp < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }
        System.out.println("Enter fifth number: ");
        temp = input.nextInt();
        if(temp > 0){
            positiveNumber++;
        } else if(temp < 0) {
            negativeNumbers++;
        } else {
            zeroes++;
        }

        System.out.println("There are " + positiveNumber + " positive numbers");
        System.out.println("There are " + negativeNumbers + " negative numbers");
        System.out.println("There are " + zeroes + " zeroes");
    }
}
