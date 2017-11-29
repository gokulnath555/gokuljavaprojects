class sample
{
	String str=new String("    gokul nath");

	public void display()
	    {
 		System.out.println(""+str.toUpperCase());
		System.out.println(""+str.toLowerCase());
		System.out.println(""+str.trim());
		int len=str.length();
		System.out.println(len);
		System.out.println(""+str.endsWith("h"));
		System.out.println("charater position="+str.charAt(12));
	    }
}
class demostring
{
	public static void main(String args[])
	{
		sample obj=new sample();
		 obj.display();
	}
}
