import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class FallingPerson extends Applet implements Runnable {
	Image img;
	int yPos = 0;
	public void init() {
		setSize(1000,500);
		setBackground(Color.GRAY);
		try {
			URL url = new URL(getDocumentBase(), "putin.png");
			img = ImageIO.read(url);
		}
		catch (IOException e) {}
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void stop() {}
	public void paint(Graphics g) {
		g.drawImage(img, 500, yPos, this);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			yPos = yPos + 1;
			repaint();
			try {
				Thread.sleep(5);
			}
			catch (InterruptedException Ex) {}
		}
	}
}
