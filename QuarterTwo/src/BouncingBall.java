import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BouncingBall extends Applet implements Runnable {
	int ballX = 500;
	int ballY = 250;
	int xSpeed = 1, ySpeed = -1;
	public void init() {
		setSize(1000,500);
		setBackground(Color.WHITE);
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.setColor(new Color(213, 132, 12));
		g.fillOval(ballX, ballY, 100, 100);
		g.drawRect(0, 0, 999, 499);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			ballX = ballX + xSpeed;
			ballY = ballY + ySpeed;
			if (ballX == 0 || ballX == 900) {xSpeed = -xSpeed;}
			if (ballY == 0 || ballY == 400) {ySpeed = -ySpeed;}
			repaint();
			try {
				Thread.sleep(2);
			}
			catch(InterruptedException Ex) {}
		}
	}
}
