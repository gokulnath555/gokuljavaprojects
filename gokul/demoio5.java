import java.io.*;
class sample
{
	DataInputStream obj=new DataInputStream(System.in);
	String str,str1,str2;
	int x,y,w;
	double z;

	public void display()
	  {
		this.str=str;
		this.str1=str1;
		this.str2=str2;
		this.x=x;
		this.y=y;
		this.z=z;
		this.w=w;
	
		System.out.println("Enter the employee details");
	         try{
		 str =obj.readLine();
		 x=Integer.valueOf(obj.readLine()).intValue();
		 y=Integer.valueOf(obj.readLine()).intValue();
		 z=Double.valueOf(obj.readLine()).doubleValue();
		 str1=obj.readLine();
		 str2=obj.readLine(); 
		 w=Integer.valueOf(obj.readLine()).intValue();
                                 }catch(IOException d){}
	}

	public void display1()
	   {
		System.out.println("Employee name is="+str);
		System.out.println("Employee id is="+x);
		System.out.println("Employee age is="+y);
		System.out.println("Employee salary is="+z);
		System.out.println("Employee city is="+str1);
		System.out.println("Employee state is ="+str2);
		System.out.println("Employee pincode is="+w);
		
	   }
		
		
}
class demoio5
{
	public static void main(String args[])
	    {
		sample obj1=new sample();
		    obj1.display();
		    obj1.display1();
	    }
}
	
		