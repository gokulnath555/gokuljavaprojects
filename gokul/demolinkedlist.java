import java.util.*;
class sample
{
         LinkedList l1=new LinkedList();
          public void display()
             {
	  l1.add("gokul");
	  l1.add("IT");
	  l1.add("salem");
	  l1.add("java");
	l1.getFirst();
	 System.out.println(""+l1);
	l1.getLast();
	System.out.println(""+l1);
	l1.add("php");
	System.out.println(""+l1);
	l1.remove(1);
	System.out.println(""+l1);
	l1.pop();
	System.out.println(""+l1);
	l1.peekFirst();
	System.out.println(""+l1);
	l1.peekLast();
	System.out.println(""+l1);
	l1.size();
	System.out.println(""+l1);
                 Iterator itr=l1.iterator();
	while(itr.hasNext())
	{
	   System.out.println(itr.next());
	}	
           }        
}
class demolinkedlist
{
	public static void main(String args[])
	  {
	       sample obj=new sample();
		obj.display();
	  }
}
	