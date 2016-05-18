import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class BarGraph extends Applet implements Runnable {
	public void init() {
		setBackground(Color.LIGHT_GRAY);
		setSize(1200,500);
	}
	public void paint(Graphics g) {
		g.drawString("A", 50, 105);
		g.drawString("B", 50, 205);
		g.drawString("C", 50, 305);
		g.drawString("D", 50, 405);
		
		int highest = 0;
		int highestIndex = 0;
		for (int i = 0; i < 4; i++) {
			int rand = (int)(Math.random() * 50);
			if (rand > highest) {
				highest = rand;
				highestIndex = i;
			}
			g.drawRect(75, 75 + 100 * i, rand * 20, 50);
			g.drawString(Integer.toString(rand), 80, 100 * (i + 1) + 5);
		}
		g.setColor(Color.YELLOW);
		g.drawRect(75, 75 + 100 * highestIndex, highest * 20, 50);
		g.drawString(Integer.toString(highest), 80, 100 * (highestIndex + 1) + 5);
	}
	public void run() {}
}
