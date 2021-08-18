
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int count = 100;
        while(value<=count){
            System.out.println(value);
            value++;
        }
    }
}

