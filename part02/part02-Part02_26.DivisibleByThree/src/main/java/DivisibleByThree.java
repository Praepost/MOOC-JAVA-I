
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        divisibleByThreeInRange(begin, end);

    }
    public static void divisibleByThreeInRange(int beginning, int end){
        for(int i = beginning; i<=end; i++){
            if (i%3 == 0) {
                System.out.println(i);
            }
        }
    }
}
