package mine;

import bus.Passanger;
import bus.Validator;
import bus.ValidatorService;
import java.util.LinkedList;

/**
 *
 * @author Kajar
 */
public class myClass implements myService {

    private final ValidatorService validator;
    
    public myClass(){
        validator = new Validator();
    }
    
    @Override
    public boolean hasNext(LinkedList<Passanger> passangers) {
        return !passangers.isEmpty();
    }

    @Override
    public void processPassangers(LinkedList<Passanger> passangers) {
        while(hasNext(passangers)){
            Passanger passanger = passangers.pollFirst();
            
            if(passanger.getAge()>=1&&passanger.getAge()<=8){
               validator.validate(passanger.getId());continue;}
            
            if(passanger.getTown().toLowerCase().equals("tallinn")||
               passanger.getTown().toLowerCase().equals("hiiumaa"))
               validator.validate(passanger.getId());
            
        }
    }
    
}
