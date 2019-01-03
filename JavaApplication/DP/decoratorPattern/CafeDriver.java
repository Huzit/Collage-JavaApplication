package decoratorPattern;

public class CafeDriver {

	public static void main(String[] args) {
		Cafe order = new Americano();
		order = new Milk(order);
		order = new Cream(order);
		order = new Cream(order);
		order = new shot(order);
		
		System.out.println(order.getName() + ": " + order.price());
	}

}
