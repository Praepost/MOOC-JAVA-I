
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] password = {"sunshine", "haskell"};
        System.out.print("Enter username: ");
        String login = scanner.nextLine();
        System.out.println("");
        System.out.print("Enter password: ");
        String pass = scanner.nextLine();
        System.out.println("");
        if(login.equals("alex")){
            if (pass.equals(password[0])){
                System.out.println("You have successfully logged in!");
            } else {
                System.out.println("Incorrect username or password!");
            }
                    
        } else if (login.equals("emma")){
            {
                if(pass.equals(password[1])){
                System.out.println("You have successfully logged in!");
                } else {
                System.out.println("Incorrect username or password!");
                }
            }
        } else {
                System.out.println("Incorrect username or password!");
                }
    }
}
