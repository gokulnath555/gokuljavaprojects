class sample extends Thread
{
       Thread obj=new Thread(this);
          sample() 
            {
	obj.start();
            }
          public void run()
            {
	for(int i=0;i<5;i++)
	{
	    try{
	            System.out.println(i);
	                 obj.sleep(500);
	         }catch(InterruptedException g){}
	}
            }              
}
class demothread5
{
	public static void main(String args[])
	  {
	       sample obj2=new sample();
	              
	  }
}