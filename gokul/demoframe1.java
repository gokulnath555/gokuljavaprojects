import java.awt.*;
class sample extends Frame
{
      Label l1,l2;
      TextField t1,t2;
        sample()
          {
	 setLayout(null);
                  setVisible(true);
	 setSize(600,600); 
	 setResizable(false);
	 isResizable();
	 setTitle("login");

              
                 l1=new Label("UserName");
	l2=new Label("Password");
                 t1=new TextField();
	t2=new TextField();
                 
               Panel p=new Panel(new GridLayout(2,2));
	 p.add(l1);
	 p.add(t1);
	 p.add(l2);
	 p.add(t2);
                  
                  add(p);
	 p.setBounds(150,220,250,80);
	 setBackground(Color.pink);
           }
}
class demoframe1
{
          public static void main(String args[])
	{
	       sample obj=new sample();
	}
}
                   
