/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author K.Dmitriy
 */
public class Product {
    
    private String name;
    private double Priece;
    private int Quantity;
    
    public Product (String initialName, double initialPrice, int initialQuantity){
        this.name = initialName;
        this.Priece = initialPrice;
        this.Quantity = initialQuantity;
    }
    public void printProduct(){
        System.out.println(name + ", price " + Priece + ", " + Quantity + "pcs");
    }
}
