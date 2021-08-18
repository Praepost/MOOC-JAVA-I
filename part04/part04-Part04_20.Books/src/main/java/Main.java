import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Books> Book = new ArrayList<>();
        
        while(true){
            System.out.println("Title: ");
            String name = input.nextLine();
                if(name.equals("")){
                    break;
                }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(input.nextLine());
            System.out.println("Publication year: ");
            int publicationYear = Integer.valueOf(input.nextLine());
            Book.add(new Books(name,pages,publicationYear));
        }
        
        System.out.println("What information will be printed? ");
        String way = input.nextLine();
        if(way.equals("everything")){
            for(Books buffer:Book){
                buffer.everythingOut();
            }
        } else if(way.equals("name")){
            for(Books buffer:Book){
                buffer.nameOut();
            }
        }

    }
}
