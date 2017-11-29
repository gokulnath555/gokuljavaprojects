class sample1 extends Thread
{
	Thread obj=new Thread(this);
	int a;
	String str;
	double salary;
	sample1()
	   {
		int a=50;
		double salary=15000;
		String str=obj.getName();
	                System.out.println(""+a);
	                System.out.println(""+str);
	                System.out.println(""+salary);
		try{
		obj.sleep(500);
		}catch(InterruptedException d){}
	        
		  
	      }
}
class demothread1
{
	public static void main(String args[])
	   {
		sample1 obj1=new sample1();
		Thread obj2=Thread.currentThread();
		  int y=10;
		  System.out.println(""+y);
		  try{
			obj2.sleep(2000);
		        }catch(InterruptedException f){}
	  
	    }
}