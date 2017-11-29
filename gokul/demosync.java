class sample
{
          synchronized public void call(String msg)
	 {
	      System.out.println(""+msg);
	         try{
		Thread.sleep(2000);
		 display();
	              }catch(InterruptedException j){}
	  }
	public void display()
	 {
	        for(int i=0;i<5;i++)
                            {
		System.out.print(i);
	           }
                   }

}
class sample1 extends Thread
{
         sample target;
         String msg;
         Thread t;
          sample1(sample tar,String s)
             {
	target=tar;
	msg=s;
	t = new Thread(this);
	t.start();
              }
         public void run()
            {
	target.call(msg);
	System.out.println("child"+getName());
	
             }
}
class demosync
{
	public static void main(String args[])
	  {
	        sample target=new sample();
	        sample1 obj=new sample1(target,"hello");
	        sample1 obj1=new sample1(target,"sync");
	        sample1 obj2=new sample1(target,"world");
	   }
}