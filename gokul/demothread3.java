class sample extends Thread
{
	Thread obj=new Thread(this);
	int x;
	public void display(int x)
	  {
    		System.out.println(""+x);
	                        for(int i=0;i<10;i++)
		         {
		                try{
			       System.out.println(""+i);
			             obj.sleep(1000);
			     }catch(InterruptedException g){}
		         }
                   }
}
class demothread3
{
	public static void main(String args[])
	   {
		sample obj1=new sample(); 	
		    obj1.display(2);
	   }
} 	