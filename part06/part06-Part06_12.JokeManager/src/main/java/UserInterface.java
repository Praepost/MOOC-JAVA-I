
import java.util.Scanner;

public class UserInterface {
    
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager initManager, Scanner initScanner){
        this.manager = initManager;
        this.scanner = initScanner;
    }
    
    public void start(){
        System.out.println("What a joke!");
        while (true) {
            System.out.println("Commands:");
            System.out.println(" 1 - add a joke");
            System.out.println(" 2 - draw a joke");
            System.out.println(" 3 - list jokes");
            System.out.println(" X - stop");
            
            String command = scanner.nextLine();
            
            if (command.equals("X")) {
                break;
                
            } else if (command.equals("1")) {
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                manager.addJoke(joke);            
                //break;
                
            } else if (command.equals("2")) {
                System.out.println("Drawing a joke.");
                System.out.println(manager.drawJoke());
                
            } else if (command.equals("3")) {
                manager.printJokes();
            }
        }
    }
    
}
