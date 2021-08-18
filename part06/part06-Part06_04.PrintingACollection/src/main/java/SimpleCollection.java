
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }
    
    public String toString(){
        String result= "";
        if(elements.isEmpty()){
            return "The collection " + name + " is empty.";
        }
        for (String buffer:elements){
            result+=buffer+"\n";
        }
        result = result.substring(0, result.length()-1);
        if (elements.size()==1){
             return "The collection " + name + " has " + elements.size() + " element:\n" + result;
        } else {
            return "The collection " + name + " has " + elements.size() + " elements:\n" + result;
        }
    }
    
}
