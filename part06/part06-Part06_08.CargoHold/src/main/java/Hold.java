
import java.util.ArrayList;


public class Hold {
    
    private ArrayList<Suitcase> Holds = new ArrayList<>();
    
    private int maxWeight;
    private int count;
    
    public Hold(int initMaxWeight){
        this.maxWeight = initMaxWeight;
        this.count = 0;
    }
    
    public void addSuitcase(Suitcase suitcase){
        if (count+suitcase.totalWeight()<=maxWeight){
            Holds.add(suitcase);
            count += suitcase.totalWeight();
        }
        
    }
    
    public String toString(){
        if (Holds.size()== 0 ) {
            return "no items (0 kg)";
        }
        if (Holds.size()== 1 ) {
            return "1 suitcase ("+ count + " kg)";
        }
        System.out.println(Holds.size());
        return Holds.size() + " suitcases (" + count + " kg)\n";
    }
    
    public int totalWeight(){
        return this.count;
    }
    
    public void printItems(){
        
        
        
        for(Suitcase buffer:Holds){
            buffer.printItems();
        }
    
    
    } 
        
    
}
