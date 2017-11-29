abstract class sample
{
       public void show(String name)
         {
          System.out.println("student name"+name);
         }
      abstract public void mul(int x,int y);
      abstract public void div(int a,int b);
  }
class sample1 extends sample
{
     public void mul(int x,int y)
        {
            int tot=x*y;
            System.out.println("multiplication"+tot);
         }
     public void div(int a,int b)
       {
           int div=a/b;
           System.out.println("division"+div);
       }
}
class demoabs5
{
      public static void main(String args[])
        {
           sample1 obj=new sample1();
              obj.show("gokul");
              obj.mul(23,5);
              obj.div(34,6);
         }
}