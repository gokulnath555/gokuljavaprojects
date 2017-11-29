import java.io.*;
class show
{
	DataInputStream obj=new DataInputStream(System.in);
	int a,b;
	String str;
	    show(String str)
	  {
		System.out.println("Enter the numbers");
		try{
			int a=Integer.valueOf(obj.readLine()).intValue();
			int b=Integer.valueOf(obj.readLine()).intValue();
			int tot=a*b;
			System.out.println("mul the num is"+tot);
			
		   }catch(IOException d){}
		
	 }
}
class show1 extends show
{
	show1(String str)
	{
		super(str);
	 System.out.println("name is");
	    try{
		 str=obj.readLine();	
		}catch(IOException d){}
	}
	
}
class demoinherio
{
	public static void main(String args[])
	  {
		show1 obj1=new show1("gokul");
		
		
	 }
}