import java.util.Scanner;
public class Exercise2_25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = input.nextInt();
        if(num % 2 == 0){
            System.out.println("number is an even number");
        } else {
            System.out.println("number is an odd number");
        }
    }
}