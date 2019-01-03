package subject;

public class DiceDriver {

	public static void main(String[] args) {
		Dice dice = new Dice(6);
		
		dice.volume();
		dice.area();
		
		dice.setLength(10);
		
		dice.volume();
		dice.area();


	}

}
