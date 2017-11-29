import pack.interface;
class interface2 extends interface
{
	public void show3()
	   {
	        System.out.println("interface");
	   }
}
class demopackinter
{
	public static void main(String args[])
	   {
	        interface2 obj=new interface2();
		obj.show3();
		obj.show1();
		obj.dispaly("gokul");
		obj.display2(22);
	  }
}
		