
import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;
    
    public Room() {
        this.room = new ArrayList<>();
    }
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        return this.room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return this.room;
    }
    
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person pers = this.room.get(0);
        for (Person p: this.room) {
            if (pers.getHeight() > p.getHeight()) {
                pers = p;
            }
            System.out.println("");
        }
        return pers;
    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortest = new Person(this.shortest().getName(), this.shortest().getHeight());
        this.room.remove(this.shortest());
        return shortest;
    }
}

