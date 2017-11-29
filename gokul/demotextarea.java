import java.awt.*;
class sample extends Frame
{
	
     sample()
        {
	TextArea A=new TextArea("welcome to java");
	     A.setBounds(40,30,300,300);
	         add(A);
	          setSize(400,400);
	          setLayout(null);
	          setTitle("Java");
	          setVisible(true);
	          setResizable(false);
	          isResizable();
	          setBackground(Color.cyan);
	          A.setBackground(Color.yellow);
	          A.setForeground(Color.blue);
	            add(A);
	   
	         	      
	
	          
           }
}
class demotextarea
{
	public static void main(String args[]) 
	  {
	          sample obj=new sample();
	 }
}

