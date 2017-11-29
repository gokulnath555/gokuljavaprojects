class sample extends Thread
{
      Thread t=new Thread(this);
          public void run()
            {
                 for(int i=0;i<5;i++)
	  {
	      try{
	               System.out.println(""+i);
		 t.sleep(1000);
	           }catch(InterruptedException g){}
	  }
             }
}
class demothread9
{
	public static void main(String args[])
	   {	
	       sample t1=new sample();
	       sample t2=new sample();
	       sample t3=new sample();
	            t1.start();
	            t2.start();
	            t3.start();
	   }
}