/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

/**
 *
 * @author Kajar
 */
public class HW4 {
    public static void main(String[] args) {
        BankClientGateway bank = new BankClientGateway();
        for (int i = 0; i < 15; i++) {
            bank.getPerson(i).ifPresent(p -> {
                payment(p.getdebit(),new BigDecimal(128.64));
                    if(p.getcredit() != null){
                        p.getcredit().payment(new BigDecimal(256.128)); //credit makse
                    }
                    Optional<Alamklass> opcred = p.getOptCredit(); 
                    if(opcred.isPresent()){
                        opcred.get().payment(new BigDecimal(512.256)); //credit makse optionaliga
                    }
                }
            );  
        }
        
        ArrayList<Person> list = bank.getPersons();
        for(int i=0;i<list.size();i++){
            list.get(i).getdebit().balance();
            if(list.get(i).getcredit() != null){
                list.get(i).getcredit().balance();
            }
        }
    }

    private static void payment(Ülemklass card, BigDecimal a) {
        card.payment(a);
    }
}
