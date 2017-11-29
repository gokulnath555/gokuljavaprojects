import java.util.*;
class treeset
{
     TreeSet set=new TreeSet();
         public void display()
            {
	set.add("java");
	set.add("javascript");
	set.add("php");
	set.add("c");
            System.out.println(""+set.contains("c++"));
	
                System.out.println(""+ set.first());
	 System.out.println(""+ set.higher("c"));
	   int z=set.size();
	 System.out.println(""+ z);
	   Iterator itr=set.iterator();
	       while(itr.hasNext())
	          {
	             System.out.println(""+itr.next());
	          }
          }
}
class demotreeset
{
	public static void main(String args[])
	  {
	       treeset t=new treeset();
	          t.display();
	   }
}