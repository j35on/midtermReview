/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication24;
import java.util.ArrayList;
/**
 *
 * @author jmgia
 */
public class JavaApplication24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> pedals = new ArrayList<>();
        pedals.add("pedal 1");
        ArrayList<Instrument> instruments = new ArrayList<>();
        instruments.add(new Guitar(2.2,2.4,4));
        instruments.add(new Piano(4.4,5.2,9));
        instruments.add(new ElectricGuitar(4.3,5.7,3,4));
        instruments.add(new ElectricGuitar(4.1,3.2,9, 5,pedals));
        instruments.add(new Instrument(4,3));
        
        for(Instrument i: instruments){
            i.play();
            
        }
        
    }
    
}
