
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean check = false;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        try(Scanner input = new Scanner(Paths.get(file))){
            while(input.hasNext()){
                String fileStrng = input.nextLine();
                if(fileStrng.equals(searchedFor)){
                    check = true;
                    break;
                }
            }
            if(!check){
                System.out.println("Not found.");
            } else {
                System.out.println("Found!");
            }
            
        } catch (Exception e){
            System.out.println("Reading the file nonexistent.txt failed.");
        }

    }
}
