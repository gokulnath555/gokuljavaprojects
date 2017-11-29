import java.awt.*;
class sample extends Frame
{
      Label l1,l2,l3,l4,l5,l6,l7;
      TextField t1,t2,t3,t4,t5,t6;
      Button b1,b2;
          sample()
            {
	setLayout(null);
	setVisible(true);
	setSize(600,600);
	setTitle("Sona College of Technology");
	setResizable(false);
	isResizable();
                 
                 l1=new Label("Name");
	l2=new Label("Roll No");
	l3=new Label("Dept");
	l4=new Label("Address");
	l5=new Label("Father Name");
	l6=new Label("Mobile Num");
                 l7=new Label("Student Details");
	l7.setBounds(220,40,100,40);
	add(l7);
	l7.setBackground(Color.pink);

	t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	t4=new TextField();
	t5=new TextField();
	t6=new TextField();
                 
                 Panel p=new Panel(new GridLayout(6,6));
	   p.add(l1);
	   p.add(t1);
	   p.add(l2);
	   p.add(t2);
	   p.add(l3);
	   p.add(t3);
	   p.add(l4);
	   p.add(t4);
	   p.add(l5);
	   p.add(t5);
	   p.add(l6);
	   p.add(t6);
                    add(p);
	   p.setBounds(120,100,320,200);
	
	       
	        b1=new Button("submit");
	        b2=new Button("Exit");
	           add(b1);
	           add(b2);
	      // Panel p1=new Panel(new GridLayout(1,1));
		//p1.add(b1);
		//p1.add(b2);
		//add(p1);
	         b1.setBounds(180,310,110,40);   
	         b2.setBounds(300,310,110,40);
	        b1.setBackground(Color.cyan);
	        b2.setBackground(Color.cyan);
	   
                      setBackground(Color.yellow);
                      l1.setBackground(Color.yellow);
	    l2.setBackground(Color.yellow);
	    l3.setBackground(Color.yellow);
	    l4.setBackground(Color.yellow);
	   l5.setBackground(Color.yellow);
	   l6.setBackground(Color.yellow);
	  
 	    t1.setBackground(Color.cyan);
	    t2.setBackground(Color.cyan);
	    t3.setBackground(Color.cyan);
	    t4.setBackground(Color.cyan);
	   t5.setBackground(Color.cyan);
	   t6.setBackground(Color.cyan);
	   
             }
}
class demoframe3
{
	public static void main(String args[])
	  {
	       sample s=new sample();
	   }
}