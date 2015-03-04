/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5;

import java.util.HashMap;

/**
 *
 * @author Kajar
 */
public class Stock {
    
    private HashMap<Item, Integer> items = new HashMap<>();
    
    public void receive(Order order){
        
    }
    
    public void dispatch(Order order){
        
    }
    
    public int getAvailable(Item item){
        if(items.containsKey(item)){
            return items.get(item);
        }
        return 0;
    }
}
