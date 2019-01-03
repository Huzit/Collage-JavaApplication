package shapeProject;

public class ShapeDriver {

	public static void main(String[] args) {
		Shape triangle = new Triangle(7, 6);
		System.out.println(triangle.area());

		Shape Circle = new Circle(2);
		System.out.println(Circle.area());

		Shape Rectangle = new Rectangle(2, 3000);
		System.out.println(Rectangle.area());
	}

}
