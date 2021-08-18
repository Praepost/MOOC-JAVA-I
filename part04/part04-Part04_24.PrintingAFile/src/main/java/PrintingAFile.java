
import java.nio.file.Paths;
import java.util.Scanner;



public class PrintingAFile {
    

    public static void main(String[] args) {
        
    try (Scanner input = new Scanner(Paths.get("data.txt"))) {

        // we read the file until all lines have been read
        while (input.hasNextLine()) {
            
            System.out.println(input.nextLine());
        }
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    }
}
