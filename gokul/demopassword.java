import javax.swing.*;
import java.awt.event.*;
class sample extends JFrame implements ActionListener
{
	
	sample()
	{
		final  JLabel label=new JLabel();
		 label.setBounds(20,150,200,50);
		 final JPasswordField value=new JPasswordField();
		value.setBounds(20,75,80,30);
		JLabel l1=new JLabel("username");
		l1.setBounds(20,20,80,30);
		JLabel l2=new JLabel("password");
		l2.setBounds(20,75,80,30);
		JButton b=new JButton("login");
		b.setBounds(100,120,80,30);
		final JTextField text=new JTextField();
		text.setBounds(100,20,100,30);
		add(value);
		add(l1);
		add(l2);
		add(label);
		add(b);
		add(text);
		setSize(300,300);
		setLayout(null);
		setVisible(true);
		b.addActionListener(this);
	}

		public void actionPerformed(ActionEvent e)
		       {
			String data="username"+text.getText();
			data +=",password"+ new String(value.getPassword());
			label.setText(data);
		       }

}
class demopassword
{
	public static void main(String args[])
	 {
		sample s=new sample();
	}
}


		