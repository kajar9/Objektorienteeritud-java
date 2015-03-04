package bus;

public class Passanger {

	private int ID;
	private int age;
	private static int PassangerCount;
	private String town;
	
	public Passanger(int id){
		ID = id;
		town = "";
		age = -1;
		PassangerCount++;
	}
	
	public int getCode(){
		return ID;
	}
	
	public static int getPassengerCount(){
		return PassangerCount;
	}
	
	public void setTown(String htown){
		town = htown;
	}
	
	public String getTown(){
		return town;
	}
	
	public void setAge(int vanus){
		age = vanus;
	}
	
	public int getAge(){
		return age;
	}
	

}
