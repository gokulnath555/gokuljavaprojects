import pack.sample4;
class sample5 extends sample4
{
	public void show()
	{
           System.out.println("inside");
        }
}
class demopack5
{
	public static void main(String args[])
	  {
		sample5 obj=new sample5();
		  obj.show();
		  obj.display(22);
	  }
}