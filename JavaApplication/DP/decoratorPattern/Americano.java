package decoratorPattern;

public class Americano extends Cafe{
	public Americano() {
		name = "아메리카노, ";
	}
	
	public double price() {
		return 2500;
	}
}
