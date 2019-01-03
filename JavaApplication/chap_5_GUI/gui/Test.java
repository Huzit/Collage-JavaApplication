package gui;

import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test extends JFrame{

	JFrame jFrame = new JFrame("GUI실습");
	JButton b1 = new JButton("1");
	JButton b2 = new JButton("2");
	JButton b3 = new JButton("3");
	
	public void ButtonThree() {
		Container container = jFrame.getContentPane();
		
		container.add(b1, BorderLayout.NORTH);
		container.add(b2, BorderLayout.SOUTH);
		container.add(b3, BorderLayout.WEST);
		
		jFrame.setSize(300,400);
		jFrame.setVisible(true);
		
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		Test test = new Test();
		test.ButtonThree();
	}

}
