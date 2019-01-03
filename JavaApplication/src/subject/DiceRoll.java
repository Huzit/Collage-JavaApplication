package subject;

import java.util.Random;

public class DiceRoll {
	public int dice1=0, dice2=0;
	private int num=0, mix, result=0;
	
	public DiceRoll(int num) {
		this.num = num;
	}
	public void diceRoll() {
		Random random = new Random();
	
		System.out.println(num+"¹ø ±¼·Á¼­³ª¿Â");
		for(int i=0; i<num; i++) {
			
			dice1=random.nextInt(6)+1;
			dice2=random.nextInt(6)+1;
			
			mix=dice1*dice2;
			System.out.print("("+dice1+","+dice2+") ");
			result+=mix;
		}
		 System.out.println("µéÀÇ °öÀÇ ÃÑÇÕÀº"+result+"ÀÔ´Ï´Ù.");
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
}
