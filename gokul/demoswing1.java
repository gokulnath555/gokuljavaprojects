import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sample extends JFrame implements ActionListener
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1;
	sample()
	 {
		setLayout(null);
		setVisible(true);
		setSize(400,400);
	                
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField();
		t2=new JTextField();
		Panel p=new Panel(new GridLayout(2,2));
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		add(p);
		p.setBounds(120,140,280,80);
		b1=new JButton("Submit");
		b1.setBounds(280,240,80,30);
		add(b1);
		b1.addActionListener(this);
	}
	       public void actionPerformed(ActionEvent e)
		{
			if(e.getActionCommand().equals("Submit"));
			{
			     System.out.println(""+t1.getText());
			     System.out.println(""+t2.getText());
			}
		
		}
	
}
class demoswing1
{
	public static void main(String args[])
	{
		sample s=new sample();
	}
}
		