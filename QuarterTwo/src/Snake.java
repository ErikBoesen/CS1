import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Snake extends Applet implements Runnable, KeyListener {
	int x = 683;
	int y = 317;
	public void init() {
		setSize(1366,639);
		setBackground(Color.DARK_GRAY);
		addKeyListener(this);
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.setColor(new Color(51,51,51));
		/*g.drawOval(25, 25, 100, 100);
		g.fillOval(200, 200, 100, 100);
		g.drawLine(112, 112, 250, 250);*/
	}
	public void run() {
		repaint();
		try {
			Thread.sleep(2);
		}
		catch(InterruptedException Ex) {}
	}
	public void keyTyped(KeyEvent e) {
		if (e.getKeyCode() == 37) {
			
		}
		if (e.getKeyCode() == 38) {
			
		}
		if (e.getKeyCode() == 39) {
			
		}
		if (e.getKeyCode() == 40) {
			
		}
	}
	public void keyPressed(KeyEvent e) {
		
	}
	public void keyReleased(KeyEvent e) {
		
	}
}
