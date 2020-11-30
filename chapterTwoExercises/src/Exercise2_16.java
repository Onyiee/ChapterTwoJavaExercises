import java.util.Scanner;

public class Exercise2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number1: ");
        int number1 = input.nextInt();
        System.out.println("Enter number2: ");
        int number2 = input.nextInt();
        int largerNumber = number1;
        if(number1 > number2){
            System.out.println("number1 Is larger");}
        if(number1 == number2){
            System.out.println("These numbers are equal");
        }
        if(number2 > number1){
            System.out.println("number2 Is larger");
            largerNumber=number2;
        }
       // System.out.println("the larger number value is "+largerNumber);

            }
        }


