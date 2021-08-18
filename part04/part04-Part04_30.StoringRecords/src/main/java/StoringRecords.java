
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class StoringRecords {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();
        try (Scanner fileInput = new Scanner(Paths.get(file))){
            while(fileInput.hasNext()){
            String line = fileInput.nextLine();
            String [] lineArray = line.split(",");
            persons.add(new Person(lineArray[0], Integer.valueOf(lineArray[1])));
            }
            
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return persons;

    }
}
