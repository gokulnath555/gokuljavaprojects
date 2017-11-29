import pack.intersamp;
class intersamp2 extends intersamp
{
	public void show1()
	  {
	         System.out.println("interface package");
	  }
}
class demointerfacepack
{
	public static void main(String args[])
	  {
		intersamp2 obj=new intersamp2();
		 obj.show1();
		 obj.show();
		 obj.display();
		 obj.get(22);
		obj.get1("gokul");
	 }
}
		 
		