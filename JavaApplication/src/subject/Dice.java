package subject;

public class Dice {
	private int length = 0;
	
	public Dice(int length) {
		this.length = length;
	}
	
	public void volume() {
		System.out.println("�ֻ����� ���Ǵ� "+Math.pow(length, 3)+"�Դϴ�.");
	}
	
	public void area() {
		System.out.println("�ֻ��� �� ���� ���̴� "+length*length+"�̰� ������ ���̴�  "+length*length*6+"�Դϴ�.");
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
