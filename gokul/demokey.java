import java.awt.*;
import java.awt.event.*;
public class demokey extends Frame implements KeyListener
{
	Label l;
	TextArea area;
	demokey()
	 {
		
		
	 	setLayout(null);
		setSize(400,400);
		setVisible(true);
		l=new Label();
		l.setBounds(20,50,100,20);;
		area=new TextArea();
		area.setBounds(20,80,300,300);
		area.addKeyListener(this);
		add(l);
		add(area);
			
	 }
	 public void keyPressed(KeyEvent e)
	    {
		l.setText("KeyPressed");	
	     }
	public void keyReleased(KeyEvent e1)
	    {
		l.setText("KeyRelesed");	
	     }
	public void keyTyped(KeyEvent e2)
	    {
		l.setText("Key Typed");	
	     }
       public static void main(String args[])	
         {
	demokey d=new demokey();
         }
}
	
