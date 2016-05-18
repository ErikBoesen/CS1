import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class StickFigure extends Applet {
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillOval(25, 30, 50, 50);
		g.drawLine(50, 50, 50, 150);
	}
}