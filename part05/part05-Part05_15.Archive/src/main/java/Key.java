
 
public class Key {
    private String identifier;
    private String name;
 
    public Key(String identifier, String name){
        this.identifier = identifier;
        this.name = name;
    }
 
    public Key(String identifier){
        this.identifier = identifier;
    }
 
    public String toString(){
        return this.identifier + ": " + this.name;
    }
 
    @Override
    public boolean equals(Object compared){
        if(this == compared){
            return true;
        }
 
        if(!(compared instanceof Key)){
            return false;
        }
 
        Key comparedItem = (Key) compared;
 
        if(this.identifier.equals(comparedItem.identifier)){
            return true;
        }
 
        return false;
    }
}