import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class sample extends Thread implements ActionListener
{
	JFrame f=new JFrame();
	Thread t=new Thread(this);
	JLabel l1,l2,l3;
	JTextField t1;
	JButton b1;
	JPasswordField t2,t4;
	JTextArea t3;
	JMenuBar mb;
	sample()
	 {
		f.setLayout(null);
		f.setVisible(true);
		f.setSize(700,500);
		f.setTitle("Register");
		f.getContentPane().setBackground(Color.black);
	                
		l1=new JLabel("UserName");
		l2=new JLabel(" Password");
		l3=new JLabel("Confirm Password");
		t1=new JTextField();
		t2=new JPasswordField();
		t4=new JPasswordField();
		
		t3=new JTextArea();
		t3.setBounds(240,300,280,120);
		f.add(t3);
		
		//menus

		JMenuBar mb=new JMenuBar();
		f.setJMenuBar(mb);	
		JMenu menu=new JMenu("Menu");
		JMenu submenu =new JMenu("submenu");
		JMenuItem i1=new JMenuItem("new");
		JMenuItem i2=new JMenuItem("open");
		JMenuItem i3=new JMenuItem("save");
		JMenuItem i4=new JMenuItem("save as");
		JMenuItem i5=new JMenuItem("exit");
		menu.add(i1);
		menu.add(i2);
		menu.add(i3);
		submenu.add(i4);	
		submenu.add(i5);
		menu.add(submenu);
		mb.add(menu);
	
		JMenu help=new JMenu("Help");
		mb.add(help);
		JMenuItem m1=new JMenuItem("view help");
		JMenuItem m2=new JMenuItem("about");
		JMenuItem m3=new JMenuItem("exit");
		help.add(m1);
		help.add(m2);
		help.add(m3);
		
		
		//panel
			
		Panel p=new Panel(new GridLayout(3,3));
		p.add(l1);
		p.add(t1);
		p.add(l2);
		p.add(t2);
		p.add(l3);
		p.add(t4);
		f.add(p);
		l1.setOpaque(true);
		l2.setOpaque(true);
		l1.setBackground(Color.black);
		l2.setBackground(Color.black);
		l1.setForeground(Color.red);
		l2.setForeground(Color.red);
		l3.setForeground(Color.red);
		p.setBounds(120,140,280,80);
		b1=new JButton("Submit");
		b1.setBounds(280,240,80,30);
		b1.setBackground(Color.black);
		b1.setForeground(Color.red);
		f.add(b1);
		b1.addActionListener(this);
	}
	       public void actionPerformed(ActionEvent e)
		{	
	
			
		String username=t1.getText();
		String password=t2.getText();

			if("gokul".equals(username)&&"952428".equals(password))
			{
		  JOptionPane.showMessageDialog(null,"welcome");
		}else
				{
		JOptionPane.showMessageDialog(null,"failed");
			} 
			
			
			new login();
				
				
		}

	
	
}
class demoswing4
{
	public static void main(String args[])
	{
		sample s=new sample();
	}
	
}


		