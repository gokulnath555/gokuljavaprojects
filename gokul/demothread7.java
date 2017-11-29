class samp
{
       public void show(int a)
          {
	System.out.println("age is"+a);
          }
}
class sample extends samp implements Runnable
{
          Thread t=new Thread(this);
	sample()
	{
	     t.start();
	}
          public void run()
            {
	for(int i=0;i<5;i++)
               try{
	      System.out.println(""+i);
                           t.sleep(500);
                    }catch(InterruptedException h){}
             }
}
class demothread7
{
	public static void main(String args[])
	   {
                      sample obj1=new sample();
	          obj1.show(22);
	   }
}
