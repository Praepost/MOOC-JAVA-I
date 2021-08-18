
import java.util.Scanner;

public class Story {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("I will tell you a story, but I need some information first.\n" +
"What is the main character called?");
        String msg_1 = scanner.nextLine();
        //System.out.println(msg_1);
        System.out.println("What is their job?");
        String msg_2 = scanner.nextLine();
        //System.out.println(msg_2);
        System.out.println("Here is the story:\n" + "Once upon a time there was "+ msg_1 + ", who was " + msg_2 + ".\n" + "On the way to work, "+ msg_1 +  " reflected on life.\n Perhaps "+ msg_1 + " will not be " + msg_2 + " forever.");

    }
}
