import java.awt.*;
import java.awt.event.*;
class sample extends Frame implements ActionListener,ItemListener,MouseListener,MenuBarListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b1,b2;
	Choice c;
	sample()
	{
	         setLayout(null);
	         setVisible(true);
	         setSize(400,400);
	         
	        l1=new Label("UserName");
	        l2=new Label("password");
	        
	        t1=new TextField();
	        t2=new TextField();
	      
	      
	       
	         Panel p=new Panel(new GridLayout(2,2));
	            p.add(l1);
	            p.add(t1);
	            p.add(l2);
	            p.add(t2);
	            add(p);
		t2.setEchoChar('*');
	            p.setBounds(160,140,300,80);
	            setBackground(Color.cyan);
	            b1=new Button("submit");
	            b2=new Button("exit");
	            add(b1);
	            add(b2);
		b1.setBounds(180,240,100,40);
		b2.setBounds(280,240,100,40);
	           b1.addActionListener(this);
	           b2.addActionListener(this);
	             
	           c=new Choice();
		c.add("c");
		c.add("java");
		c.add("c++");
		add(c);
		c.setBounds(200,300,120,100);
		c.addItemListener(this);
		addMouseListener(this);
	}
	public void actionPerformed(ActionEvent g)
	 {
	 	if(g.getActionCommand().equals("submit"))
		 {
		       System.out.println(""+t1.getText());
		       System.out.println(""+t2.getText());
		System.exit(0);
		}
	   }
	public void itemStateChanged(ItemEvent l)
	   {
		System.out.println(""+c.getSelectedItem());
		
	    }
	 public void  mouseExited(MouseEvent m)
                     {
		System.out.println("mouseExited");
	    }
	  public void   mouseEntered(MouseEvent m)
	    {	
		System.out.println("mouseEntered");
	     }
	public void  mouseReleased(MouseEvent m)
	     {
		System.out.println("mouseReleased");
	     }
	public void mousePressed(MouseEvent m)
	  {
		System.out.println("mousePressed");
	  }
	public void mouseClicked(MouseEvent m)
	 {
	    	System.out.println("mouseClicked");
                  }  
}
class demolistener
{
	public static void main(String args[])
	 {
	        sample s=new sample();
	 }
}
		





	         