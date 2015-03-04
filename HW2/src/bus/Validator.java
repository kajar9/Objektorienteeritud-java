package bus;

import java.util.LinkedList;

public class Validator implements ValidatorService {

	private final LinkedList<Integer> valPassangers;
	
	public Validator(){
		valPassangers = new LinkedList<>();
	}
        
        @Override
        public void validate(int ID){
            valPassangers.add(ID);
            System.out.println("Soitja ID-ga \"" + ID + "\" on valideeritud");
        }
	
	@Override
	public boolean isValidated(int ID) {
		return valPassangers.contains(ID);
	}


}
