
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String str = scanner.nextLine();
            String[] arr = str.split(" ");
            System.out.println(arr[arr.length-1]);
        }

    }
}
