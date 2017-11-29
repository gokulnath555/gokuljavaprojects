import java.io.*;
class student
{
	DataInputStream obj=new DataInputStream(System.in);
	int x;
	int y;
	String str;
	 student(int x,int y,String str)
	  {
		this.x=x;
		this.y=y;
		this.str=str;
	
		System.out.println("Enter the numbers");
		try{
		     x=Integer.valueOf(obj.readLine()).intValue();
		     y=Integer.valueOf(obj.readLine()).intValue();
		     str=obj.readLine();
		    }catch(IOException d){}
	  }
}
class student1 extends student
{
		 student1(int x,int y,String str)
			{
				super(x,y,str);
		            System.out.println("Enter the first num="+x);
		            System.out.println("Enter the second num="+y);
		            System.out.println("Enter the name="+str);
	                }


}
class demoio6
{
	public static void main(String args[])
	  {
		student1 obj1=new student1();
		
	  }
}