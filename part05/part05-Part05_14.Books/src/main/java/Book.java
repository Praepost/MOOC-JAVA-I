
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    public boolean equals (Object compared){
      // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        } if (!(compared instanceof Book)) {
            return false;
        }
        Book comparedSimpleDate = (Book) compared;

        if (this.name.equals(comparedSimpleDate.name) &&
            this.publicationYear == comparedSimpleDate.publicationYear){
            return true;
        }  
        return false;
    }
}
