import pack.sample;
class sample1 extends sample
{
	public void display()
         {
 	   System.out.println("local");
	 }
}
class demopack
{
	public static void main(String args[])
	 {
		sample1 obj=new sample1();
		 obj.display();
		 obj.get(234,6);
	}
}