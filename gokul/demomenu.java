import java.awt.*;
import java.awt.event.*;
class menu extends Frame implements ActionListener
{
	MenuBar mb;
	Menu menu;
	Menu submenu;
	MenuItem i1;
	menu()
	 {
		mb=new MenuBar();
		menu=new Menu("Menu");
		submenu=new Menu("Sub Menu");
		 i1=new MenuItem("new");
		MenuItem i2=new MenuItem("open");
		MenuItem i3=new MenuItem("save");
		MenuItem i4=new MenuItem("save as");
		MenuItem i5=new MenuItem("exit");
		   menu.add(i1);
		   menu.add(i2);
		   menu.add(i3);
		   submenu.add(i4);
		   submenu.add(i5);
	                     menu.add(submenu);
		    mb.add(menu);
		    setMenuBar(mb);
		    setSize(400,400);
		    setLayout(null);
		    setVisible(true);
		i1.addActionListener(this);
	 }
	              public void actionPerformed(ActionEvent e)
		{
		 	if(e.getActionCommand().equals("new"))
			     {
				System.out.println("clicked new");
				new demomenu2();
			

			  }

		}
}
class demomenu
{
	public static void main(String args[])
	 {
		menu m=new menu();
	 }
}
	                      
		 
		