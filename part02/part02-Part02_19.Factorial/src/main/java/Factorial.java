
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int end = scanner.nextInt();
        int sum = 1;
        for (int i=1;i<=end;i++){
            sum*=i;
        }
        System.out.println("The sum is " + sum);
    }
}

