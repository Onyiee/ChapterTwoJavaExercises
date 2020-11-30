import java.util.Scanner;

public class Exercise2_24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter firstNumber: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter secondNumber: ");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter thirdNumber: ");
        int thirdNumber = scanner.nextInt();
        System.out.println("Enter fourthNumber: ");
        int fourthNumber = scanner.nextInt();
        System.out.println("Enter fifthNumber: ");
        int fifthNumber = scanner.nextInt();

        int largestNumber = firstNumber;
        int smallestNumber = firstNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber && firstNumber > fourthNumber && firstNumber > fifthNumber){
            System.out.println("firstNumber is the largest number");
        }
        if (secondNumber > firstNumber && secondNumber > thirdNumber && secondNumber > fourthNumber && secondNumber > fifthNumber){
            System.out.println("secondNumber is the largest number");
            largestNumber = secondNumber;
        }
        if (thirdNumber > firstNumber && thirdNumber > secondNumber && thirdNumber > fourthNumber && thirdNumber > fifthNumber) {
            System.out.println("thirdNumber is the largest number");
            largestNumber = thirdNumber;
        }
        if (fourthNumber > firstNumber && fourthNumber > secondNumber && fourthNumber > thirdNumber && fourthNumber > fifthNumber) {
            System.out.println("fourthNumber is the largest number");
            largestNumber = fourthNumber;
        }
        if (fifthNumber > firstNumber && fifthNumber > secondNumber && fifthNumber > thirdNumber && fifthNumber > fourthNumber) {
            System.out.println("fifthNumber is the largest number");
            largestNumber = fifthNumber;
        }

        if (firstNumber < secondNumber && firstNumber < thirdNumber && firstNumber < fourthNumber && firstNumber < fifthNumber){
            System.out.println("firstNumber is the smallest number");
        }
        if (secondNumber < firstNumber && secondNumber < thirdNumber && secondNumber < fourthNumber && secondNumber < fifthNumber){
            System.out.println("secondNumber is the smallest number");
            smallestNumber = secondNumber;
        }
        if (thirdNumber < firstNumber && thirdNumber < secondNumber && thirdNumber < fourthNumber && thirdNumber < fifthNumber){
            System.out.println("thirdNumber is the smallest number");
        }
        if(fourthNumber < firstNumber && fourthNumber < secondNumber && fourthNumber < thirdNumber && fourthNumber < fifthNumber){
            System.out.println("fourthNumber is the smallest number");
        }
        if (fifthNumber < firstNumber && fifthNumber < secondNumber && firstNumber <thirdNumber  && firstNumber < fourthNumber){
            System.out.println("firstNumber is the smallest number");
        }
        if(firstNumber == secondNumber && firstNumber == thirdNumber && firstNumber == fourthNumber && firstNumber == fifthNumber){
            System.out.println("numbers are equal");
        }
        }
}
