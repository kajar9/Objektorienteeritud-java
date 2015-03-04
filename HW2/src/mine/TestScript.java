package mine;

import java.util.LinkedList;
import bus.Passanger;

public class TestScript {
    
    private static final myClass myclass = new myClass();
    
    public static void main(String[] args) {

	LinkedList<Passanger> passangers = new LinkedList<>();
	passangers.add(new Passanger("Mari Maasikas", 37,"Tallinn", 12345));
        passangers.add(new Passanger("Varje Vaarikas", 25, "Keila", 56789));
        passangers.add(new Passanger("Siim Sisalik", 5, "Pärnu", 90087));
        passangers.add(new Passanger("Anne Asjalik", 6, "Tallinn", 94433));
        passangers.add(new Passanger("Vilma Vilgas", 42, "Hiiumaa", 783409));
        myclass.processPassangers(passangers);
        
    }

}
