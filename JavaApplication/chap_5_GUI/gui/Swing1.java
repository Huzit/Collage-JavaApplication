package gui;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Swing1 {
	public void start() {
		JFrame frame = new JFrame("JFile.exe");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton button = new JButton("click me");
		button.setPreferredSize(new Dimension(100,100));
		
		JPanel panel=new JPanel();
		
		panel.setBackground(Color.BLACK);
		panel.add(button);
		frame.getContentPane().add(panel);
		
		frame.setSize(1024, 720);
		frame.setVisible(true);
	}
}
