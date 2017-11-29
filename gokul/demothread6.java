class sample extends Thread
{
	Thread t=new Thread(this);
	   sample()
	   {
	          t.start();
	   }
	  
}
	                 
class demothread6
{
	public static void main(String args[])
	  {
	       sample t1=new sample();
	       Thread t2=Thread.currentThread();
	          for(int i=0; i<10;i++)
	            {
		try{
		         System.out.println(""+i);
		               t2.sleep(1000);
		     }catch(InterruptedException j){}
	            }
                    }
}