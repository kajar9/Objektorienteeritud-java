/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th3;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Kajar
 * Krediit
 */
public class Alamklass extends Ülemklass {
    
    BigDecimal balance;
    BigDecimal limit;
    
    public Alamklass(){
        balance = new BigDecimal(0.00);
        limit = new BigDecimal(1000.05);
    }
    
    public Alamklass(BigDecimal inbalance){
        balance = inbalance;
        limit = new BigDecimal(1000.05);
    }
    
    public Alamklass(BigDecimal inbalance, BigDecimal credlimit){
        balance = inbalance;
        limit = credlimit;
    }
    
    @Override
    public void payment(BigDecimal a){
        if((balance.add(limit)).subtract(a).compareTo(new BigDecimal(0.00))==-1){
            System.out.println("Krediitkaardil puuduvad vahendid makse tegemiseks!");
            return;
        }
        System.out.println(new DecimalFormat("#0.###").format(a) + " suurune makse Alamklass krediitkaardiga");
        balance = balance.subtract(a);
    }
    
    @Override
    public BigDecimal balance(){
        System.out.println("Krediitkaardi balanss on " + new DecimalFormat("#0.###").format(balance)
        + " Eurot ja makseid on v6imalik teha veel suuruses kuni " + new DecimalFormat("#0.###").format(limit.add(balance)) + " Eurot.");
        return balance.add(limit);
    }
    
}
