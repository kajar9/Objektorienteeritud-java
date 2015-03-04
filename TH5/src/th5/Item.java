/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5;

/**
 *
 * @author Kajar
 */
public class Item {
    
    private String nimetus;
    private double hind;
    
    public Item(String name, double price){
        nimetus = name;
        hind = price;
    }
    
    
    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Item)){
            return false;
        }
        Item it =  (Item) obj;
        
        return nimetus.equals(it.nimetus) && hind == it.hind;
    }
    
    @Override
    public int hashCode(){
        return nimetus.hashCode()*(int)(hind*37);
    }
}
