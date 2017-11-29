class sample
{
	public void display(int a)
	  {
	       System.out.println(""+a);
	  }
             
}
class sample1 extends sample
{
	  public void display(int a)
	  {
	       System.out.println(""+a);
	  }
}
class demoover1
{
	public static void main(String args[])
	   {
	       sample ref ;
	        sample obj=new sample();
	        sample1 obj1=new sample1();
	   ref=obj;
                      obj.display(2);
	   ref=obj1;
	      obj1.display(2);
	}
}
	   
	
	
	     
