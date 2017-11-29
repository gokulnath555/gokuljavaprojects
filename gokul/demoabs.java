abstract class sample
{
   public void sample(String str)
     {
          System.out.println("emp name is"+str);
      }
   abstract public void display(int  x);
   abstract public void display1(int y);
   abstract public void display2(int z);
}
class sample1 extends sample
{
    public void display(int x)
   {
    System.out.println("age"+x);
   }
    public void display1(int y){}
    public void display2(int z)
   {
     System.out.println("roll no"+z);
   }
}
class demoabs
{
   public static void main(String args[])
     {
          sample1 obj=new sample1();
           obj.sample("gokul");
           obj.display(22);
           obj.display2(4);
      }
}
    
    
    
 