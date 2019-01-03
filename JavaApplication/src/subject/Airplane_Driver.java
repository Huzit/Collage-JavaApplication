package subject;

public class Airplane_Driver {

	public static void main(String[] args) {
		Airplane air = new Airplane(300, 3000);
		
		air.distance();
		air.weight();
		
		air.setKillo(10000);
		air.setWeight(700);
		
		air.distance();
		air.weight();

	}

}
