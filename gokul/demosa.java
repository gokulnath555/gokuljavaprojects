import java.awt.*;
import java.awt.event.*;


class sample extends Frame implements ItemListener,ActionListener
{
	MenuBar m;
	Choice ch;
	Menu m0,m9;
	MenuItem m1,m2,m3,m4,m5,m6,m7,m8;
  sample()
     {
	setLayout(null);
	setVisible(true);
	setSize(500,500);
	ch=new Choice();
	ch.add("JAVA");
	ch.add("SERVLET");
	ch.add("jsp");
	ch.add("struts");
	ch.add("Hibernate");
	ch.add("Spring MVC");
	add(ch);
	ch.setBounds(100,120,120,90);
	ch.addItemListener(this);
	m=new MenuBar();
	m0=new Menu("Admin");
	MenuItem m1=new MenuItem("Registration");
 	MenuItem m2=new MenuItem("Payment");
	MenuItem m3=new MenuItem("Items");
	MenuItem m4=new MenuItem("Exit");
	m0.add(m1);
	m0.add(m1);
	m0.add(m1);
	m0.add(m1);

	m9=new Menu("USER");
	MenuItem m5=new MenuItem("Admission");
	MenuItem m6=new MenuItem("Course");
	MenuItem m7=new MenuItem("Insitute");
	MenuItem m8=new MenuItem("Exit");
	m9.add(m5);
	m9.add(m6);
	m9.add(m7);
	m9.add(m8);
	m.add(m0);
	m.add(m9);
	setMenuBar(m);
	m4.addActionListener(this);
	m1.addActionListener(this);
       }
  public void itemStateChanged(ItemEvent d)
     {
     System.out.println(""+ch.getSelectedItem());
      }
  public void actionPerformed(ActionEvent h)
   {
     if(h.getActionCommend().equals("Exit"))
      {
	System.exit(0);
       }
     if(h.getActionCommend().equals("Registration"))
      {
        new sample();
        }
    }
}
class demosa
{
  public static void main(String []ar)
    {
    sample s=new sample();
    }
}