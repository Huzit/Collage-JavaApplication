package decoratorPattern;

public abstract class Condiment extends Cafe{
	Cafe cafe;
	
	public String getName() {
		return cafe.getName()+name;
	}
}
