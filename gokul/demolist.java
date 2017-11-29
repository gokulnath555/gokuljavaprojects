import java.awt.*;
class sample extends Frame
{
	sample()
	{
	      List l1=new List(5);
	      l1.setBounds(100,100,75,75);
	         l1.add("java");
	         l1.add("c");
	         l1.add("c++");
	         l1.add("python");
	         l1.add(".net");
	         add(l1);
	         setLayout(null);	
                          setVisible(true);
	         setSize(400,400);
	}
}
class demolist
{
	public static void main(String args[])
	   {
		sample s=new sample();
	  }
}