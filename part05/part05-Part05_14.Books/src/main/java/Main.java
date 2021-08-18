
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            boolean check;
            check = true;
            System.out.println("Name (empty will stop):");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.println("Publication year:");
            int publicationYear = Integer.valueOf(scanner.nextLine());
            Book book = new Book(name, publicationYear);
            for (Book buffer:books){
                if (buffer.equals(book)){
                    check = false;
                }
            }
                    
            if( check) {
                books.add(new Book(name, publicationYear));
                count++;
            }
        }
        System.out.println("Thank you! Books added: " + books.size());
    }
}