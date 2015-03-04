package mine;

import bus.Passanger;
import java.util.LinkedList;

public interface myService {
	public boolean hasNext(LinkedList<Passanger> passangers);
        public void processPassangers(LinkedList<Passanger> passangers);
}
