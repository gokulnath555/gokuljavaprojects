import pack.abs;
class abs2 extends abs
{
	public void show2()
	   {
		System.out.println("abstract");
	    }
}
class demoabspack
{
	public static void main(String args[])
	    {
 		abs2 obj=new abs2();
		obj.show2();
		obj.display();
		obj.show("gokul");
		obj.show1(22);
	    }
}