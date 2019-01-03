package circle;

public class Circle {
	private double radius = 0;

	public Circle(double radius) {
		this.radius = radius;
	}

	public void area() {
		System.out.println(radius * radius * Math.PI);
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
}
