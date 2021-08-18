
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        while(true){
            System.out.println("Give a number:");
            int value = scanner.nextInt();
            if (value == 0) {
                break;
            } else if(value>0){ 
                sum+=value;
                count++;
            } else {
                continue;
            }
        }
        if (sum>0){
            System.out.println("Average of the numbers: " + Double.valueOf(sum)/Double.valueOf(count));
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}