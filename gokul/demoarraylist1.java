import java.util.*;
class sample
{
       ArrayList <String>list=new ArrayList<String>();
        public void display()
           {
                list.add("gokul");
                list.add("sona");
                list.add("IT");
            ArrayList<String>list1=new ArrayList<String>();
                  list1.add("1");
                  list1.add("2");
	 list1.add("3");
 	  list.addAll(list1);
               Iterator itr=list.iterator();
	 while(itr.hasNext())
	  {
	      System.out.println(itr.next());
	 }
         }
}
class demoarraylist1
{
      public static void main(String args[])
         {
             sample obj=new sample();
	obj.display();
         }
}