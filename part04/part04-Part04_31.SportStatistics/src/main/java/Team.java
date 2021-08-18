/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Team {
    private String name;
    private int wins;
    private int loses;
    private int countGames;
    private int count;
    
    
    public Team (String initName){
        this.name = initName;
        this.wins = 0;
        this.loses = 0;
        this.count = 0;
        this.countGames = 0;
        
    }    
    
    public void counter (){
        this.count++;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void counterWins(){
        this.wins++;
    }
    
    public void counterLoses(){
        this.loses++;
    }
    
    public int getGames(){
        return this.wins+this.loses;
    }
    
    public int getWins(){
        return this.wins;
    }
        
    public int getLosese(){
        return this.loses;
    }
    
    
    
    
}
