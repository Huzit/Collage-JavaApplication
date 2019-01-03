package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Snake {
	JFrame frame;
	int WIDTH = 800;
	int HEIGHT = 600;
	String gameName = "Snake Game";

	int speed = 40;
	int xDirection = 0;
	int yDirection = 0;

	int headX = 10;
	int headY = 10;
	int X, Y;
	ArrayList<Madi> snake = new ArrayList<Madi>();
	
	int foodX, foodY;
	int score=0;
	int nfoodX=0;
	int nfoodY=0;
	
	
	public void newFood() {
		foodX=(int)(Math.random()*WIDTH/10);
		foodY=(int)(Math.random()*HEIGHT/10);
	}
	
	public void notFood() {
		nfoodX=(int)(Math.random()*WIDTH/10);
		nfoodY=(int)(Math.random()*HEIGHT/10);
	}
	
	

	public Snake() {
		frame = new JFrame(gameName);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.addKeyListener(new MyListener());

		frame.getContentPane().add(new MyPanel());

		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
		for (int i = 0; i < 4; i++) {
			snake.add(new Madi(headX - i, headY));
		}
		newFood();
		notFood();
	}

	public void start() {
		while (true) {
			headX += xDirection;
			headY += yDirection;
			X=headX;
			Y=headY;
			Madi temp = snake.get(snake.size()-1);
			for (int i = snake.size() - 1; i > 0; i--) {
				snake.set(i, snake.get(i - 1));
			}
			
			if(headX==foodX && headY==foodY) {
				snake.add(temp);
				newFood();
			}
			
			if(headX==nfoodX && headY==nfoodY) {
				break;
			}
			snake.set(0, new Madi(headX, headY));
			if(headX>(WIDTH/10) || headX<0 || headY<0 || headY>(HEIGHT/10))
				break;
			frame.repaint();

			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private class MyListener implements KeyListener {
		@Override
		public void keyPressed(KeyEvent key) {
			// TODO Auto-generated method stub
			switch (key.getKeyCode()) {
			case KeyEvent.VK_LEFT:
				xDirection = -1;
				yDirection = 0;
				break;
			case KeyEvent.VK_RIGHT:
				xDirection = 1;
				yDirection = 0;
				break;
			case KeyEvent.VK_UP:
				xDirection = 0;
				yDirection = -1;
				break;
			case KeyEvent.VK_DOWN:
				xDirection = 0;
				yDirection = 1;
				break;
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}
	}
//나만의 팔절지에 모든걸 그릴 수 있다
	class MyPanel extends JPanel {
		public void paintComponent(Graphics g) {
			super.paintComponent(g);

			g.setColor(Color.RED);

			for (Madi madi : snake)
				g.fillRect(madi.getX() * 10, madi.getY() * 10, 10, 10);

			g.setColor(Color.WHITE);

			for (Madi madi : snake)
				g.drawRect(madi.getX() * 10, madi.getY() * 10, 10, 10);
			
			g.setColor(Color.BLACK);
			g.fillRect(foodX*10, foodY*10, 10, 10);
			
			g.setColor(Color.RED);
			g.fillRect(10*10, 10*10, 10, 200);
			
			g.setColor(Color.RED);
			g.drawRect(0, 0, 800, 600);
		}
	}
}
