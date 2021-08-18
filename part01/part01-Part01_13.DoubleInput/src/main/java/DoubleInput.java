
import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        String buffer = scanner.nextLine();
        double value = Double.valueOf(buffer);
        System.out.println("You gave the number " + value);

    }
}
