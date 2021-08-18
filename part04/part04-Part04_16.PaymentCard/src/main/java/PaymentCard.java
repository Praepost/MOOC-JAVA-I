/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class PaymentCard {
    
    private double balance;
    
    public void addMoney(double amount){
        if(amount>0){
            if(this.balance + amount > 150){
                this.balance = 150;
            } else {
                this.balance += amount;
            }            
        }
    }
    
    public void eatAffordably(){
        if(this.balance - 2.60 >= 0)
        {
            this.balance -= 2.60;
        }
    }
    
    public void eatHeartily() {
        if(this.balance - 4.60 >= 0){
            this.balance -= 4.60;
        } 
    }
    
    public PaymentCard(double initBalance){
        this.balance = initBalance;
    }
    
    public String toString(){
        return ("The card has a balance of "+ balance +" euros");
    }
    
}
