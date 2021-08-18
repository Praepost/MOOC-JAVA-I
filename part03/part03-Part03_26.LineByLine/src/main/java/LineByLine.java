
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String text = scanner.nextLine();
            split(text);
        }
    }

    public static void split(String text) {
        String[] pieces = text.split(" ");
        for (String buffer:pieces) {
            System.out.println(buffer);
        }
    }
}