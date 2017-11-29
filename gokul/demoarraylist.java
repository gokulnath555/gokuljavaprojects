import java.util.*;
class sample
{
        ArrayList <String>list=new ArrayList<String>();
           public void display()
               {
	   list.add("1");
	   list.add("2");
	   list.add("3"); 
           ArrayList<String>list1=new ArrayList<String>();
                     list1.add("gokul");
	    list1.add("salem");
	     list.addAll(list1);
               Iterator itr=list.iterator();
	  while(itr.hasNext())
	    {
	          System.out.println(itr.next());
	    }
             }
}
class demoarraylist
{
	public static void main(String args[])
	   {
	         sample obj=new sample();
	               obj.display();
	   }
}