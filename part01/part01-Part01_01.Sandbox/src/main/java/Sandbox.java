
import java.util.Scanner;

public class Sandbox{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Write a message:");
        int msg = Integer.valueOf(scanner.nextLine());
        String msg1 = scanner.nextLine();
        if(msg==0) {
            System.out.println(msg1);
        } else {
            System.out.println(msg);
        }

    }
}