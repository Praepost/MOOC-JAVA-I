
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Which file should have its contents printed?");
        String fileName = String.valueOf(scanner.nextLine());
        
        try (Scanner input = new Scanner(Paths.get(fileName))){
            while (input.hasNextLine()){    
                String text = input.nextLine();
                System.out.println(text);
            } 
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
                
        }
    }
}
