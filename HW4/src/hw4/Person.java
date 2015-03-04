/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.math.BigDecimal;
import java.util.Optional;
import scoring.Scoring;

/**
 *
 * @author Kajar
 */
class Person {

    private Ülemklass debit;
    private Alamklass credit;
    private int id;
    
    Person(int idCode) {
        debit = new Ülemklass(new BigDecimal(1000.00));
        id = idCode;
        
        BigDecimal limit = Scoring.getMaxCreditLimit(idCode);
        if(limit.compareTo(BigDecimal.ZERO)>0){
            credit = new Alamklass(BigDecimal.ZERO,limit);
        }
        
    }

    int getId() {
        return id;
    }
    
    Ülemklass getdebit(){
        return debit;
    }
    
    Alamklass getcredit(){
        return credit;
    }
    
    public Optional<Alamklass> getOptCredit() {
    	 if (credit != null) {
            return Optional.of(credit);
    	 }
    	return Optional.empty();
    }
    
}
