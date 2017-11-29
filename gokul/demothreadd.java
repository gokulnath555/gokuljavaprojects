class sample implements Runnable
{
     Thread t=new Thread(this);
       sample()
          {
	t.start();
           }
      public void run()
         {
                 t.setName("child");
	System.out.println(""+t.getName());
	System.out.println(""+t.getPriority());
	 t.setPriority(Thread.MIN_PRIORITY+1);
	System.out.println("alives="+t.isAlive());
           }
}
class demothreadd
{
	public static void main(String args[])
	  {
	           sample obj=new sample();
                               Thread t1=Thread.currentThread();
		System.out.println(""+t1.getName());
                     }
}