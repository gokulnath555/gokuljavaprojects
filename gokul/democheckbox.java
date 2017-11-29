import java.awt.*;
class sample extends Frame
{
	sample()
	 {
	     	Checkbox c=new Checkbox("java");
		c.setBounds(100,100,50,50);
		Checkbox c1=new Checkbox("c++");
		c1.setBounds(160,100,50,50);
		Checkbox c2=new Checkbox("C",true);
		c2.setBounds(200,100,50,50);
		 add(c);
		add(c1);
		add(c2);
		setLayout(null);
		setSize(400,400);
		setVisible(true);
		
		
	 }
}
class democheckbox
{
	public static void main(String args[])
	  {
	        sample s=new sample();
	 }
}
		