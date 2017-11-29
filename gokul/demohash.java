import java.util.*;
class hashset
{
     HashSet set=new HashSet();
            public void display()
	{
	        set.add("java");
	        set.add("python");
	        set.add("javascript");
	        set.add("php");
	        
                         set.add("java");
	        System.out.println(""+set.contains("struts"));
	          set.clear();
                          Iterator itr=set.iterator();
	             while(itr.hasNext())
		{
		   System.out.println(""+itr.next());
                                   }
                 }
}
class demohash
{
               public static void main(String args[])
	{
	      hashset obj=new hashset();
	         obj.display();
	}
}
  