class sample extends Thread
{
     Thread t=new Thread(this);
        public void display()
           {
                System.out.println(""+t.getName()); 
                t.setName("gokul");
                System.out.println(""+t.getName());
                     for(int i=0;i<5;i++)
	       {
	           System.out.println(i);
		try{
		          t.sleep(2000);
		      }
                        }
            }
}
class demothread12
{
	public static void main(String args[])
	  {
	      sample obj=new sample();
	            obj.display();
	  }
}