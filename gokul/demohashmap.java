import java.util.*;
class hashmap
{
       HashMap m=new HashMap();
	public void display()
	  {
	      m.put("java","2");
	      m.put("c","4");
	      m.put("javascript","6");
	      m.put("c++","7");
	System.out.println(""+m.replace("c","php"));
	 System.out.println("map elements");
	 System.out.println("\t"+m);
	
             }
}
class demohashmap
{
	public static void main(String args[])
	  {
	       hashmap h=new hashmap();
	          h.display();
	 }
}