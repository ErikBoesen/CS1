import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

public class DuckHunt extends Applet implements Runnable, MouseListener, MouseMotionListener {
	Image duck;
	Image crosshair;
	int duckX = 100;
	int duckY = 100;
	int xSpeed = 1;
	int score = 0;
	int crosshairX = 0;
	int crosshairY = 0;
	int walls = 0;
	int ducks = 10;
	boolean gameOver = false;
	public void init() {
		setBackground(Color.WHITE);
		setSize(1200,500);
		addMouseListener(this);
		addMouseMotionListener(this);
		try {
			URL url = new URL(getDocumentBase(), "duck.png");
			duck = ImageIO.read(url);
			url = new URL(getDocumentBase(), "crosshair.png");
			crosshair = ImageIO.read(url);
		}
		catch (IOException e) {}
	}
	public void start() {
		Thread th = new Thread(this);
		th.start();
	}
	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		if (xSpeed > 0) {
			g.drawImage(duck, duckX, duckY, this);
		}
		else {
			g.drawImage(duck, duckX + 200, duckY, -200, 229, this);
		}
		g.drawImage(crosshair, crosshairX - 25, crosshairY - 25, this);
		g.drawString(Integer.toString(score), 20, 450);
	}
	public void run() {
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
		while(true) {
			if (duckX >= 1000 || duckX <= 0) {
				walls++;
				if (walls <= 4) {
					xSpeed = -xSpeed;
				}
				else {
					ducks--;
					if (ducks > 0) { 
						duckX = 10;
						xSpeed = 1;
						try {
							Thread.sleep(100);
						} catch (InterruptedException Ex) {}
					}
					else {
						System.exit(0);
					}
					walls = 0;
				}
			}
			duckX += xSpeed;
			repaint();
			try {
				Thread.sleep(2);
			} catch (InterruptedException Ex) {}
		}
	}
	public void mouseClicked(MouseEvent e) {
		if (Math.abs(duckX + 75 - e.getX()) < 200 && Math.abs(duckY + 100 - e.getY()) < 200) {
			score++;
			ducks--;
			duckX = 10;
			xSpeed = 1;
			try {
				Thread.sleep(100);
			} catch (InterruptedException Ex) {}
		}
		else {
			xSpeed += .2;
		}
	}
	public void mouseMoved(MouseEvent e) {
		crosshairX = e.getX();
		crosshairY = e.getY();
	}
	public void mouseDragged(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
}
