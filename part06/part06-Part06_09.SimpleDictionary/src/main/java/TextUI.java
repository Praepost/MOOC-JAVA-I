
import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dictionary = dict;
    }
    
    public void start() {
        while(true) {
            System.out.print("Command: ");
            String com = this.scanner.nextLine();
            if (com.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (com.equals("add")) {
                System.out.print("Word: ");
                String word = this.scanner.nextLine();
                System.out.println("Translation: ");
                String trans = this.scanner.nextLine();
                this.dictionary.add(word, trans);
                
            } else if (com.equals("search")) {
                System.out.print("To be translated: ");
                String word = this.scanner.nextLine();
                String res = this.dictionary.translate(word);
                if (res == null) {
                    System.out.println("Word " + word + " was not found");
                } else {
                    System.out.println("Translation: " + res);
                }
            } else {
                System.out.println("Unknown command");
            }
            
        }
    }
    
    
}
 