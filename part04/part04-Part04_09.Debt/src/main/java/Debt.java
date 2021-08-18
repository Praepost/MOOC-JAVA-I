/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Debt {
    
    private double Balance;
    private double InterestRate;
    
    public Debt(double initialBalance, double initialInterestRate){
        this.Balance = initialBalance;
        this.InterestRate = initialInterestRate;
    }
    public void printBalance(){
        System.out.println(this.Balance);
    }
     public void waitOneYear(){
         this.Balance*=this.InterestRate;
     }
}
