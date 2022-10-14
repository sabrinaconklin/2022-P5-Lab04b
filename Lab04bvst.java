// Lab04bvst.java
// The AWT Graphics Program
// This is the student, starting version of Lab04b.


import java.awt.*;
import java.applet.*;


public class Lab04bvst extends Applet
{

    public void paint(Graphics g)
    {
        // DRAW CUBE
        g.drawLine(100,225,250,225);
        g.drawLine(100,75,250,75);
        g.drawLine(100,225,50,175);
        g.drawLine(100,75,100,225);
        g.drawLine(50,29,50,175);
        g.drawLine(200,25,50,25);
        g.drawLine(250,75,200,25);
        g.drawLine(50,25,100,75);
        g.drawLine(250,75,250,225);
        g.drawLine(200,25,200,175);
        g.drawLine(200,175,250,225);
        g.drawLine(200,175,50,175);
        // DRAW SPHERE
        g.drawOval(550, 50, 200,200);
        g.drawOval(550,65,200,170);
        g.drawOval(550,80,200,140);
        g.drawOval(550,95,200,110);
        g.drawOval(550,110,200,80);
        g.drawOval(550,125,200,50);
        g.drawOval(550,50,200,200);
        g.drawOval(565,50,170,200);
        g.drawOval(595,50,110,200);
        g.drawOval(610, 50, 80, 200);
        g.drawOval(625,50,50,200);
        g.drawOval(640,50,20,200);
        g.drawOval(580,50,140,200);
        g.drawLine(550,150,750,150);
        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(875,325,200,200);
        g.drawLine(875,440,1045,350);
        g.drawLine(1055,360,990,525);
        g.drawLine(990,525,875,440);
        g.drawOval(920,397,96,96);

        // DRAW APCS
        //A
        g.fillRect(75,300,60,20);
        g.fillRect(75,300,20,120);
        g.fillRect(135,300,20,120);
        g.fillRect(75,350,80,20);

        // P
        g.fillRect(175,300,60,20);
        g.fillRect(175,300,20,120);
        g.fillRect(215,300,20,60);
        g.fillRect(175,350,60,20);

        //C
        g.fillRect(250,300,70,20);
        g.fillRect(250,300,20,120);
        g.fillRect(250,400,70,20);

        // S
        g.fillRect(350,300,70,20);
        g.fillRect(350,300,20,60);
        g.fillRect(350,350,70,20);
        g.fillRect(400,350,20,60);
        g.fillRect(350,400,70,20);


        // DRAW PACMEN FLOWER
        g.fillArc(675,435,100,100,315,270);
        g.fillArc(740,375,100,100,45,270);
        g.fillArc(675,315,100,100,135,270);
        g.fillArc(610,375,100,100,225,270);
    }
}


