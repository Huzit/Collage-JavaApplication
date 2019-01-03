package decoratorPattern;

public class shot extends Condiment{
	
	public shot(Cafe cafe) {
		this.cafe=cafe;
		name="샷 추가";
	}
	@Override
	public double price() {
		return cafe.price()+100;
	}

}
