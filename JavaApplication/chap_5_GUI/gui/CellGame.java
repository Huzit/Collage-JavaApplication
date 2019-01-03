package gui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class CellGame {
	JFrame frame = new JFrame("JFile.exe");
	ArrayList<Jewl> jewels = new ArrayList<Jewl>();
	int WIDTH = 800, HEIGHT = 600;
	int x = 100, y = 100;
	int speed = 10;
	int xDirection = 1, yDirection = 0;
	int radius = 5;

	public CellGame() {
		for (int i = 0; i < 100; i++)
			jewels.add(new Jewl());
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		MyPanel panel = new MyPanel();
		frame.getContentPane().add(panel);

//		MyActionListener myAction = new MyActionListener();
		frame.addKeyListener(new MyListener());

		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}

	/*
	 * private class MyActionListener implements ActionListener{
	 * 
	 * @Override public void actionPerformed(ActionEvent e) { y+=10; }
	 * 
	 * }
	 */
	private class Jewl {
		private int x, y, width;
		private Color color;

		public Jewl() {
			x = (int) (Math.random() * WIDTH);
			y = (int) (Math.random() * HEIGHT);
			width = radius * 2;
			color = new Color((int) (Math.random() * 0xFFFFFF));
		}

		public int getX() {
			return x;
		}

		public int getY() {
			return y;
		}

		public int getWidth() {
			return width;
		}

		public Color getColor() {
			return color;
		}

		public void update() {
			x = (int) (Math.random() * WIDTH);
			y = (int) (Math.random() * HEIGHT);
			width = radius * 2;
			color = new Color((int) (Math.random() * 0xFFFFFF));
		}

	}

	private class MyListener implements KeyListener {

		@Override
		public void keyPressed(KeyEvent key) {
			switch (key.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				xDirection = -1;
				yDirection = 0;
				break;
			case KeyEvent.VK_RIGHT:
				xDirection = +1;
				yDirection = 0;
				break;
			case KeyEvent.VK_UP:
				xDirection = 0;
				yDirection = -1;
				break;
			case KeyEvent.VK_DOWN:
				xDirection = 0;
				yDirection = +1;
				break;
			}

		}

		@Override
		public void keyTyped(KeyEvent key) {

		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
		}

	}

	private class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			for (Jewl jewel : jewels) {
				g.setColor(jewel.getColor());
				g.fillRect(jewel.getX(), jewel.getY(), jewel.getWidth(), jewel.getWidth());
			}

			g.setColor(Color.RED);
			g.fillRect(x, y, radius * 2, radius * 2);

		}
	}

	public void start() {
		while (true) {
			frame.repaint();
			x += xDirection;
			y += yDirection;

			int MyX = x + radius;
			int MyY = y + radius;
			int tx;
			int ty;
			double distance;
			for (Jewl jewel : jewels) {
				tx = (MyX - jewel.getX() + jewel.getWidth());
				ty = (MyY - jewel.getY() + jewel.getWidth());
				distance = Math.sqrt(tx * tx + ty * ty);

				if (distance <= radius) {
					radius++;
					jewel.update();
				}
			}

			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
