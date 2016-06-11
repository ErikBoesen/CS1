import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MovingBall extends Applet implements Runnable {
	public void init() {
		setSize(1366,639);
		setBackground(Color.DARK_GRAY);
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.setColor(new Color(51,51,51));
		int oldX = -25, oldY = -25, newX, newY;
		while(true) {
			newX = (int)(Math.random()*1366+1);
			newY = (int)(Math.random()*580+1);
			g.fillOval(newX, newY, 50, 50);
			g.drawLine(oldX + 25, oldY + 25, newX + 25, newY + 25);
			oldX = newX;
			oldY = newY;
			try {
				Thread.sleep(500);
			} catch(InterruptedException Ex) {}
		}
	}
	public void run() {
		repaint();
		try {
			Thread.sleep(2);
		}
		catch(InterruptedException Ex) {}
	}
}
