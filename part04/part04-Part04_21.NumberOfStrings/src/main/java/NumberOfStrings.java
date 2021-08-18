
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (true){
            String buffer = input.nextLine();
            if (buffer.equals("end")){
                break;
            }
            count++;
        }
        
        System.out.println(count);
    }
}
