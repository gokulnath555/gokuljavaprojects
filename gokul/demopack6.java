import pack.samp3;
interface one
{
	public void display(int x,int y);
	           
}
class samp1 extends samp3 implements one
{
	public void add()
	 {
 	    System.out.println("outside");
	 }
}
class demopack6
{
	public static void main(String args[])
	  {
 		samp1 obj=new samp1();
		 obj.add();
		 obj.display(22,3);
		 obj.show("gokul");
		 obj.get();
	  }
}
