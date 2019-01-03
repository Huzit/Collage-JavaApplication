package decoratorPattern;

public class Espresso extends Cafe{
	
	public Espresso(){
		name="에스프레소, ";
	}
	
	@Override
	public double price() {
		return 2000;
	}
}
