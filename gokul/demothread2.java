class sample extends Thread
{
	Thread obj=new Thread(this);
	int a,b;
	String str;
	public void display(int a,int b,String str)
	   {
		this.a=a;
		this.b=b;
		this.str=str;
	 	int z=a+b;
		System.out.println(""+z);
	                 System.out.println(""+str);
	          try{
		obj.sleep(2000);
		}catch(InterruptedException f){}
		
	   }
	               public void show(int a,int b,String str)
		{
		       int w=a*b;
		      System.out.println(""+w);
		      System.out.println(""+str);
		     try{
			obj.sleep(3000);
		          }catch(InterruptedException g){}
		}
		
}
class demothread2
{
	public static void main(String args[])
	  {
		sample obj1=new sample();
		   obj1.display(11,22,"gokul");
	                   obj1.show(24,5,"nath");
	  }
}
	           