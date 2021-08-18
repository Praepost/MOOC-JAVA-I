
import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer first = scanner.nextInt();
        System.out.println("Give the second number:");
        Integer second = scanner.nextInt();
        System.out.println(first + " + " + second + " = " + Integer.valueOf(first+second));
        System.out.println(first + " - " + second + " = " + Integer.valueOf(first-second));
        System.out.println(first + " * " + second + " = " + Integer.valueOf(first*second));
        System.out.println(first + " / " + second + " = " + Double.valueOf(first)/Double.valueOf(second));
    }
}
