
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give a word");
        String buffer = scanner.nextLine();
        System.out.println("");
        for(int i=0;i<3;i++){
            System.out.print(buffer);
        }
    }
}
