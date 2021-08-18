
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
    
    public String longest(){
        String word = "";
        int count=0;
        if(elements.isEmpty()){
            return null;
        } else {
            for(String buffer:elements){
                if(count<buffer.length()){
                    count = buffer.length();
                    word = buffer;
                }
            }
        }
        return word;
    }

}
