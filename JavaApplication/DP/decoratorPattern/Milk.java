package decoratorPattern;

public class Milk extends Condiment{
	
	public Milk(Cafe cafe) {
		this.cafe = cafe;
		name = "우유, ";
	}
	
	public double price() {
		return cafe.price() + 500;
	}
}
