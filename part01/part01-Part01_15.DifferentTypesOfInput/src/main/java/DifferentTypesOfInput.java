
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string:");
        String str = scan.nextLine();
        System.out.println("Give an integer:");
        String buffer = scan.nextLine();
        int value = Integer.valueOf(buffer);
        System.out.println("Give a double:");
        buffer = scan.nextLine();
        Double value_double = Double.valueOf(buffer);
        System.out.println("Give a boolean:");
        buffer = scan.nextLine();
        Boolean bool = Boolean.valueOf(buffer);
        System.out.println("You gave the string " + str);
        System.out.println("You gave the integer " + value);
        System.out.println("You gave the double " + value_double);
        System.out.println("You gave the boolean " + bool);

    }
}
