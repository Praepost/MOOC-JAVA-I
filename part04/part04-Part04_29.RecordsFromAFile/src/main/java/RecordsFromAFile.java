
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        try(Scanner input = new Scanner(Paths.get(fileName))){
            while(input.hasNextLine()){
                String line = input.nextLine();
                String [] parts = line.split(",");
                System.out.println(parts[0] + ", age: " + parts[1] + " years");
            }
        } catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
