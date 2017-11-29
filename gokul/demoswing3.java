import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sample extends Thread implements ActionListener
{
	JFrame f=new JFrame();
	Thread t=new Thread(this);
	JLabel l1,l2;
	JTextField t1;
	JButton b1;
	JPasswordField t2;
	JTextArea t3;
	JMenuBar mb;
	JMenu menu;
	JMenu submenu;
	JMenuItem i1,i2,i3,i4,i5;
	
	
	sample()
	 {
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(700,500);
		f.setTitle("Register");
	                
		l1=new JLabel("UserName");
		l2=new JLabel("Password");
		t1=new JTextField();
		t2=new JPasswordField();
		t3=new JTextArea();
		t3.setBounds(240,300,300,120);
		f.add(t3);
		mb=new JMenuBar();
		menu=new JMenu("Menu");
		submenu=new JMenu("submenu");
		i1=new JMenuItem("new");
		i2=new JMenuItem("open");
		i3=new JMenuItem("save");
		i4=new JMenuItem("save as");
		i5=new JMenuItem("exit");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);	
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
		f.setJMenuBar(mb);
		Panel p=new Panel(new GridLayout(2,2));
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		f.add(p);
		p.setBounds(120,140,280,80);
		b1=new JButton("Submit");
		b1.setBounds(280,240,80,30);
		f.add(b1);
		b1.addActionListener(this);
	}
	       public void actionPerformed(ActionEvent e)
		{	
	
			try{
	
			String data="UserName="+t1.getText();
			data +="&Password="+new String(t2.getPassword());
			t3.setText(data);
				t.sleep(1000);
			} catch(InterruptedException g){}
			  		
		}
	
}
class demoswing3
{
	public static void main(String args[])
	{
		sample s=new sample();
	}
	
}
		