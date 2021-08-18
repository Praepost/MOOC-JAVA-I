/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Gift {
    
    private String name;
    private int weight;
    
    public Gift(String initName, int initWeight){
        this.name = initName;
        this.weight = initWeight;
        
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getWeight(){
        return this.weight;
    }
    
    public String toString(){
        String buffer = "";
        buffer+="s name: " + name + "\n" + "Gift's weight: " + weight + "\nGift: " + name + " (" + weight + ")";
        return buffer;
    }
    
}
