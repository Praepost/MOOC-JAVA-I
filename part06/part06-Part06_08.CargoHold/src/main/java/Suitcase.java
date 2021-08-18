
import java.util.ArrayList;

public class Suitcase {
    
    private ArrayList<Item> items = new ArrayList<>();
    private int maxWeight;
    private int count;
    
    public Suitcase(int initMaxWeight){
        
        this.maxWeight = initMaxWeight;
        this.count = 0;
        
    }
    
    public void addItem(Item item){
        
        if (count+item.getWeight()<=maxWeight){
            items.add(item);
            count += item.getWeight();
        }
        
    }
    
    public String toString(){
        if (items.isEmpty() ) {
            return "no items (0 kg)";
        } if(items.size()== 1 ){
        return items.size() + " item (" + this.count + " kg)\n";
        }
        return items.size() + " items (" + this.count + " kg)\n";
    }
    
    public void printItems(){
        
        for(Item buffer:items){
            System.out.println(buffer);
        }
    }    
    
    public int totalWeight(){
        return this.count;
    }
    
    public Item heaviestItem(){
        int counter = -1;
        int max = -1;
        for(int i=0;i<items.size();i++){
            if(items.get(i).getWeight()>max){
                max = items.get(i).getWeight();
                counter = i;
            }
        }
        if (counter == -1){
            return null;
        }
        return items.get(counter);
    }
    
         
}
