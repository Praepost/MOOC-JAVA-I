
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How old are you?");
        Integer old = scan.nextInt();
        if((old>=0)&&(old<=120)) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible!");
        }
    }
}
