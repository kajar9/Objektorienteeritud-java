/*
 * krediitkaart 50 eurose makselimiidiga
 */
package th3;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 *
 * @author Kajar
 */
public class LimitedAlamklass extends Alamklass {
    
    public LimitedAlamklass(){
        balance = new BigDecimal(0.00);
        limit = new BigDecimal(1000.05);
    }
    
    public LimitedAlamklass(BigDecimal inbalance){
        balance = inbalance;
        limit = new BigDecimal(1000.05);
    }
    
    public LimitedAlamklass(BigDecimal inbalance, BigDecimal credlimit){
        balance = inbalance;
        limit = credlimit;
    }
    
    @Override
    public void payment(BigDecimal a){
        
        if(a.compareTo(new BigDecimal(50.00))==1){
            System.out.println("Piiratud Krediitkaardiga ei saa teha makseid yle 50.00 Euro");
            return;
        }
        
        if((balance.add(limit)).subtract(a).compareTo(new BigDecimal(0.00))==-1){
            System.out.println("Piiratud Krediitkaardil puuduvad vahendid makse tegemiseks!");
            return;
        }
        System.out.println(new DecimalFormat("#0.###").format(a) + " suurune makse Alamklass piiratud krediitkaardiga");
        balance = balance.subtract(a);
    }
}
