
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String text = scanner.nextLine();
            String[] arr = text.split(" ");
            for(String buffer:arr){
                if (buffer.contains("av")) {
                    System.out.println(buffer);
                }
            }
        }

    }
}
