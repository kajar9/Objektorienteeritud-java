/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Kajar
 */
class Order {

    protected int serial;
    protected List<Item> list;
    protected static int counter;
    protected HashMap<Item, Integer> rows = new HashMap<>();
    
    public Order(){
        serial = counter++;
    }
    
    public boolean add(Item item, int amount) {
        if(amount<=0)return false;
        if(rows.containsKey(item)){
            Integer n = rows.get(item);
            amount +=n;
        }
        rows.put(item, amount);
        
        return true;
    }
    
    /*
        for(Map.Entry<Item, Integer> entry: rows.entrySet()){
            Item key= entry.getKey();
            Integer value = entry.getValue(); 
        }
    */
    
}
