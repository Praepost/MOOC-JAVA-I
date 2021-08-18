
import java.util.Scanner;

public class BooleanInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write something:");
        String buffer = scanner.nextLine();
        boolean value = Boolean.valueOf(buffer);
        System.out.println("True or false? " + value);

    }
}
