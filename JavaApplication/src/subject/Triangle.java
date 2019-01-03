package subject;

public class Triangle {
	private double width=0, height=0;

	public Triangle(double width, double height){ //생성자
		this.width = width;
		this.height = height;
	} 
	
	public void area() {
		System.out.println("삼각형의 넓이는  "+width*height*.5+"입니다.");
	}
	
	//가로길이 받기
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//세로길이 받기
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
