
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number:");
        Integer first = Integer.valueOf(scanner.nextInt());
        System.out.println("Give the second number:");
        Integer second = Integer.valueOf(scanner.nextInt());
        System.out.println("The average is " + (Double.valueOf(first)+Double.valueOf(second))/2);

    }
}
