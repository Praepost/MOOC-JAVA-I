
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Stack {
    
    private ArrayList<String> stack ;
    
    public Stack(){
        
        this.stack = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        
        return stack.isEmpty();
        
    }
    
    public void add(String value){
        
        stack.add(value);
    }
    
    public ArrayList<String> values() {
        
        return stack;
        
    }
    
    public String take(){
        String buffer = stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return buffer;
    }
}
