
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number:");
        Integer value = scan.nextInt();
        if((value%2)==0) {
            System.out.println("Number " + value + " is even.");
        } else {
            System.out.println("Number " + value + " is odd.");
        }
    }
}