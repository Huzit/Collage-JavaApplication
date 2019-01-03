package decoratorPattern;

public class Cream extends Condiment{
	
	public Cream(Cafe cafe) {
		this.cafe = cafe;
		name="라떼, ";
	}
	
	public double price() {
		return cafe.price() + 500;
	}

}
