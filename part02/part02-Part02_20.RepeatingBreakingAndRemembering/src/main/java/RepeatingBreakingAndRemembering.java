
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        int value = 1;
        int sum = 0;
        int count = 0;
        int even = 0;
        while(value!=-1){
            value = scanner.nextInt();
            if (value==-1) {
                break;
            } 
            if (value%2 == 0){
                even++;
            }
            sum+= value;
            count++;
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + Double.valueOf(sum)/Double.valueOf(count));
        System.out.println("Even: " + even);
        System.out.println("Odd: " + Integer.valueOf(count-even));
    }
}
