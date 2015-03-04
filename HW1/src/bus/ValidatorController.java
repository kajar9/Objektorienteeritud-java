package bus;

public class ValidatorController {

	public static void main(String[] args) {
		Validator validator = new Validator();
		
		// Valideerin
		Passanger passanger1 = new Passanger(1);
		passanger1.setAge(15);
		passanger1.setTown("Türi");
		validator.Validate(passanger1);
		validator.isValidated(passanger1);
		
		// Ei valideeri
		Passanger passanger2 = new Passanger(2);
		passanger2.setAge(25);
		passanger2.setTown("Narva");
		
		validator.isValidated(passanger2);
		
		// Alla 8 aastane Tallinlane
		Passanger passanger3 = new Passanger(3);
		passanger3.setAge(5);
		passanger3.setTown("Tallinn");
		validator.Validate(passanger3);
		validator.isValidated(passanger3);
		
		// Vanem isik Haapsalust
		Passanger passanger4 = new Passanger(4);
		passanger4.setAge(22);
		passanger4.setTown("Haapsalu");
		validator.Validate(passanger4);
		validator.isValidated(passanger4);
		
		// Vanem Tallinnlane
		Passanger passanger5 = new Passanger(5);
		passanger5.setAge(78);
		passanger5.setTown("Tallinn");
		validator.Validate(passanger5);
		validator.isValidated(passanger5);
		
		// Alla 8 aastane
		Passanger passanger6 = new Passanger(6);
		passanger6.setAge(7);
		passanger6.setTown("Põlva");
		validator.Validate(passanger6);
		validator.isValidated(passanger6);
		
		System.out.println("Soitjate arv = " + Passanger.getPassengerCount());
		
	}
}
