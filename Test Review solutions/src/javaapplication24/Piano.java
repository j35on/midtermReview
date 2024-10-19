/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;

/**
 *
 * @author jmgia
 */
public class Piano extends Instrument{
    private int numkeys;
    
    public Piano(double price, double weightInOz, int numkeys){
        super(price,weightInOz);
        this.numkeys = numkeys;
    }
    
    public int getKeys(){
        return numkeys;
    }
    public void setKeys(int keys){
        this.numkeys = keys;
    }
    
    @Override
    public void play(){
        System.out.println("piano noises");
    }
}
