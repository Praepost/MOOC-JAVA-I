
import java.util.Scanner;

public class LargerThanOrEqualTo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give the first number:");
        Integer first = scan.nextInt();
        System.out.println("Give the second number:");
        Integer second = scan.nextInt();
        if(first!=second) {
            System.out.println("Greater number is: " + Math.max(first,second));
        } else {
            System.out.println("The numbers are equal!");
        }
    }
}
