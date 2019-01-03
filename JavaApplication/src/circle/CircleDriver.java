package circle;

public class CircleDriver {
	public static void main(String[]args) {
		
		Circle circle = new Circle(10);
//		Circle circle1 = new Circle(2);
		
		circle.area();
		
		circle.setRadius(30);
		circle.area();
		
		System.out.println();
	}
}
