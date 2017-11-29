class sample implements Runnable
{
    Thread t=new Thread(this);
        sample()
          {
	t.start();
          }
         public void run()
          {
                System.out.println(""+t.getName());
	t.setName("gokul");
                System.out.println(""+t.getName());
                System.out.println(""+t.getPriority());
	 for(int i=0;i<10;i++)
	   {
	        try{
	                 System.out.println("child thread="+i);
	                      t.sleep(500);
	             }catch(InterruptedException h){}
	   }
            }
}  
class demothread10
{
	public static void main(String args[])
	 {
	      sample obj=new sample();
	      Thread t=Thread.currentThread();
		 for(int i=0;i<5;i++)
	            	 {
	          	         try{
	                                     System.out.println("main thread="+i);
	                                     t.sleep(1000);
	                               }catch(InterruptedException h){}
	                }
	       		  t.setPriority(Thread.MIN_PRIORITY+1);
	       		  System.out.println("thread priority="+t.getPriority());
	            		  System.out.println("alives="+t.isAlive());
	                		 t.stop();
		
	 }
}
         
	 /*Thread methods
                           extends Thread
	          implements Runnable
		start();
		run();
		sleep();
		stop();
		       setName();
	                        getName();
		       setPriority(Thread.MAX_PRIORITY);
	                        setPriority(Thread.MIN_PRIORITY);
	                        setPriority(Thread.NORM_PRIORITY);
		       getPriority();
		       isAlive();*/


		