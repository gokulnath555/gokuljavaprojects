final class sample
{
       String str;
       int x;
     public void show(String str)
       {
          System.out.println("name is"+str);
        }
}
class sample1 extends sample
{
   public void show1(int x)
      {
         System.out.println("num is"+x);
       }
}
class demofinal
{
         public static void main (String args[])
            {
               sample1 obj=new sample1();
                  obj.show("gokul");
                  obj.show1(22);
            }
}