package subject;

public class Dice {
	private int length = 0;
	
	public Dice(int length) {
		this.length = length;
	}
	
	public void volume() {
		System.out.println("주사위의 부피는 "+Math.pow(length, 3)+"입니다.");
	}
	
	public void area() {
		System.out.println("주사위 각 면의 넓이는 "+length*length+"이고 모든면의 넓이는  "+length*length*6+"입니다.");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
