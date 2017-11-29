import javax.swing.*;
class sample extends JFrame
{
	JButton b1;
	sample()
	{
		setVisible(true);
		setLayout(null);
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1=new JButton(new ImageIcon("E:\\register.png"));
		b1.setBounds(160,300,520,60);
		add(b1);
	 }
}
class demoswing2
{
	public static void main(String args[])
	 {
		sample s=new sample();
	 }
}