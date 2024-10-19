/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author jmgia
 */
public class Instrument { 
    //attributes
    private double price;
    private double weightInOz;
    
    // constructor
    public Instrument(double price, double weightInOz){
        this.price = price;
        this.weightInOz = weightInOz;
    }
    // methods (uncluding getters and setters)
    
    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price= price;
    }
    
    public double getWeightInOz(){
        return weightInOz;
    }
    
    public void setWeightInOz(double weight){
        this.weightInOz = weight;
    }
    
    public void play(){
        System.out.println("Bonk");
    }
}
