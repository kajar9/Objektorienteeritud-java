/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Kajar
 */
public class TH5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Item i1 = new Item("Leib", 0.95);
        Item i2 = new Item("Piim", 0.55);
        Item i3 = new Item("Leib", 0.95);
        Item i4 = new Item("Leib", 0.69);
        
        Order receipt = new Order();
        receipt.add(i1,1);
        receipt.add(i2,5);
        receipt.add(i3,2);
        receipt.add(i4,4);
        
        Set <Item>  itemSet = new HashSet<Item>();
        
    }
    
}
