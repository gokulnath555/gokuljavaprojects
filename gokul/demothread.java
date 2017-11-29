class  sample extends Thread
{
  	Thread obj=new Thread(this);
	   sample()
	   {
	       String str=obj.getName();
	     System.out.println(""+str);
                                for(int i=0;i<=10;i++)
		{
		try{
		     System.out.println(""+i);
			obj.sleep(500);
		     }catch(InterruptedException d){}
		}
	   }
}
class demothread
{
	public static void main(String args[])
	   {
		sample obj1=new sample();
		Thread obj2=Thread.currentThread();
		System.out.println(""+obj2.getName());
		obj2.setName("gokul");
		System.out.println(""+obj2.getName());
		  for(int i=0;i<=10;i++)
		{
		try{
		     System.out.println(""+i);
			Thread.sleep(1000);
		     }catch(InterruptedException d1){}
		}
		       
	   }
}