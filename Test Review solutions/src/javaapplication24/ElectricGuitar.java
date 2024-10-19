/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication24;
import java.util.ArrayList;
/**
 *
 * @author jmgia
 */
public class ElectricGuitar extends Guitar{ // does electricGuitar inherit anything?
    
    private int volume;
    private ArrayList<String> pedal;
    
    // constructor
    public ElectricGuitar(double price, double weightInOz, int strings, int volume, ArrayList<String> pedal){
        super(price, weightInOz, strings);
        this.volume = volume;
        this.pedal=pedal;
    }
    
    public ElectricGuitar(double price, double weightInOz, int strings, int volume){
        super(price, weightInOz, strings);
        this.volume = volume;
        pedal = new ArrayList<String>();
    }
    
    // methods (uncluding getters and setters)
    
    public int getvolume(){
        return volume;
    }
    
    public void setVolume(int volume){
        this.volume = volume;
    }
    
    public ArrayList<String> getPedal(){
        return pedal;
    }
    
    public void setPedal(ArrayList<String> pedal){
        this.pedal = pedal;
    }
    
    public void addPedal(String pedaltoadd){
        pedal.add(pedaltoadd);
    }
    
    public void addPedal(ArrayList<String> pedals){
        for(String p: pedals){
            pedal.add(p);
        }
        /*for(int i = 0; i< pedals.size(); i++){
            pedal.add(pedals.get(i));
        }*/
    }
    // overridden method called play
    
    @Override
    public void play(){
        System.out.println("Guitar noises but electric");
    }
}
