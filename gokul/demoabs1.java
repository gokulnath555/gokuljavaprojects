abstract class sample
{
      public void sample(int a)
        {
           System.out.println("emp age is"+a);
        }
   abstract public void show(String name);
   abstract public void show1(int x,int y);
   abstract public void show2(double salary);
}
class sample1 extends sample
{
     public void show(String name)
       {
          System.out.println("emp name is"+name);
        }
     public void show1(int x,int y)
       {
           int sum=x+y;
         System.out.println("addtion"+sum);
       }
     public void show2(double salary)
       {
          System.out.println("emp salary is"+salary);
       }
}
class demoabs1
{
           public static void main(String args[])
           {

          sample1 obj=new sample1();
           obj.sample(22);
           obj.show("gokul");
           obj.show1(22,45);
           obj.show2(20000);
          }
}