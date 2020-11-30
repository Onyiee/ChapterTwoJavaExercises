import java.util.Scanner;

public class Exercise2_28 {
    public static void main(String[] args) {
        double pi = Math.PI;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter value of radius: ");
        int radius = scan.nextInt();
        System.out.printf("diameter is %d%n ", (2 * radius));
        System.out.printf("circumference is %f%n",(2 * pi * radius));
        System.out.printf("Area is %f%n", (pi * (radius * radius)));

    }
}
