package shapeProject;

public class Rectangle implements Shape{
	int wedith, height;
	
	public Rectangle(int wedith, int height) {
		this.wedith = wedith;
		this.height = height;
	}
	public double area() {
		return wedith*height;
	}

	@Override
	public void Shape() {
		// TODO Auto-generated method stub
		
	}
	
}
