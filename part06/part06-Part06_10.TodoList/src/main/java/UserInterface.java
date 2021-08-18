
import java.util.Scanner;

public class UserInterface {
    
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner){
        this.list = list;
        this.scanner = scanner;
    }

    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("add")){
                System.out.print("Task: ");
                String word = scanner.nextLine();
                this.list.add(word);
                System.out.println("");
            } else if (input.equals("remove")){
                System.out.print("Which one is removed? ");
                String word = scanner.nextLine();
                this.list.remove(Integer.valueOf(word));
                System.out.println("");
            } else if (input.equals("list")){
                this.list.print();
            } else if (input.equals("stop")){
                break;
            }
        }
    }
    
    
    
}
