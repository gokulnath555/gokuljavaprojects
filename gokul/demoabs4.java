abstract class sample
{
    sample(String str)
        {
          System.out.println("student name is"+str);
        }
    abstract public void show(int x,int y);
    abstract public void show1(double salary);
}
class sample1 extends sample
{
    sample1()
      {
        super("gokul");
      }
     public void show(int x,int y)
      {
           int tot=x*y;
        System.out.println("to multiply the value"+tot);
      }
     public void show1(double salary)
       {
       System.out.println("student salary"+salary);
       }
}
class demoabs4
{
     public static void main(String args[])
        {
           sample1 obj=new sample1();
              obj.show(23,45);
              obj.show1(25000);
        }
}