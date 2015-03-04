/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;

/**
 *
 * @author Kajar
 * Deebet
 */
public class Ülemklass {
    
    private BigDecimal balance;
    
    public Ülemklass(){
        balance = new BigDecimal(0.00);
    }
    
    public Ülemklass(BigDecimal a){
        balance = a;
    }
    
    public void payment(BigDecimal a){
        
        if(balance.subtract(a).compareTo(new BigDecimal(0.00))==-1){
            System.out.println("Pangakaardil puuduvad vahendid makse tegemiseks!");
            return;
        }
        System.out.println(new DecimalFormat("#0.###").format(a) + " suurune makse Ülemklass deebetkaardiga");
        balance = balance.subtract(a);
    }
    public BigDecimal balance(){
        System.out.println("Pangakaardil arvel on " + new DecimalFormat("#0.###").format(balance) + " Eurot.");
        return balance;
    }
    
    public BigDecimal balance(Calendar c){
        System.out.println("Deebetkaardi balanss Ülemklassist kalender sisendiga");
        return new BigDecimal(133.331);
    }
}
