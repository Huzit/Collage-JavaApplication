package subject;

public class Refrigerator {
	private int temperature;
	
	public Refrigerator(int temperature) {
		this.temperature = temperature;
	}

	public void Check() {
		if(temperature<3) {
			System.out.println(temperature+"도 는 정상입니다.");
		}
		else {
			System.out.println("고객센터에 전화하는것을 추천드립니다.");
		}
	}
	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}
}
