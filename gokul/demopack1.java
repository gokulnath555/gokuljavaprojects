import pack.demosample;
class demosample1 extends demosample
{
	public void display()
	 {
           System.out.println("gokul");
	 }
}
class demopack1
{
	public static void main(String args[])
	{
	   demosample1 obj=new demosample1();
	    obj.display();
	    obj.get(32,5);
	}
}	