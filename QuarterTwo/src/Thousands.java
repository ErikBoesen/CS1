import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Thousands extends Applet implements Runnable {
	public void init() { // Method which starts original screen
		setSize(1366,700);
		setBackground(new Color((int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1)));
	}
	public void start() { // Method gets the processor involved
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		for (int i = 0; i < 1000; i++) {
			g.setColor(new Color((int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1)));
			g.fillOval((int)(Math.random() * 1000), (int)(Math.random() * 500), (int)(Math.random() * 500), (int)(Math.random() * 500));
			g.setColor(new Color((int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1)));
			g.fillRect((int)(Math.random() * 1000), (int)(Math.random() * 500), (int)(Math.random() * 500), (int)(Math.random() * 500));
			setBackground(new Color((int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1), (int)(Math.random() * 255 + 1)));
		}
	}
	public void run() { // Method movement on screen
	}
}
