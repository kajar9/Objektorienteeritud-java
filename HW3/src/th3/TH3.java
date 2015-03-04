/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th3;

import java.math.BigDecimal;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.LinkedList;

/**
 *
 * @author Kajar
 */
public class TH3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Ülemklass> list = new LinkedList<>();
        
        /*
        Ülemklass y = new Ülemklass(new BigDecimal(500.002));
        Alamklass a = new Alamklass(new BigDecimal(500.002));
        Alamklass b = new Alamklass();
        Alamklass c = new Alamklass(new BigDecimal(500.002), new BigDecimal(500));
        y.payment(new BigDecimal(12.34));
        a.payment(new BigDecimal(56.78));
        b.payment(new BigDecimal(91.23));
        y.balance();
        a.balance();
        b.balance();
        Calendar cal = new GregorianCalendar();
        y.balance(cal);
        c.balance();
        list.add(y);
        list.add(a);
        list.add(b);
        list.add(c);
        list.add(new Alamklass(new BigDecimal(91.23)));
        
        */
        
        list.add(new Ülemklass());
        list.add(new Ülemklass(new BigDecimal(123.45)));
        list.add(new Ülemklass(new BigDecimal(13.45)));
        list.add(new Ülemklass(new BigDecimal(10.00)));
        list.add(new Alamklass());
        list.add(new Alamklass(new BigDecimal(123.45)));
        list.add(new Alamklass(new BigDecimal(-3000.45)));
        list.add(new Alamklass(new BigDecimal(13.45)));
        list.add(new Alamklass(new BigDecimal(0.45),new BigDecimal(13.00)));
        list.add(new Alamklass(new BigDecimal(0.01),new BigDecimal(13.00)));
        LimitedAlamklass b = new LimitedAlamklass(new BigDecimal(150.0));
        list.add(b);
        
        PaymentProcessor pp = new PaymentProcessor();
        pp.payment(list);
        
        System.out.println("Proovin 123,45 Euro suurust makset piiratud krediitkaardiga...");
        b.payment(new BigDecimal(123.45));
        
    }
    
}
