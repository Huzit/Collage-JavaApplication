package subject;

public class DiceRollDriver {

	public static void main(String[] args) {
		DiceRoll diceRoll = new DiceRoll(2);
		diceRoll.diceRoll();
		
		diceRoll.setNum(6);
		
		diceRoll.diceRoll();
	}

}
