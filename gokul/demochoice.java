import java.awt.*;
class sample extends Frame
{
	
	Button b;
	sample()
	{
		Choice c=new Choice();
		c.setBounds(100,100,75,75);
		c.add("item1");
		c.add("item2");
		c.add("item3");
		c.add("item4");
		add(c);
		setLayout(null);
		setVisible(true);
		setSize(400,400);
		b=new Button("submit");
		 add(b);
		b.setBounds(100,160,100,40);
		b.setBackground(Color.cyan);
		b.setForeground(Color.red);
		setBackground(Color.orange);
	
		

	 }
}
class demochoice
{
	public static void main(String args[])
	  {
		sample s=new sample();
	 }
}