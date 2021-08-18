
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to ");
        int start = scanner.nextInt();
        System.out.println("Where from? ");
        int end = scanner.nextInt();
        while(end<=start){
            System.out.println(end);
            end++;
        }
    }
}