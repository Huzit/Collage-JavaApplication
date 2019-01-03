package subject;

public class TriangleDriver {

	public static void main(String[] args) {
		Triangle triangle = new Triangle(4, 6);
		triangle.area();
		
		triangle.setWidth(8);
		triangle.setHeight(10);
		
		triangle.area();

	}

}
