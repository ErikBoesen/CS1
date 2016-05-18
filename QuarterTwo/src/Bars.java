import java.applet.Applet;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

public class Bars extends Applet {
    public void paint(Graphics g) {
        setSize(1000, 1000);
        setBackground(Color.BLUE);
        Random rand = new Random();
        g.setColor(Color.RED);
        g.drawLine(200, 0, 200, 500); //y axis
        g.drawLine(200, 500, 800, 500); // x-axis
        //Strings
        g.setColor(Color.BLACK);
        g.setFont(new Font("American Typewriter", Font.BOLD, 25));
        g.drawString("A", 150, 100);
        g.drawString("B", 150, 200);
        g.drawString("C", 150, 300);
        g.drawString("D", 150, 400);
        g.drawString("Amount of People", 400, 580);
        g.drawString("Grades", 10, 250);
        g.drawString("Test on an IB HL Math Exam", 400, 40);
        //Rectangles
        int y = 70; //space between bars
        int y2 = 100; //space between string numbers
        int max = 0;
        int ymax = 0;
        String AString = "";
        for (int i = 1; i <= 4; i++) {
            int randnum = (rand.nextInt(500) + 500) / 2;
            if (randnum >= max) {
                max = randnum;
                ymax = y;
                g.setColor(Color.YELLOW);
                g.fillRect(200, ymax, max, 50);
                g.setColor(Color.BLACK);
                AString = Integer.toString(randnum);
                g.drawString(AString, 210, ymax + 30);
            } else {
                g.setColor(Color.RED);
                g.fillRect(200, y, randnum, 50);
                g.setColor(Color.BLACK);
                AString = Integer.toString(randnum);
                g.drawString(AString, 210, y2);
            }
            y = y + 100;
            y2 = y2 + 100;
        }
    }
}