/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Song {
    
    private String name;
    private int length;
    public Song(String initName, int InitLength){
        this.name = initName;
        this.length = InitLength;
    }
    public String name(){
        return this.name;
    }
    public int length(){
        return this.length;
    }
    
}
