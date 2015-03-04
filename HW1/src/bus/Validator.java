package bus;

import java.util.LinkedList;

public class Validator {

	public LinkedList<Passanger> ValPassangers;
	
	public Validator(){
		ValPassangers = new LinkedList<Passanger>();
	}
	
	public void Validate(Passanger passanger){
		if(passanger.getAge()>=0&&passanger.getAge()<8||
		passanger.getTown().toLowerCase().equals("tallinn")||
		(passanger.getTown().toLowerCase().equals("hiiumaa")))
		ValPassangers.add(passanger);
	}
	
	public boolean isValidated(Passanger passanger){
		if(ValPassangers.contains(passanger)){
			System.out.println("Soitja ID-ga \"" +
			passanger.getCode() + 
			"\" on valideeritud");
			return true; 	
		}
		return false;
	}

}
