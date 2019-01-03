package shapeProject;

public class Circle implements Shape{
	int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	
	public double area() {
		return radius*radius*Math.PI;
	}

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		
	}
	

}
