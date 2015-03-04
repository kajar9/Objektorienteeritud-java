
public class RealiseerivNaide implements KokkuLepe {
	
	private TeistTyypiObjekt o = new TeistTyypiObjekt();
	
	@Override
	public void printSomethingOut(){
		System.out.println("midagi");
		o.mingimeetod();
	}
}
