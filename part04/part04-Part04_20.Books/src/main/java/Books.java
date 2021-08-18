
public class Books {
    
    private String name;
    private int pages;
    private int publicationYear;
    
    public Books(String initName, int initPages, int initPublicationYear){
        this.name = initName;
        this.pages = initPages;
        this.publicationYear = initPublicationYear;
    }
    
    public void everythingOut(){
        System.out.println(name + ", " + pages + " pages, " + publicationYear);
    }
    
    public void nameOut(){
        System.out.println(name);
    }
    
    
}
