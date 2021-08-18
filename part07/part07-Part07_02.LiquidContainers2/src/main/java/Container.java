
public class Container {
    
    private int count;
    public Container( ){
        this.count = 0;  
    }
    
    public int contains(){
        return count;
    }
    
    public void add(int amount){
        if(amount<0 ){
            amount = 0;
        }
        if(count+amount>100){
            amount=100-count;
        } 
        count+=amount;
    }
    
    public void remove(int amount){
        if(amount<0 ){
            amount = 0;
        }
        count -= amount;
        if (count<0) {
            count = 0;
        }
    }
 
    @Override
    public String toString(){
        return (count + "/100");
        }
}
