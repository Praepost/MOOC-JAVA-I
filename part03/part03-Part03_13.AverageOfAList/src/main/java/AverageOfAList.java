
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }
        for(int i:list){
            sum+=i;
            count++;
        }
        System.out.println("Sum: " + Double.valueOf(sum)/Double.valueOf(count));
        // toteuta listan lukujen summan laskeminen tänne
    }
}

