
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String buffer = scanner.nextLine();
            if (buffer.equals("end")){
                break;
            }
            
            int number = Integer.valueOf(buffer);
            System.out.println(number*number*number);
        }
    }
}
