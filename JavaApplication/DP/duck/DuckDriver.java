package duck;

public class DuckDriver {
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.fly();
		
		duck = new RedHeadDuck();
		duck.fly();
	}
}
