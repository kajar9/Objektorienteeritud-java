/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th3;

import java.math.BigDecimal;
import java.util.LinkedList;

/**
 *
 * @author Kajar
 */
public class PaymentProcessor {
    
    public PaymentProcessor(){
        
    }
    
    public void payment(LinkedList<Ülemklass> list){
        
        for(int i=0;i<list.size();i++){
            System.out.println("--- Kaart #" + (i+1) + " ---");
            list.get(i).balance();
            System.out.println("Proovin 13,45 Euro suurust makset...");
            list.get(i).payment(new BigDecimal(13.45));
            list.get(i).balance();
            System.out.println("\n");
        }
    }
}
