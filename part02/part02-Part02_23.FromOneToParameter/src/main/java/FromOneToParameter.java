
import java.util.Scanner;

public class FromOneToParameter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printUntilNumber(scanner.nextInt());
    }
    
    public static void printUntilNumber(int value) {
        for(int i=0;i<value;i++) {
            System.out.println(i+1);
        }
    } 

}
