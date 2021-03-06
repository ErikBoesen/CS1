import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class SummerVacation extends Applet implements Runnable {
	int waveX = 300;
	int waveVelX = 1;
	public void init() {
		setSize(1000,500);
		setBackground(Color.BLUE);
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.setColor(new Color(250, 150, 150));
		g.fillRect(500, 250, 100, 40);
		
		g.setColor(new Color(100, 100, 255));
		
		g.setColor(new Color(0, 100, 0));
		g.fillRect(500, 250, 30, 40);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			if (waveX < 300 || waveX > 500) {
				waveVelX *= -1;
			}
			waveX += waveVelX;
			repaint();
			try {
				Thread.sleep(5);
			}
			catch (InterruptedException Ex) {}
		}
	}
}
