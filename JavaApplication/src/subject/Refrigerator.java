package subject;

public class Refrigerator {
	private int temperature;
	
	public Refrigerator(int temperature) {
		this.temperature = temperature;
	}

	public void Check() {
		if(temperature<3) {
			System.out.println(temperature+"�� �� �����Դϴ�.");
		}
		else {
			System.out.println("�����Ϳ� ��ȭ�ϴ°��� ��õ�帳�ϴ�.");
		}
	}
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
