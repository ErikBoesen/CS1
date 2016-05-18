import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Einstein extends Applet {
	public void paint(Graphics g) {
		for (int i = 0; i < 1000; i = i + 1) {
			g.drawLine((int)(Math.random() * 1000 + 1), (int)(Math.random() * 1000 + 1), (int)(Math.random() * 1000 + 1), (int)(Math.random() * 500 + 1));
			g.drawString("Hello there", (int)(Math.random() * 1000 + 1), (int)(Math.random() * 1000 + 1));
		}
	}
}