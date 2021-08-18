
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        System.out.print("Seatch for?");
        String search = scanner.nextLine();
        Boolean check = false;
        for(String buffer:list)
        {
            if (buffer.equals(search)){
                System.out.println(buffer + "was found!");
                check = true;
            }
        }
        if(!check) {
            System.out.println(search + "was not found!");
        }
    }
}
