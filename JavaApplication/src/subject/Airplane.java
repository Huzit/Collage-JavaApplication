package subject;

public class Airplane {
	private int man = 0;
	private double killo = 0;

	public Airplane(int man, double killo) {
		this.man = man;
		this.killo = killo;
	}

	public void distance() {
		System.out.println("미국까지 남은거리는 " + (10635 - killo) + "Km 입니다.");
	}

	public void weight() {
		System.out.println("비행기탑승객 총인원의 무게는 "+man*62.5+"Kg 입니다.");
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
