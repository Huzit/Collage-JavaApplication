package subject;

public class Airplane {
	private int man = 0;
	private double killo = 0;

	public Airplane(int man, double killo) {
		this.man = man;
		this.killo = killo;
	}

	public void distance() {
		System.out.println("�̱����� �����Ÿ��� " + (10635 - killo) + "Km �Դϴ�.");
	}

	public void weight() {
		System.out.println("�����ž�°� ���ο��� ���Դ� "+man*62.5+"Kg �Դϴ�.");
	}

	public int getWeight() {
		return man;
	}

	public void setWeight(int weight) {
		this.man = weight;
	}

	public double getKillo() {
		return killo;
	}

	public void setKillo(double killo) {
		this.killo = killo;
	}
}
