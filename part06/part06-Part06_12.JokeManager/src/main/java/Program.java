
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        JokeManager manager = new JokeManager();
        
        UserInterface interfaces = new UserInterface(manager, scanner);
        interfaces.start();
    }
}

