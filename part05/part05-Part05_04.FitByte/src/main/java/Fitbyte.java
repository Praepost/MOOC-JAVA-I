/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Fitbyte {
    
    private int age;
    private int restingHeartRate;
    
    public Fitbyte(int age, int restingHeartRate){
        this.age = age;
        this.restingHeartRate = restingHeartRate;
    }
    
    
    public double targetHeartRate(double percentageOfMaximum){
        return  ((maximunHeartRate()-restingHeartRate) * (percentageOfMaximum) + restingHeartRate);
    }
    
    public double maximunHeartRate(){
        return 206.3 - (0.711 * this.age);
    }
}
