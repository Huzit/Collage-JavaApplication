package shapeProject;

public class Triangle extends Rectangle implements Shape{

	public Triangle(int wedith, int height) {
		super(wedith, height);
	}
	
	public double area() {
		return super.area()/2;
	}
	

}
