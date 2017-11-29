import java.io.*;
import java.awt.*;
import java.applet.*;
public class ar extends Applet
{
public void paint(Graphics g)
{
g.setColor(Color.pink);
g.fillOval(20,40,250,250);
g.setColor(Color.white);
g.fillOval(70,100,50,50);
g.fillOval(180,100,50,50);
g.setColor(Color.green);
g.drawArc(100,150,100,100,180,180);
}
}