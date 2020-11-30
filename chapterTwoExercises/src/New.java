import java.util.Scanner;

public class New {
    public static void main(String[] args) {
        Scanner cute = new Scanner(System.in);
        System.out.println("Enter firstNumber: ");
        int firstNumber = cute.nextInt();
        System.out.println("Enter secondNumber: ");
        int secondNumber = cute.nextInt();
        System.out.println("Enter thirdNumber: ");
        int thirdNumber = cute.nextInt();
        //int sum = firstNumber + secondNumber + thirdNumber;
        //int product = firstNumber * secondNumber * thirdNumber;
        //int difference = firstNumber - secondNumber - thirdNumber;
        // int modulus = firstNumber % secondNumber % thirdNumber;
       System.out.printf("%s%d%n%s%d%n%s%d%n%s%d%n", "sum = ", firstNumber +
                secondNumber + thirdNumber, "product = ",
                firstNumber * secondNumber * thirdNumber, "difference = ",
                firstNumber - secondNumber - thirdNumber, "modulus =",
                firstNumber % secondNumber % thirdNumber );
      //  System.out.printf("sum=%d%nproduct=%d%ndiffernce=%d%nmodulus=%d%n", firstNumber
           //     + secondNumber + thirdNumber, firstNumber * secondNumber * thirdNumber
              //  , firstNumber - secondNumber - thirdNumber, firstNumber % secondNumber % thirdNumber );
      //  System.out.println("sum="+(firstNumber+secondNumber+thirdNumber));
    }
}
