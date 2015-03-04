
import java.math.BigDecimal;
import java.util.LinkedList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kajar
 */
public class BankTest {
     
    private static LinkedList<Person> list = new LinkedList<>();
    
    public static void main(String[] args) {
        for(int i=0;i<15;i++){
            Person p = BankClientGateway.getPerson(i);
                list.add(p);
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i).getCredit()!=null){
            list.get(i).getCredit().payment(new BigDecimal(15.15));}
            list.get(i).getDebit().payment(new BigDecimal(25.25));
        }
    }
    
}
