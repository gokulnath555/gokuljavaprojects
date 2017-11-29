class sample extends Thread
{
	Thread obj=new Thread(this);
	int a;
	String str;
	sample(int a,String str)
	   {
	  	obj.start();
	                   System.out.println(""+a);
		  System.out.println(""+str);
	                      for(int i=0; i<5;i++)
		        {
		            try{
			  System.out.println(""+i);
			      obj.run();
			}catch(InterruptedException g){}
		        }
                     }
}
class demothread4
{
	public static void main(String args[])
	  {
		sample obj1=new sample(22,"gokul");
	  }
}
		        