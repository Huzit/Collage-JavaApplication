package subject;

public class Triangle {
	private double width=0, height=0;

	public Triangle(double width, double height){ //������
		this.width = width;
		this.height = height;
	} 
	
	public void area() {
		System.out.println("�ﰢ���� ���̴�  "+width*height*.5+"�Դϴ�.");
	}
	
	//���α��� �ޱ�
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	//���α��� �ޱ�
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
}
