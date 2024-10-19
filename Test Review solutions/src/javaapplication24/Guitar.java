/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author jmgia
 */
public class Guitar extends Instrument{ // does guitar inherit anything?
    private int numStrings;
    
    
    // constructor
    public Guitar(double price, double weightInOz, int numStrings){
        super(price,weightInOz);
        this.numStrings =numStrings;
    }
    
    public int getNumStrings(){
        return numStrings;
        
    }
    public void setNumStrings(int strings){
        this.numStrings = strings;
    }
    
    @Override
    public void play(){
        System.out.println("Guitar noises");
    }
    
}
