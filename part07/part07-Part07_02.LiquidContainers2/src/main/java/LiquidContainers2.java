import java.util.Scanner;
 
public class LiquidContainers2 {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Container first = new Container();
        Container second = new Container();
 
        while (true) {
            
            System.out.println("First: " + first);
            System.out.println("Second: " + second);
            
            String input = scan.nextLine();
            
            if (input.equals("quit")) {
                break;
            }
            
            if (input.equals("add")) {
                int amount = scan.nextInt();
                first.add(amount);
           }
 
            if (input.equals("move")) {
                int amount = scan.nextInt();
                
                if (amount > first.contains()) {
                    amount = first.contains();
                }
                if(second.contains()+amount>100){
                    amount=second.contains()-100;
                }
                
                first.remove(amount);
                second.add(amount);
 
            }
 
            if (input.equals("remove")) {
                int amount = scan.nextInt();
                second.remove(amount);
            }
            
        }
    }
}

