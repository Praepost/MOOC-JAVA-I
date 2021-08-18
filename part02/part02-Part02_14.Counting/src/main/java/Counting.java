
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int count = 0;
        while(value>=count){
            System.out.println(count);
            count++;
        }
    }
}
