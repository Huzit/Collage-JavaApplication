package subject;

public class RefrigeratorDriver {

	public static void main(String[] args) {
		Refrigerator ref = new Refrigerator(20);
		
		ref.Check();
		
		ref.setTemperature(0);
		
		ref.Check();

	}

}
