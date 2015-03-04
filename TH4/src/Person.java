
import java.math.BigDecimal;
import th3.Alamklass;
import th3.Ülemklass;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kajar
 */
class Person {
    private Alamklass credit;
    private Ülemklass debit;
    private BigDecimal creditlimit;
    
    //Siia tehke konstruktor
    public Person(int i){
        creditlimit = scoring.Scoring.getMaxCreditLimit(i);
        if(creditlimit.compareTo(BigDecimal.ZERO)>0){
            credit = new Alamklass(BigDecimal.ZERO,creditlimit);
        }
        debit = new Ülemklass();
    }
    
    public Alamklass getCredit(){
        return credit;
    }
    
    public Ülemklass getDebit(){
        return debit;
    }
    
}
