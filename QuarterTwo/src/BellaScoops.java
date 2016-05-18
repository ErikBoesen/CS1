import java.awt.Graphics;

import java.awt.Image;

import java.awt.event.KeyEvent;

import java.awt.event.KeyListener;

import java.awt.event.MouseEvent;

import java.awt.event.MouseMotionListener;

import java.io.IOException;

import java.net.URL;

import java.util.Random;

import javax.imageio.ImageIO;

import java.applet.Applet;

import java.awt.Color;

import java.awt.Font;



public class BellaScoops extends Applet implements Runnable, KeyListener, MouseMotionListener 

{



//GLOBAL VARIABLES

Thread t;

//Images

Image cone;

Image onion;

Image vanilla;

Image chocolate;

Image strawberry;

Image caramel;

Image cookiedough;

Image mintchip;

Image cookiescream;

//Y-Positions

int yCone = 500;

int yscoop = -100;

int yscoop2 = -400;

int yscoop3 = -700;

int yscoop4 = -1000;

int yscoop5 = -1300;

int yscoop6 = -1600;

int yscoop7 = -1900;

//y-speed of scoops falling

int yscoopspeed = 5;

int yscoopspeed2 = 5;

int yscoopspeed3 = 5;

int yscoopspeed4 = 5;

int yscoopspeed5 = 5;

int yscoopspeed6 = 5;

int yscoopspeed7 = 5;

// If the scoops have landed or not

boolean scooplanded = false;

boolean scooplanded2 = false;

boolean scooplanded3 = false;

boolean scooplanded4 = false;

boolean scooplanded5 = false;

boolean scooplanded6 = false;

boolean scooplanded7 = false;

//Levels

boolean level2 = false;

boolean level3 = false;

boolean level4 = false;

//X-Positions

int xCone = 0;

Random rand = new Random();

int xonion = rand.nextInt(700)+200;

int xscoop = rand.nextInt(700)+200;

int xscoop2 = rand.nextInt(700)+200;

int xscoop3 = rand.nextInt(700)+200;

int xscoop4 = rand.nextInt(700)+200;

int xscoop5 = rand.nextInt(700)+200;

int xscoop6 = rand.nextInt(700)+200;

int xscoop7 = rand.nextInt(700)+200;

//Lives, score, and counter

int score = 0;

int lives = 3;

int counter = 0;


public void init()

{

setBackground(new Color(102, 178, 255));

setSize(1000, 700);

addKeyListener(this); 

addMouseMotionListener(this);


try

{

URL url = new URL(getDocumentBase(), "IceCreamCone.png");

cone = ImageIO.read(url);

URL url2 = new URL(getDocumentBase(), "Onion.png");

onion = ImageIO.read(url2);

//flavors

URL url3 = new URL(getDocumentBase(), "Vanilla.png");

vanilla = ImageIO.read(url3);

URL url4 = new URL(getDocumentBase(), "Chocolate.png");

chocolate = ImageIO.read(url4);

URL url5 = new URL(getDocumentBase(), "Strawberry.png");

strawberry = ImageIO.read(url5);

URL url6 = new URL(getDocumentBase(), "Caramel.png");

caramel = ImageIO.read(url6);

URL url7 = new URL(getDocumentBase(), "CookieDough.png");

cookiedough = ImageIO.read(url7);

URL url8 = new URL(getDocumentBase(), "MintChip.png");

mintchip = ImageIO.read(url8);

URL url9 = new URL(getDocumentBase(), "CookiesCream.png");

cookiescream = ImageIO.read(url9);


}

catch(IOException e) {}

}


public void start()

{

t = new Thread(this);

t.start();

}


public void stop()

{


}

public void paint(Graphics g)

{

//scenery

g.setColor(Color.YELLOW);

g.fillOval(-50, -50, 150, 150);


//cone and onion

g.drawImage(cone, xCone, yCone, this);;


//scoops

g.drawImage(vanilla, xscoop, yscoop, this);

g.drawImage(chocolate, xscoop2, yscoop2, this);

g.drawImage(strawberry, xscoop3, yscoop3, this);

g.drawImage(caramel, xscoop4, yscoop4, this);

g.drawImage(cookiedough, xscoop5, yscoop5, this);

g.drawImage(mintchip, xscoop6, yscoop6, this);

g.drawImage(cookiescream, xscoop7, yscoop7, this);


//lives

g.setFont(new Font("Consolas", Font.BOLD, 20));

g.setColor(Color.MAGENTA);

g.drawString("Lives: " + lives, 900, 610);


//score

g.setFont(new Font("Consolas", Font.BOLD, 50));

g.drawString(Integer.toString(score), 40, 610);


//when you lose the game

if (lives <= 0)

{

g.setFont(new Font("Consolas", Font.BOLD, 30));

g.drawString("GAME OVER! Press r to begin again...", 200, 400);

yscoopspeed = 0;

yscoopspeed2 = 0;

yscoopspeed3 = 0;

yscoopspeed4 = 0;

yscoopspeed5 = 0;

yscoopspeed6 = 0;

yscoopspeed7 = 0;

}



//LEVELS

//Game completed

if(counter == 7 && level4 == true)

{

g.setFont(new Font ("Consolas", Font.BOLD, 60));

g.drawString("You beat the game!", 250, 300);

g.setFont(new Font ("Consolas", Font.BOLD, 30));

g.drawString("Press r to play again...", 375, 350);

}

//Level 4

else if(counter == 6 && level3 == true && level4 == false)

{

yscoopspeed7 = 0;

g.setFont(new Font ("Consolas", Font.BOLD, 60));

g.drawString("You Won!", 400, 300);

g.setFont(new Font ("Consolas", Font.BOLD, 30));

g.drawString("Press b for level 4...", 375, 350);

}

//Level 3

else if(counter == 5 && level2 == true && level3 == false)

{

yscoopspeed6 = 0;

yscoopspeed7 = 0;

g.setFont(new Font ("Consolas", Font.BOLD, 60));

g.drawString("You Won!", 400, 300);

g.setFont(new Font ("Consolas", Font.BOLD, 30));

g.drawString("Press e for level 3...", 375, 350);

}

//Level 2

if(counter == 4 && level2 == false)

{

yscoopspeed5 = 0;

yscoopspeed6 = 0;

yscoopspeed7 = 0;

g.setFont(new Font ("Consolas", Font.BOLD, 60));

g.drawString("You Won!", 400, 300);

g.setFont(new Font ("Consolas", Font.BOLD, 30));

g.drawString("Press k for level 2...", 375, 350);

}

}



public void run()

{

Thread.currentThread().setPriority(Thread.MIN_PRIORITY);


while(true)

{

yscoop+=yscoopspeed;

yscoop2+=yscoopspeed2;

yscoop3+=yscoopspeed3;

yscoop4+=yscoopspeed4;

yscoop5+=yscoopspeed5;

yscoop6+=yscoopspeed6;

yscoop7+=yscoopspeed7;

 

//when you lose a life

if(yscoop == 700)

{

lives--;

}

if(yscoop2 == 700)

{

lives--;

}

if(yscoop3 == 700)

{

lives--;

}

if(yscoop4 == 700)

{

lives--;

}

if(yscoop5 == 700)

{

lives--;

}

if(yscoop6 == 700)

{

lives--;

}

if(yscoop7 == 700)

{

lives--;

}


//When scoop sticks to the cone, pt.1

if(scooplanded == true)

{

xscoop = xCone;

}

if(scooplanded2 == true)

{

xscoop2 = xCone;

}

if(scooplanded3 == true)

{

xscoop3 = xCone;

}

if(scooplanded4 == true)

{

xscoop4 = xCone;

}

if(scooplanded5 == true)

{

xscoop5 = xCone;

}

if(scooplanded6 == true)

{

xscoop6 = xCone;

}

if(scooplanded7 == true)

{

xscoop7 = xCone;

}

repaint();

 

try

{

Thread.sleep(20); 

}

catch(InterruptedException Ex)

{

 

}

 

}

}



@Override

public void mouseDragged(MouseEvent e) 

{


}



@Override

public void mouseMoved(MouseEvent e) 

{

//cone movement

xCone = e.getX();

//when the scoop sticks to the cone, pt.2

if(xscoop <= xCone + 200 && xscoop + 100 >= xCone && yscoop >= 450 - counter * 80 && !scooplanded)

{

yscoopspeed = 0;

xscoop = e.getX();

scooplanded = true;

if(scooplanded == true)

{

counter++;

score++;

}

}

if(xscoop2 <= xCone+200 && xscoop2+100 >= xCone && yscoop2 >= 450 - counter *80 && !scooplanded2)

{

yscoopspeed2 = 0;

xscoop2 = e.getX();

scooplanded2 = true;

if(scooplanded2 == true)

{

counter++;

score++;

}

}

if(xscoop3 <= xCone+200 && xscoop3+100 >= xCone && yscoop3 >= 450 - counter *80 && !scooplanded3)

{

yscoopspeed3 = 0;

xscoop3 = e.getX();

scooplanded3 = true;

if(scooplanded3 == true)

{

counter++;

score++;

}

}

if(xscoop4 <= xCone+200 && xscoop4+100 >= xCone && yscoop4 >= 450 - counter * 80 && !scooplanded4)

{

yscoopspeed4 = 0;

xscoop4 = e.getX();

scooplanded4 = true;

if(scooplanded4 == true)

{

counter++;

score++;

}

}

if(xscoop5 <= xCone+200 && xscoop5+100 >= xCone && yscoop5 >= 450 - counter * 80 && !scooplanded5)

{

yscoopspeed5 = 0;

xscoop5 = e.getX();

scooplanded5 = true;

if(scooplanded5 == true)

{

counter++;

score++;

}

}

if(xscoop6 <= xCone+200 && xscoop6+100 >= xCone && yscoop6 >= 450 - counter * 80 && !scooplanded6)

{

yscoopspeed6 = 0;

xscoop6 = e.getX();

scooplanded6 = true;

if(scooplanded6 == true)

{

counter++;

score++;

}

}

if(xscoop7 <= xCone+200 && xscoop7+100 >= xCone && yscoop7 >= 450 - counter * 80 && !scooplanded7)

{

yscoopspeed7 = 0;

xscoop7 = e.getX();

scooplanded7 = true;

if(scooplanded7 == true)

{

counter++;

score++;

}

}

}



@Override

public void keyTyped(KeyEvent e) 

{


}



@Override

public void keyPressed(KeyEvent e) 

{

int x = e.getKeyCode();

System.out.println(x);


//Level 2

if(x == 75) //k

{

yscoop= -100;

yscoop2 = -400;

yscoop3 = -700;

yscoop4 = -1000;

yscoop5 = -1300;

yscoop6 = -1600;

yscoop7 = -1900;

yscoopspeed = 7;

yscoopspeed2 = 7;

yscoopspeed3 = 7;

yscoopspeed4 = 7;

yscoopspeed5 = 7;

yscoopspeed6 = 7;

yscoopspeed7 = 7;

counter = 0;

scooplanded = false;

scooplanded2 = false;

scooplanded3 = false;

scooplanded4 = false;

scooplanded5 = false;

scooplanded6 = false;

scooplanded7 = false;

xscoop = rand.nextInt(700)+200;

xscoop2 = rand.nextInt(700)+200;

xscoop3 = rand.nextInt(700)+200;

xscoop4 = rand.nextInt(700)+200;

xscoop5 = rand.nextInt(700)+200;

xscoop6 = rand.nextInt(700)+200;

xscoop7 = rand.nextInt(700)+200;

level2 = true;

}


//Level 3

if(x == 69) //E

{

yscoop = -100;

yscoop2 = -400;

yscoop3 = -700;

yscoop4 = -1000;

yscoop5 = -1300;

yscoop6 = -1600;

yscoop7 = -1900;

yscoopspeed = 10;

yscoopspeed2 = 10;

yscoopspeed3 = 10;

yscoopspeed4 = 10;

yscoopspeed5 = 10;

yscoopspeed6 = 10;

yscoopspeed7 = 10;

counter = 0;

scooplanded = false;

scooplanded2 = false;

scooplanded3 = false;

scooplanded4 = false;

scooplanded5 = false;

scooplanded6 = false;

scooplanded7 = false;

xscoop = rand.nextInt(700)+200;

xscoop2 = rand.nextInt(700)+200;

xscoop3 = rand.nextInt(700)+200;

xscoop4 = rand.nextInt(700)+200;

xscoop5 = rand.nextInt(700)+200;

xscoop6 = rand.nextInt(700)+200;

xscoop7 = rand.nextInt(700)+200;

level3 = true;

}


//Level 4

if(x == 66) //B

{

yscoop = -100;

yscoop2 = -400;

yscoop3 = -700;

yscoop4 = -1000;

yscoop5 = -1300;

yscoop6 = -1600;

yscoop7 = -1900;

yscoopspeed = 14;

yscoopspeed2 = 14;

yscoopspeed3 = 14;

yscoopspeed4 = 14;

yscoopspeed5 = 14;

yscoopspeed6 = 14;

yscoopspeed7 = 14;

counter = 0;

scooplanded = false;

scooplanded2 = false;

scooplanded3 = false;

scooplanded4 = false;

scooplanded5 = false;

scooplanded6 = false;

scooplanded7 = false;

xscoop = rand.nextInt(700)+200;

xscoop2 = rand.nextInt(700)+200;

xscoop3 = rand.nextInt(700)+200;

xscoop4 = rand.nextInt(700)+200;

xscoop5 = rand.nextInt(700)+200;

xscoop6 = rand.nextInt(700)+200;

xscoop7 = rand.nextInt(700)+200;

level4 = true;

}


//when the game restarts

if(x == 82)

{

lives = 3;

score = 0;

counter = 0;

yscoopspeed = 5;

yscoopspeed2 = 5;

yscoopspeed3 = 5;

yscoopspeed4 = 5;

yscoopspeed5 = 5;

yscoopspeed6 = 5;

yscoopspeed7 = 5;

yscoop = -100;

yscoop2 = -400;

yscoop3 = -700;

yscoop4 = -1000;

yscoop5 = -1300;

yscoop6 = -1600;

yscoop7 = -1900;

scooplanded = false;

scooplanded2 = false;

scooplanded3 = false;

scooplanded4 = false;

scooplanded5 = false;

scooplanded6 = false;

scooplanded7 = false;

xscoop = rand.nextInt(700)+200;

xscoop2 = rand.nextInt(700)+200;

xscoop3 = rand.nextInt(700)+200;

xscoop4 = rand.nextInt(700)+200;

xscoop5 = rand.nextInt(700)+200;

xscoop6 = rand.nextInt(700)+200;

xscoop7 = rand.nextInt(700)+200;

level2 = false;

level3 = false;

level4 = false;

}


}



@Override

public void keyReleased(KeyEvent e) 

{


}



}