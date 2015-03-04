package bus;

public class Passanger {
	private final String name;
	private final int age;
	private final String town;
	private final int id;
	
	public Passanger(String pName, int pAge, String pTown, int pId){
		name = pName;
		age = pAge;
		town = pTown;
		id = pId;
	}
	
	public int getAge(){
		return age;
	}
	
	public int getId(){
		return id;
	}
	
	public String getTown(){
		return town;
	}
}
