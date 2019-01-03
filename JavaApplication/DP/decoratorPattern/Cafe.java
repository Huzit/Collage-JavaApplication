package decoratorPattern;

public abstract class Cafe {
	String name="";
	
	public String getName() {
		return name;
	}
	
	public abstract double price();
}
