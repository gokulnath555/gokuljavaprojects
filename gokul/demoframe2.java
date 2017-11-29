import java.awt.*;
class sample extends Frame
{
     Label l1,l2,l3,l4,l5;
     TextField t1,t2,t3,t4,t5;
    sample()
       {
	setLayout(null);
	setVisible(true);
	setSize(400,400);
	setResizable(false);
	isResizable();
	setTitle("Registration");
                 
	l1=new Label("First Name");
	l2=new Label("Last Name");
	l3=new Label("Address");
	l4=new Label("City");
	l5=new Label("State");
	
                 t1=new TextField();
	t2=new TextField();
	t3=new TextField();
	t4=new TextField();
	t5=new TextField();

                Panel p =new Panel(new GridLayout(5,5));
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
   
                   add(p);
	 p.setBounds(80,140,225,120);
	 setBackground(Color.cyan);
            }
}
class demoframe2
{
	public static void main(String args[])
	  {
	        sample obj=new sample();
	   }
}