import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BallMovement extends Applet implements Runnable {
	int ovalX = 500;
	public void init() {
		setSize(1000, 500);
		setBackground(Color.BLACK);
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.setColor(new Color(100,23,250));
		g.fillOval(ovalX, 100, 100, 100);
		g.fillOval(ovalX, 200, 100, 100);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			ovalX = ovalX + 1;
			repaint();
			try {
				Thread.sleep(2);
			} catch(InterruptedException Ex) {}
		}
	}
}
