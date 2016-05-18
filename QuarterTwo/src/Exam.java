import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Exam extends Applet implements Runnable {
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
		
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			repaint();
			try {
				Thread.sleep(2);
			}
			catch(InterruptedException Ex) {}
		}
	}
}
