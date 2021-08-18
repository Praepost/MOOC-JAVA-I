/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Timer {
    
    private int hundredths;
    private int seconds;
    private String buffer;
    
    public Timer(){
        this.hundredths = 0;
        this.seconds = 0;
    }
    
    public void advance() {
        this.hundredths = this.hundredths + 1;

        if (this.hundredths >= 100) {
            this.hundredths = 0;
            this.seconds ++;
        }
        if (this.seconds>=60){
            this.seconds = 0;
        }
    }
    
    public String toString(){
        if(seconds<10){
            buffer= "0" + seconds;
        } else {
            buffer = String.valueOf(seconds);
        }
        if(hundredths<10){
            buffer = buffer + ":0" + hundredths;
        }
        else {
            buffer= buffer + ":" + hundredths;
        }
        return this.buffer;
    }
}
